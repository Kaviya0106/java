package com.qn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qn.model.Car;

public class CarDetails extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String carModel=request.getParameter("carModel");
		String carType=request.getParameter("carType");
		String carRegistrationNumber=request.getParameter("carRegistrationNumber");
		HttpSession session=request.getSession();
		String username=(String)session.getAttribute("susername");
		Car c=new Car();
		c.setUsername(username);
		c.setCarModel(carModel);
		c.setCarType(carType);
		c.setCarRegistrationNumber(carRegistrationNumber);
		int status=c.carDetails();
		if(status==0) {
			response.sendRedirect("/car-service-system/carDetailsFailure.jsp");
		}
		else {
			response.sendRedirect("/car-service-system/carDetailsSuccess.jsp");
		}
		
	}
		


}