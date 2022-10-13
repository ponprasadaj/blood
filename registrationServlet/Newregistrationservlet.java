package com.mvc.registrationServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.New_registration;
import com.mvc.dao.RegistrationDao;

/**
 * Servlet implementation class Newregistrationservlet
 */
@WebServlet("/Newregistrationservlet")
public class Newregistrationservlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String registervalidate = null;
		if (request.getParameter("signup") != null)

		{

			String Firstname = request.getParameter("Firstname");
			String Lasttname = request.getParameter("Lasttname");
			String DOB = request.getParameter("DOB");
			String bloodgroup = request.getParameter("bloodgroup");
			String email = request.getParameter("email");
			String mobileno = request.getParameter("Mobileno");
			String Address1 = request.getParameter("Address1");
			String Address2 = request.getParameter("Address2");
			String Address3 = request.getParameter("Address3");
			String State = request.getParameter("State");
			String City = request.getParameter("City");
			String password = request.getParameter("password");

			New_registration a = new New_registration();

			a.setFirstname(Firstname);
			a.setLastname(Lasttname);
			a.setDOB(DOB);
			a.setBloodgroup(bloodgroup);
			a.setEmail(email);
			a.setMobileno(mobileno);
			a.setAddress1(Address1);
			a.setAddress2(Address2);
			a.setAddress3(Address3);
			a.setState(State);
			a.setCity(City);
			a.setPassword(password);

			RegistrationDao registrationDao = new RegistrationDao();

			registervalidate = registrationDao.authorizeRegister(a);

			if (registervalidate.equals("success Register")) {

			}
			request.setAttribute("RegisterSuccess", registervalidate);
			RequestDispatcher rd = request.getRequestDispatcher("donorlogin.jsp");
			rd.forward(request, response);

		} else {

			request.setAttribute("errormessage", registervalidate);
			RequestDispatcher rd = request.getRequestDispatcher("donorregistration.jsp");
			rd.include(request, response);

		}

	}

}
