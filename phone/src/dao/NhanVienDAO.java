//package dao;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//
//
//import database.JDBCmySQL;
//import model.NhanVien;
//
//public class NhanVienDAO implements DAOInterface<NhanVien>{
//
//	public static NhanVienDAO getInstance() {
//		return new NhanVienDAO();
//	}
//	
//	@Override
//	public int insert(NhanVien t) {
//		
//		try {
//			//step 1:get connection to database
//			Connection connection=JDBCmySQL.getConection();
//			//step 2: create statement
//			Statement st=connection.createStatement();
//	        //step 3: excusing 
//			String sql="INSERT INTO nhanvien(`NV_NguoiID`,`chucVu`,`luong`)"+"VALUES ("+t.getNV_NguoiID()+","+t.getChucVu()+","+t.getLuong()+")";
//		
//		
//		int ketqua=st.executeUpdate(sql);
//		
//		//step 4: test
//		System.out.println("you have excused: "+sql);
//		System.out.println("Having "+ketqua+" changed");
//		//step 5 :close connection
//		JDBCmySQL.DisConection(connection);
//		} catch (SQLException e) {
//	
//			e.printStackTrace();
//		}
//		
//		
//		
//		return 0;
//	}
//
//	@Override
//	public int update(NhanVien t) {
//		try {
//			//step 1:get connection to database
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return 0;
//	}
//
//	@Override
//	public int delete(NhanVien t) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public ArrayList<NhanVien> selectAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public NhanVien selectById(NhanVien t) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ArrayList<NhanVien> selectByCondition(String condition) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
