package tester;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

import dao.NhanVienDAO;
import database.JDBCmySQL;
import model.NhanVien;
import view.Login;
import database.JDBCmySQL;

public class tester {
	public static void main(String[] args) {
		NhanVien employee=new NhanVien(1,"nhanvien",1000);
		NhanVienDAO.getInstance().insert(employee);
	}

}
