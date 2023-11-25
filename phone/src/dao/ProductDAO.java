package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import bus.CategoryBUS;
import database.JDBCmySQL;
import dto.ProductDTO;

public class ProductDAO implements DAOInterface<ProductDTO>{
	public static ProductDAO getInstance() {
		return new ProductDAO();
	}
	@Override
	public int insert(ProductDTO t) {
//		// TODO Auto-generated method stub
		int result = 0;
		try {
			Connection con = (Connection) JDBCmySQL.getConnection();
			String sql = "INSERT INTO `product`(`productId`, `productName`, `categoryName`, `purchasePrice`, `sellingPrice`, `quantity`, `imgURL`, `description`) VALUES (?,?,?,?,?,?,?,?)";
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
			pst.setInt(1, t.getProductId());
			pst.setString(2, t.getProductName());
			pst.setString(3, t.getCategoryName());
			pst.setDouble(4, t.getPurchasePrice());
			pst.setDouble(5, t.getSellingPrice());
			pst.setInt(6, t.getQuantity());
			pst.setString(7, t.getImgURL());
			pst.setString(8, t.getDescription());			
			result = pst.executeUpdate();
			JDBCmySQL.closeConnection(con);
		} catch(SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		return result;		
	}

	@Override
	public int update(ProductDTO t) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			Connection con = (Connection) JDBCmySQL.getConnection();
			String sql = "UPDATE `product` SET `productName`=?, `categoryName`=?, `purchasePrice`=?, `sellingPrice`=?, `quantity`=?, `imgURL`=?, `description`=? WHERE `productId`=?";
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
			pst.setString(1, t.getProductName());
			pst.setString(2, t.getCategoryName());
			pst.setDouble(3, t.getPurchasePrice());
			pst.setDouble(4, t.getSellingPrice());
			pst.setInt(5, t.getQuantity());
			pst.setString(6, t.getImgURL());
			pst.setString(7, t.getDescription());			
            pst.setInt(8, t.getProductId());
			result = pst.executeUpdate();
			JDBCmySQL.closeConnection(con);
		} catch(SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		return result;	
	}

	@Override
	public int delete(String t) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			Connection con = (Connection) JDBCmySQL.getConnection();
            String sql = "UPDATE `product` SET `status` = 0 WHERE `productId`= ?";
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
			pst.setString(1, t);		
			result = pst.executeUpdate();
			JDBCmySQL.closeConnection(con);
		} catch(SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		return result;
	}

	@Override
	public ArrayList<ProductDTO> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<ProductDTO> result = new ArrayList<ProductDTO>();		
		try {
            Connection con = (Connection) JDBCmySQL.getConnection();
            String sql = "SELECT * FROM product WHERE `status`=1";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            while(rs.next()) {
            	int productId = rs.getInt("productId");
            	String productName = rs.getString("productName");
            	String categoryName = rs.getString("categoryName");
            	double purchasePrice = rs.getDouble("purchasePrice");
            	double sellingPrice = rs.getDouble("sellingPrice");
            	int quantity = rs.getInt("quantity");
            	String imgURL = rs.getString("imgURL");
            	String description = rs.getString("description");
            	
            	
            	ProductDTO product = new ProductDTO(productId, productName, categoryName, purchasePrice, sellingPrice, quantity, imgURL, description);
            	result.add(product);
            	
            }
		} catch (Exception e) {
			
		}
		return result;
	}

	@Override
	public ProductDTO selectById(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ProductDTO> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAutoIncrement() {
		// TODO Auto-generated method stub
        int result = -1;
        try {
            Connection con = (Connection) JDBCmySQL.getConnection();
            String sql = "SELECT `AUTO_INCREMENT` FROM  INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'phone' AND   TABLE_NAME   = 'product'";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs2 = pst.executeQuery(sql);
            if (!rs2.isBeforeFirst() ) {
                System.out.println("No data");
            } else {
                while ( rs2.next() ) {
                    result = rs2.getInt("AUTO_INCREMENT");
                    
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
	}
	
	@Override
	public ArrayList<ProductDTO> selectAllDelete() {
		// TODO Auto-generated method stub
		ArrayList<ProductDTO> result = new ArrayList<ProductDTO>();		
		try {
            Connection con = (Connection) JDBCmySQL.getConnection();
            String sql = "SELECT * FROM product WHERE `status`=0";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            while(rs.next()) {
            	int productId = rs.getInt("productId");
            	String productName = rs.getString("productName");
            	String categoryName = rs.getString("categoryName");
            	double purchasePrice = rs.getDouble("purchasePrice");
            	double sellingPrice = rs.getDouble("sellingPrice");
            	int quantity = rs.getInt("quantity");
            	String imgURL = rs.getString("imgURL");
            	String description = rs.getString("description");
            	
            	
            	ProductDTO product = new ProductDTO(productId, productName, categoryName, purchasePrice, sellingPrice, quantity, imgURL, description);
            	result.add(product);
            	
            }
		} catch (Exception e) {
			
		}
		return result;
	}
	
	@Override
	public int restore(ProductDTO t) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			Connection con = (Connection) JDBCmySQL.getConnection();
			String sql = "UPDATE `product` SET `status`=? WHERE `productId`=?";
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
			pst.setInt(1, 1);		
            pst.setInt(2, t.getProductId());
			result = pst.executeUpdate();
			JDBCmySQL.closeConnection(con);
		} catch(SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		return result;	
	}

}
