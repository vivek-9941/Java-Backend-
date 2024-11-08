package com.makeserv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//just import jakarta.servlet.http.*;
public class addServlet extends HttpServlet {
	//instead of service function we can use doget or dopost for the action of the from 
	//because in hhtpsevlet class serivce function is there inside fo which is 2 metod impleementing the same

	public void service(HttpServletRequest req, HttpServletResponse res) throws  IOException{
		int i = Integer.parseInt(req.getParameter("n1"));
		int j = Integer.parseInt(req.getParameter("n2"));
		int k = i-j;
		//by default the method of sending the from is get  
		
		res.setContentType("text/plain"); //text/plain // we are sending  html pages this is bging specified
//		setContentType() informs the browser what type of content is being returned (HTML in this case).
//getWriter() provides a way to write that content back to the client (like sending an HTML document).
		
		PrintWriter out  = res.getWriter();
		out.println("the subtraction of the thing is " + k);
		
		
		
 	
		
	
	}
}
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class addServlet extends HttpServlet {
//    
//    // Override the service method to handle GET and POST requests
//    public void service(HttpServletRequest request, HttpServletResponse res) throws IOException {
//        // Parse input parameters from the request
//        int i = Integer.parseInt(request.getParameter("num1"));
//        int j = Integer.parseInt(request.getParameter("num2"));
//        
//        // Add the two numbers
//        int k = i + j;
//        
//        // Set the content type of the response to plain text
//        res.setContentType("text/plain");
//        
//        // Send the response back to the client
//        PrintWriter out = res.getWriter();
//        out.println("The sum is: " + k);
//    }
//}
