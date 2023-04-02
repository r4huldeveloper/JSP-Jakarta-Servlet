package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet implements Filter {
	
	public void init(FilterConfig conf) throws ServletException{}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		out.println("This is first filter invoked");
		
		chain.doFilter(req, res);
		
		out.println("filer invokation at 2nd level");
	}
	
	public void destroy() {}


	
}
