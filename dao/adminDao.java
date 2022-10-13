package com.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mvc.bean.adminlogin;

public class adminDao {
	public boolean validate(adminlogin b) throws ClassNotFoundException {
		boolean status =false;
		
		Class.forName("com.mysql.jdbc.Driver");
		

		String url = "jdbc:mysql://localhost:3306/admin";
		String uname = "root";
		String pwd = "1240";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pwd);

			PreparedStatement pm = null;
			

			pm = con.prepareStatement("Select*from admin where username=? and password=?");

			pm.setString(1, b.getUsername());
			pm.setString(2, b.getPassword());
			
			System.out.println(pm);
			
			ResultSet rm = pm.executeQuery();
			while (rm.next()) ;
		}
		catch (SQLException e) {
		
			printSQLException(e);
		}
		return status;
			}
	private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
       }
}
	}
}

