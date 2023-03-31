package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.locks.Condition;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException {
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("<h2>Welcome to the register servlet</h2>");
		
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		
		String condition = req.getParameter("condition");
		if(condition!=null) {   
		if (condition.equals("check")) {
			
			out.println("<h2>Name: "+name+"</h2>");
			out.println("<h2>Password: "+password+"</h2>");
			out.println("<h2>Email: "+email+"</h2>");
			out.println("<h2>Gender: "+gender+"</h2>");
			out.println("<h2>Course: "+course+"</h2>");
			
		} 
		
		}
		else {
			out.println("<h2>You haven't accepted the terms and conditions</h2>");
		}
	}

}
