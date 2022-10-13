package com.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mvc.bean.userlogin;

public class userlogindao {
	public String authorizeLogin(userlogin a) {
		String username = a.getUsername();
		String passsword = a.getPassword();

		String dbusername = "";
		String dbpassword = "";

		String url = "jdbc:mysql://localhost:3306/donorlogin";
		String uname = "root";
		String password = "1240";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, passsword);

			PreparedStatement pst = null;

			pst = con.prepareStatement("select*from donorlogin where username=? and password=?");
			pst.setString(1, username);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				dbusername = rs.getString("username");
				dbpassword = rs.getString("password");

				if (username.equals(dbusername) && passsword.equals(dbpassword)) {
					return "success Login";
					
				}
			}
			pst.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Wrong username and password";

	}

}
