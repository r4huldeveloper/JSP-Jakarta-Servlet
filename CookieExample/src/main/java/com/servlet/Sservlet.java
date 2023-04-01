package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.swing.plaf.basic.BasicComboPopup;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Sservlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		PrintWriter outPrintWriter = res.getWriter();
		outPrintWriter.println("You are in Second Servlet");
		
		Cookie[] cookies = req.getCookies();
		// taking the flags
		boolean f = false;
	    String name = "";
	    
	    if (cookies==null) {
			outPrintWriter.println("<h2>You are new first submit your name</h2>");
			return;
		}
	    else {
	       
	    	for (Cookie c:cookies) {
				String tname = c.getName();
				if (tname.equals("user_name")) {
					f = true;
					name = c.getValue();
				}
	    	}
	    }
		

	    if(f) {
		
		outPrintWriter.println("<h2>Welcome back "+name+" to my website again</h2>");
	}
	    else {
			outPrintWriter.println("<h2>you are the new user so first submit your name</h2>");
		}
	    
	}

}
