package com.makeserv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
//just import jakarta.servlet.http.*;
public class addServlet extends HttpServlet {
	//instead of service function we can use doget or dopost for the action of the from 
	//because in hhtpsevlet class serivce function is there inside fo which is 2 metod impleementing the same

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		int i = Integer.parseInt(req.getParameter("n1"));
		int j = Integer.parseInt(req.getParameter("n2"));
		int k = i+j;
		//by default the method of sending the from is get  
		
		res.setContentType("text/plain"); //text/plain // we are sending  html pages this is bging specified
//		setContentType() informs the browser what type of content is being returned (HTML in this case).
//		getWriter() provides a way to write that content back to the client (like sending an HTML document).
//		The current servlet stops execution after the forward() call, so any code written after forward() will not be executed.
		
		PrintWriter out  = res.getWriter();
		
		//this is for a particular servlet 
		ServletConfig config = this.getServletConfig();
		String str = config.getInitParameter("name");
		out.println(str);
		out.println("the addition of the thing is " + k);
		
		//now redirecting to another servlet 
		//we use request dispatcher
		
		//now passingd data to next servlet
		//as req is an objct
		
		
//		req.setAttribute("value", k);


		//sendrequest
		//the url must be passes
		
		
//		res.sendRedirect("square?k="+k);
		
		//session management
		HttpSession session = req.getSession();
		session.setAttribute("value", k);
		
		
		//usee on other side using vlaue
		
		RequestDispatcher rd = req.getRequestDispatcher("square");//send a url which is mapped in xml
		rd.include(req,res);
		
		
// 	forward(): Transfers control to another servlet and does not return to the current servlet.
//		include(): If you need to include the output of another servlet while still executing the current one, you can use RequestDispatcher.include().
		
	
	}
}








