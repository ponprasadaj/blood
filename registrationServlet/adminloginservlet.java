package com.mvc.registrationServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.bean.adminlogin;
import com.mvc.dao.adminDao;

/**
 * Servlet implementation class adminloginservlet
 */
@WebServlet("/adminloginservlet")
public class adminloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private adminDao a;

	public void init() {
		a = new adminDao();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("txtname");
		String password = request.getParameter("txtpwd");
		adminlogin c = new adminlogin();
		c.setUsername(username);
		c.setPassword(password);

		try {
			if (a.validate(c)) {
				response.sendRedirect("adminlogin.jsp");

			} else {
				HttpSession session = request.getSession();
				// session.setAttribute("username", username);
				// response.sendRedirect("l.jsp");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
