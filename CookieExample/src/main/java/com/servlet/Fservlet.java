package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Fservlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("You are in the First servlet");
		
		String name = req.getParameter("user_name");
		
		out.println("<h2>Hello "+name+" in my website</h2>");
		
		out.println("<h3><a href='second'>Go to the next Servlet</a></h3>");
		
		Cookie c = new Cookie("user_name", name);
	    res.addCookie(c);
		
		
}
}
