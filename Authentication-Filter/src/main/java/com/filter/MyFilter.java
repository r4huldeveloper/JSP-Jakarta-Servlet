package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
	
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		String pass = req.getParameter("password");
		if(pass.equals("admin")) {
			chain.doFilter(req, res); //sends request to next resource
		}
		else {
			out.println("username or password error");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
		
	}
	public void destroy() {}

}
