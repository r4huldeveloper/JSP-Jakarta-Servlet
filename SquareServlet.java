package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int k = (int)req.getAttribute("k");
		k = k*k;

		PrintWriter out = res.getWriter();
//		out.println("Hello square");
		
		out.println("Result is :"+k);
	}

}
