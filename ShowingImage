package com.display;

import java.io.*;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayImage extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		res.setContentType("image/jpg");
		
		ServletOutputStream out = res.getOutputStream();
		FileInputStream fi = new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Screenshot 2023-04-04 162643.jpg");
		
		BufferedInputStream bi  = new BufferedInputStream(fi);
		BufferedOutputStream bo = new BufferedOutputStream(out);
		
		int count = 0;
		
		while((count = bi.read()) != -1) {
           bo.write(count);
		}
		bi.close();
		fi.close();
		bo.close();
		out.close();
	}

}
