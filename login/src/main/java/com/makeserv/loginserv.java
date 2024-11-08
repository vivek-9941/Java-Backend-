package com.makeserv;

import java.io.IOException;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class loginserv extends HttpServlet {
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            // Retrieve parameters
            int password = Integer.parseInt(request.getParameter("pass"));
            String username = request.getParameter("uname");
            
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish database connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/se2", "root", "vivek9941");
            Statement statement = con.createStatement();
            
            // Execute query
            ResultSet rs = statement.executeQuery("SELECT * FROM students WHERE name='" + username + "'");
            if (rs.next()) { // Check if a result was found
                int dbpass = rs.getInt(1); // Assumes password is in the first column
                if (dbpass == password) {
                	
                	//create session
                	HttpSession session = request.getSession() ;
                	session.setAttribute("username", username);
                	response.sendRedirect("welcom.jsp"); // Redirect on successful login
                } else {
                    response.sendRedirect("NewFile.jsp"); // Redirect to login on failure
                }
            } else {
                response.sendRedirect("NewFile.jsp"); // Redirect to login if no matching username
            }
            
            // Close resources
            rs.close();
            statement.close();
            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database driver not found.");
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error occurred.");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid password format.");
        }
    }
}
