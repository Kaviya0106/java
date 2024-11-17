package com.qn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qn.model.Admin;
import com.qn.model.Customer;

public class AdminLogin extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminusername=request.getParameter("adminUsername");
		String adminpassword=request.getParameter("adminPassword");
		
		Admin a=new Admin();
		a.setAdminUsername(adminusername);
		a.setAdminPassword(adminpassword);
		int status=a.adminLogin();
		if(status==1) {
			response.sendRedirect("/car-service-system/adminLoginSuccess.jsp");
		}
		else if(status==-1){
			response.sendRedirect("/car-service-system/invalidadminUsername.jsp");
		}
		else {
			response.sendRedirect("/car-service-system/invalidadminPassword.jsp");
		}
	}
		

}