package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{
	
	public void service(ServletRequest req, ServletResponse res)throws IOException {
		System.out.println("this is a generic servlet");
		
		res.setContentType("text/html");
		PrintWriter outPrintWriter = res.getWriter();
		outPrintWriter.println("<h1>This is myy second servlet using generic servlet<h1>");
	}

}
