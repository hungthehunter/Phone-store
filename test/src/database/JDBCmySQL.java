package database;

import java.sql.Connection;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class JDBCmySQL {

    public static Connection getConnection() {
        Connection result = null;
        try {
            // Dang ky MySQL Driver voi DriverManager
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            //Cac thong so
            String url = "jdbc:mySQL://localhost:3306/phone";
            String userName = "root";
            String password = "9096441332Aa";
            //Tao ket noi 
            result = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể kết nối đến cơ sở dữ liệu !", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}