import java.io.IOException;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.*;
@WebServlet("/demo")
//class needs to be public to be accessible to tomcat
public class demoservlet extends HttpServlet {
	public void service(HttpServletRequest request , HttpServletResponse response) throws IOException , ServletException{
		String name = "vivek";
		request.setAttribute("label", name);
		RequestDispatcher rd	 =  request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}
}da