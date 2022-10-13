package com.mvc.registrationServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.bean.userlogin;
import com.mvc.dao.userlogindao;

/**
 * Servlet implementation class userloginservlet
 */
@WebServlet("/userloginservlet")
public class userloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("btn_login") != null) {
			String username = request.getParameter("txtusername");
			String password = request.getParameter("txtpwd");

			userlogin a = new userlogin();

			a.setUsername(username);
			a.setPassword(password);

			userlogindao b = new userlogindao();
			String authorize = b.authorizeLogin(a);

			if (authorize.equals("successlogin")) {
				HttpSession session = request.getSession();
				session.setAttribute("login", a.getUsername());
				RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("wronglogin", authorize);
				RequestDispatcher rd = request.getRequestDispatcher("donorlogin");
				rd.include(request, response);
			}

		}

	}
}
