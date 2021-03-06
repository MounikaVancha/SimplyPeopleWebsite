package com.simplypeople.controller.frontend.projectmanager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class ProjectmanagerLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProjectmanagerLogoutServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().removeAttribute("loggedManager");
		
		response.sendRedirect(request.getContextPath());
	}

}
