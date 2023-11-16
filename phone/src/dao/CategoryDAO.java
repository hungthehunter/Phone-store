package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import database.JDBCmySQL;
import dto.CategoryDTO;

public class CategoryDAO implements DAOInterface<CategoryDTO>{
	public static CategoryDAO getInstance() {
		return new CategoryDAO();
	}

	@Override
	public int insert(CategoryDTO t) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			Connection con = (Connection) JDBCmySQL.getConnection();
			String sql = "INSERT INTO `category`(`categoryName`) VALUES (?)";
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
			pst.setString(1, t.getCategoryName());
			result = pst.executeUpdate();
			JDBCmySQL.closeConnection(con);
		} catch(SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		return result;
	}

	@Override
	public int update(CategoryDTO t) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			Connection con = (Connection) JDBCmySQL.getConnection();
            String sql = "UPDATE `category` SET`categoryName`=? WHERE `categoryId`=?";
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, t.getCategoryName());
            pst.setInt(2, t.getCategoryId());
			result = pst.executeUpdate();
			JDBCmySQL.closeConnection(con);
		} catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		return result;
	}

    @Override
    public int delete(String t) {
        int result = 0 ;
        try {
            Connection con = (Connection) JDBCmySQL.getConnection();
            String sql = "UPDATE `category` SET `status` = 0 WHERE `categoryId`= ?";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, t);
            result = pst.executeUpdate();
            JDBCmySQL.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public ArrayList<CategoryDTO> selectAll() {
        ArrayList<CategoryDTO> result = new ArrayList<CategoryDTO>();
        try {
            Connection con = (Connection) JDBCmySQL.getConnection();
            String sql = "SELECT * FROM category WHERE `status`=1";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            while(rs.next()){
                int categoryId = rs.getInt("categoryId");
                String categoryName = rs.getString("categoryName");
                
                CategoryDTO lh = new CategoryDTO(categoryId, categoryName);
                result.add(lh);
            }
            JDBCmySQL.closeConnection(con);
        } catch (Exception e) {
        	
        }
        return result;
    }

    @Override
    public CategoryDTO selectById(String t) {
        CategoryDTO result = null;
        try {
            Connection con = (Connection) JDBCmySQL.getConnection();
            String sql = "SELECT * FROM category WHERE categoryId=?";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = (ResultSet) pst.executeQuery();
            while(rs.next()){
                int categoryId = rs.getInt("categoryId");
                String categoryName = rs.getString("categoryName");
                result = new CategoryDTO(categoryId, categoryName);
            }
            JDBCmySQL.closeConnection(con);
        } catch (Exception e) {
        }
        return result;
    }
	@Override
	public ArrayList<CategoryDTO> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
    public int getAutoIncrement() {
        int result = -1;
        try {
            Connection con = (Connection) JDBCmySQL.getConnection();
            String sql = "SELECT `AUTO_INCREMENT` FROM  INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'pmqldt' AND   TABLE_NAME   = 'category'";
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
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }




}
