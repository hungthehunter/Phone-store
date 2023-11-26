package dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.cj.result.Row;

import database.JDBCmySQL;
import dto.SupplierDTO;

public class SupplierDAO implements DAOInterface<SupplierDTO>{
	
	public static SupplierDAO getInstance() {
		return new SupplierDAO();
	}
	

	@Override
	public int insert(SupplierDTO t) {
		int result = 0;
		try {
			Connection con = JDBCmySQL.getConnection();
			String sql = "INSERT INTO `supplier`(`supplierName` , `supplierPhone` , `supplierAddress` , `email` , `note`) "
					+ "VALUES (?,?,?,?,?)";
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
			pst.setString(1, t.getSupplierName());
			pst.setString(2, t.getPhone());
			pst.setString(3, t.getAddress());
			pst.setString(4, t.getEmail());
			pst.setString(5, t.getNote());
			result = pst.executeUpdate();
			JDBCmySQL.closeConnection(con);
		} catch (SQLException ex) {
            Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
		return result;
	}

	@Override
	public int update(SupplierDTO t) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			Connection con = JDBCmySQL.getConnection();
            String sql = "UPDATE `supplier` SET `supplierName`=? , `supplierPhone`=? , `supplierAddress`=? , `email`=? , `note`=?"
            		+ " WHERE `supplierId`=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getSupplierName());
			pst.setString(2, t.getPhone());
			pst.setString(3, t.getAddress());
			pst.setString(4, t.getEmail());
			pst.setString(5, t.getNote());
			pst.setInt(6, t.getSupplierId());
			result = pst.executeUpdate();
			JDBCmySQL.closeConnection(con);
		}catch (SQLException ex) {
            Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
		return result;
	}

	@Override
	public int delete(String t) {
		  int result = 0 ;
	        try {
	            Connection con = JDBCmySQL.getConnection();
	            String sql = "UPDATE `supplier` SET `deleteStatus` = 0 WHERE `supplierId`= ?";
	            PreparedStatement pst = con.prepareStatement(sql);
	            pst.setString(1, t);
	            result = pst.executeUpdate();
	            JDBCmySQL.closeConnection(con);
	        } catch (SQLException ex) {
	            Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return result;
	}

	@Override
	public ArrayList<SupplierDTO> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<SupplierDTO> result = new ArrayList<SupplierDTO>();
        try {
            Connection con = JDBCmySQL.getConnection();
            String sql = "SELECT * FROM supplier WHERE `deleteStatus`=1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                int supplierId = rs.getInt("supplierId");
                String supplierName = rs.getString("supplierName");
                String supplierPhone = rs.getString("supplierPhone");
                String supplierAddress = rs.getString("supplierAddress");
                String email = rs.getString("email");
                String note = rs.getString("note");
                SupplierDTO lh = new SupplierDTO(supplierId, supplierName, supplierPhone, supplierAddress, email, note);
                result.add(lh);
            }
            JDBCmySQL.closeConnection(con);
        } catch (SQLException ex) {
           
        }
        return result;
	}

	@Override
	public SupplierDTO selectById(String t) {
		// TODO Auto-generated method stub
		SupplierDTO result = null;
		try {
			Connection con = JDBCmySQL.getConnection();
			String sql = "SELECT * FROM supplier WHERE supplierId=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t);
			ResultSet rs = pst.executeQuery();
            while(rs.next()){
                int supplierId = rs.getInt("supplierId");
                String supplierName = rs.getString("supplierName");
                String supplierPhone = rs.getString("supplierPhone");
                String supplierAddress = rs.getString("supplierAddress");
                String email = rs.getString("email");
                String note = rs.getString("note");
                result = new SupplierDTO(supplierId, supplierName, supplierPhone, supplierAddress, email, note);
            }
            JDBCmySQL.closeConnection(con);
		} catch (SQLException ex) {
            
        }
		return null;
	}

	@Override
	public ArrayList<SupplierDTO> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAutoIncrement() {
		// TODO Auto-generated method stub
		int result = -1;
		try {
			Connection con = JDBCmySQL.getConnection();
			String sql = "SELECT `AUTO_INCREMENT` FROM  INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'phone' AND   TABLE_NAME   = 'supplier'";
			PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs2 = pst.executeQuery(sql);
            if(!rs2.isBeforeFirst()) {
            	System.out.println("No data");
            } else {
            	  while ( rs2.next() ) {
                      result = rs2.getInt("AUTO_INCREMENT");
                      
                  }
            }
		} catch (SQLException ex) {
            Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
		return result;
	}

	public void importDatabase(FileInputStream inputStream){
		int batchSize = 20;
		try {
			
			Connection con = JDBCmySQL.getConnection();
			
			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet firstSheet = workbook.getSheetAt(0);
			Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = firstSheet.iterator();
			 
			String sql = "INSERT INTO `supplier`(`supplierName` , `supplierPhone` , `supplierAddress` , `email` , `note`) "
					+ "VALUES (?,?,?,?,?)";
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
			
			int count = 0;
			
			rowIterator.next(); // skip the header row
			rowIterator.next(); // skip the header row
			
			while(rowIterator.hasNext()) {
				org.apache.poi.ss.usermodel.Row nextRow =  rowIterator.next();
                Iterator<Cell> cellIterator = ((org.apache.poi.ss.usermodel.Row) nextRow).cellIterator();
 
                while (cellIterator.hasNext()) {
                	SupplierDTO s = new SupplierDTO();
                    Cell cell = cellIterator.next();
                    int columnIndex = cell.getColumnIndex();
                    
                    switch (columnIndex) {
                    case 1:
                        String supplierName = cell.getStringCellValue();
                        pst.setString(1, supplierName);
                    case 2:
                        String supplierPhone = cell.getStringCellValue();
                        pst.setString(2, supplierPhone);
                    case 3:
                        String supplierAddress = cell.getStringCellValue();
                        pst.setString(3, supplierAddress);
                    case 4:
                        String email = cell.getStringCellValue();
                        pst.setString(4, email);
                    case 5:
                    	 String note = cell.getStringCellValue();
                         pst.setString(5, note);  
                    }
                }
                pst.addBatch();
                
                if (++count % batchSize == 0) {
                	pst.executeBatch();
                }   
			}
			workbook.close();
            // execute the remaining queries
			pst.executeBatch();
			
			JDBCmySQL.closeConnection(con);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Khong doc duoc file");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Loi du lieu");
			e.printStackTrace();
		}
	}

}
