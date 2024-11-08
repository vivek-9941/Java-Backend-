<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- everytime this page is cached so afer logut we can access this one. asssing in header that this page is not to be cached . -->

<!-- check if user is logged in i.e in the session and have not direclty landed on welcome -->
<%
response.setHeader("Cache-Control", "no-cache, no-store,must-revalidate");
if(session.getAttribute("username") == null){
	response.sendRedirect("NewFile.jsp");
	
}
%>
welcome
<br>
<a href ="video.jsp">video </a>
<br>

<!--  logging out from the size  -->
<br>
<form action = "out">
<input type="submit" value = "logout">
</form>

</body>
</html>