package com.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mvc.bean.New_registration;

public class RegistrationDao {
	public String authorizeRegister(New_registration a) {
		String firstname = a.getFirstname();
		String lastname = a.getLastname();
		String DOB = a.getDOB();
		String bloodgroup = a.getBloodgroup();
		String email = a.getEmail();
		String mobileno = a.getMobileno();
		String Address1 = a.getAddress1();
		String Address2 = a.getAddress2();
		String Address3 = a.getAddress3();
		String State = a.getState();
		String city = a.getCity();
		String password = a.getPassword();

		String url = "jdbc:mysql://localhost:3306/donorlogin";
		String uname = "root";
		String password1 = "1240";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, password1);

			PreparedStatement ab = null;

			ab = con.prepareStatement(
					"insert into blooddonors(Firstname,Lastname,donordob,bloodgroupid,donormailid,mobileno,addressline1,addressline2,addressline3,state,city,password) values(?,?,?,?,?,?,?,?,?,?,?,?)");

			ab.setString(1, firstname);
			ab.setString(2, lastname);
			ab.setString(3, DOB);
			ab.setString(4, bloodgroup);
			ab.setString(5, email);
			ab.setString(6, mobileno);
			ab.setString(7, Address1);
			ab.setString(8, Address2);
			ab.setString(9, Address3);
			ab.setString(10, State);
			ab.setString(11, city);
			ab.setString(12, password1);
			ab.executeUpdate();

			ab.close();
			con.close();

			return "Sucess registered";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Fail registration";

	}

}
