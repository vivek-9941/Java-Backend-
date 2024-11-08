<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page errorPage = "error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

<%
    // Retrieve parameters 'n1' and 'n2' from the request and parse them to integers.
    int i = Integer.parseInt(request.getParameter("n1"));
    int j = Integer.parseInt(request.getParameter("n2"));

    // Tomcat automatically provides HttpServletRequest and HttpServletResponse objects,
    // so there's no need to manually create these objects.
    
    // Tomcat also handles PrintWriter and sets the content type based on the page directive.
    
    // Calculate the sum of 'i' and 'j', then find the square root of the result.
    int k = i + j;
    int sqr = (int) Math.sqrt(k);
    
    // Output the sum result directly to the page using 'out.println'.
    out.println("This is output: " + k);
%>


<%
//error page demo
int p = 199/0;
out.println(p);
%>


<!-- Display the calculated square root -->
The square root of k is <%= sqr %><br>
It is also the same as <%= Math.sqrt(k) %>

</body>
</html>
