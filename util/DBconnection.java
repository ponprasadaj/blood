package com.mvc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

	public static Connection createConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/blood_donor";
		String username = "root";
		String password = "1240";
		System.out.println("In connection.java class");

		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			con = DriverManager.getConnection(url, username, password);
			System.out.println("print" + con);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return con;
	}
}
