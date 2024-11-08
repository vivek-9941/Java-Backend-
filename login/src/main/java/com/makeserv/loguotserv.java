package com.makeserv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.mysql.cj.Session;

@WebServlet("/out")
public class loguotserv extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the session
        HttpSession session = request.getSession(); // Use false to not create a new session
        session.removeAttribute("username");
            session.invalidate(); // Invalidate the session
        
        // Redirect to login or home page after logout
        response.sendRedirect("NewFile.jsp");
    }
}
