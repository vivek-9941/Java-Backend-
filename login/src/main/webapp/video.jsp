<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 align = "center" >this page shows video</h3>
<%
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
%>
<br>

<iframe width="727" height="480" src="https://www.youtube.com/embed/OuBUUkQfBYM" title="Servlet &amp; JSP Tutorial | Full Course" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
</body>
</html>