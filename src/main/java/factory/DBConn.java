package factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	static Connection con;

	public static Connection getConn() {
		try {
			if (con == null || con.isClosed()) {
				Class.forName("com.mysql.cj.jdbc.Driver");

				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbb6_todo", "root", "");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) {
		Connection conn = getConn();
		if (conn != null) {
			System.out.println("✅ Connection Established!");
		} else {
			System.out.println("❌ Failed to connect!");
		}
	}

}
