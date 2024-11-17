package com.qn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qn.model.Car;


public class ServiceStatus extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String carRegistrationNumber=request.getParameter("carRegisterNumber");
		   Car c=new Car();
		   c.setCarRegistrationNumber(carRegistrationNumber);
		   
		   HttpSession session=request.getSession();
		   String username=(String)session.getAttribute("username");
		   c.setUsername(username);
		   
		   String status=c.serviceStatus();
		   session.setAttribute("sStatus",status);//sStatus=status
		   
		  
		   if(status==null) {
			   response.sendRedirect("/car-service-system/serviceStatusFailure.jsp");
		   }
		   else {
			   response.sendRedirect("/car-service-system/serviceStatusSuccess.jsp");
		   }
		   
	}
}