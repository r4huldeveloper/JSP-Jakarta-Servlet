package com.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.*;

public class FirstServlet implements Servlet {
        // LifeCycle methods
	
	
	ServletConfig config;
	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("creating object...");
	}

	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException {
		
		System.out.println("servicing...");
		
		// set the content type of the respone
		response.setContentType("text/html");
		PrintWriter outPrintWriter = response.getWriter();
		outPrintWriter.println("<h1> this out is from servlet method</h1>");
		outPrintWriter.println("<h1>Today date and time is "+ new Date().toString()+"</h1>"); 
	}
	
	public void destroy() {
		System.out.println("destroying the object of servlet");
	}
	
	// Non Life cycle methods
	
	public ServletConfig getServletConfig() {
		return this.config;
	}
	public String getServletInfo() {
		return "this servlet is created by rahul";
	}
}