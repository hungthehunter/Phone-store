
	package database;
	import java.sql.Connection;
	import com.mysql.jdbc.Driver;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	public class JDBCmySQL {
	public static Connection getConection() {
		Connection c=null;
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		String url="jdbc:mySQL://localhost:3306/phone";
		String username="root";
		String password="Grandy-092358";
		c= DriverManager.getConnection(url, username, password);
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
		return c;
	}
	public static void DisConection(Connection c) {
	try {
		if(c!=null) {
			c.close();
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
	
	public static void printInfo(Connection c) {
		if(c!=null) {
			try {
				java.sql.DatabaseMetaData dtbm=c.getMetaData();
				System.out.print(dtbm.getDatabaseProductName());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}

