package com.makeserv;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.time.chrono.IsoChronology;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/third")//use of annotation instead of linking in xml 
public class thirdserv extends HttpServlet{
	public void service(HttpServletRequest request , HttpServletResponse response)throws IOException , ServletException{

		response.setContentType("text/plain");
		PrintWriter out  = response.getWriter();
		out.println("helo");
		ServletContext cxt = request.getServletContext();
		String str = cxt.getInitParameter("name");
		out.println(str);
		//code for servblet config is	written in addserv Servlet
		
	}

	
}
