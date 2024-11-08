<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
vivek<br>
21251<br>
se2.<br>
<br>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/se2","root", "vivek9941");
Statement st = con.createStatement();

ResultSet rs = st.executeQuery("SELECT * FROM students");

while(rs.next()){

out.println("the roll number is: " + rs.getInt(1) + "<br>");

out.println("the name is "+ rs.getString(2) + "<br>"); 
}

%>







</body>
</html>