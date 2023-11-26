package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import database.JDBCmySQL;
import dto.CategoryDTO;
import dto.WarrantyDTO;

public class WarrantyDAO implements DAOInterface<WarrantyDTO>{

	public static WarrantyDAO getInstance() {
		return new WarrantyDAO();
	}
	@Override
	public int insert(WarrantyDTO t) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			Connection con = (Connection) JDBCmySQL.getConnection();
			String sql = "INSERT INTO `warranty` (`warrantyId`, `customerId`, `productName`, "
					+ "`dateReceived`, `dateReturned`, `warrantyStatusId`, `warrantyFee`, `warrantyDescription` "
					+ "VALUES (?,?,?,?.?,?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, t.getCustomerId());
			pst.setString(2, t.getProductName());
			pst.setDate(3, t.getDateReceived());
			pst.setDate(4, t.getDateReturned());
			pst.setDouble(5, t.getWarrantyFee());
			pst.setInt(6, t.getWarrantyStatusId());
			pst.setString(7, t.getWarrantyDescription());
			result = pst.executeUpdate();
			JDBCmySQL.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, e);
		}
		return result;
	}

	@Override
	public int update(WarrantyDTO t) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			Connection con = JDBCmySQL.getConnection();
			String sql = "UPDATE `warranty` SET`customerId`=? , `productName`=? , `dateReceived`=?, `dateReturned`=?, `warrantyFee`=?, "
					+ "`warrantyStatusId`=? , `warrantyDesciption`=? WHERE `warrantyId`=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, t.getCustomerId());
			pst.setString(2, t.getProductName());
			pst.setDate(3, t.getDateReceived());
			pst.setDate(4, t.getDateReturned());
			pst.setDouble(5, t.getWarrantyFee());
			pst.setInt(6, t.getWarrantyStatusId());
			pst.setString(7, t.getWarrantyDescription());
			pst.setInt(8, t.getWarrantyId());
			result = pst.executeUpdate();
			JDBCmySQL.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, e);
		}
		return 0;
	}

	@Override
	public int delete(String t) {
		// TODO Auto-generated method stub
		 int result=0;
		 try {
			Connection con = JDBCmySQL.getConnection();
			String sql = "UPDATE `warranty` SET `deleteStatus` = 0 WHERE `warrantyId`= ?";
			PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
			JDBCmySQL.closeConnection(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, e);
		}
		 return result;
	}

	@Override
	public ArrayList<WarrantyDTO> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<WarrantyDTO> result = new ArrayList<WarrantyDTO>();
		try {
			Connection c = JDBCmySQL.getConnection();
			String sql = "SELECT * FROM warranty WHERE `deleteStatus`=1";
			PreparedStatement pst = c.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
	            int warrantyId = rs.getInt("warrantyId");
	            int customerId = rs.getInt("customerId");
	            String ProductName = rs.getString("productName");
	            Date dateReceived = rs.getDate("dateReceived");
	            Date dateReturned = rs.getDate("dateReturned");
	            Double warrantyFee = rs.getDouble("warrantyFee");
	            int warrantyStatusId = rs.getInt("warrantyStatusId");
	            String warrantyDescription = rs.getString("warrantyDescription");
	            WarrantyDTO lh = new WarrantyDTO(warrantyId, customerId, ProductName, dateReceived, dateReturned, warrantyFee, warrantyStatusId, warrantyDescription);
	            result.add(lh);
            }
			JDBCmySQL.closeConnection(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, e);
		}
		return result;
	}

	@Override
	public WarrantyDTO selectById(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<WarrantyDTO> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public int getAutoIncrement() {
        int result = -1;
        try {
            Connection con = JDBCmySQL.getConnection();
            String sql = "SELECT `AUTO_INCREMENT` FROM  INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'phone' AND   TABLE_NAME   = 'warranty'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs2 = pst.executeQuery(sql);
            if (!rs2.isBeforeFirst() ) {
                System.out.println("No data");
            } else {
                while ( rs2.next() ) {
                    result = rs2.getInt("AUTO_INCREMENT");
                    
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
	
}
