package com.makeserv;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;
import java.security.PublicKey;

import org.apache.catalina.WebResourceRoot.ResourceSetType;

//calling servlet from  servlet
import jakarta.servlet.http.*;

public class secondserv extends HttpServlet {
	public void doGet(HttpServletRequest request , HttpServletResponse res) throws IOException{
	
//		res.setContentType("text/plain");
//control is forwarded to the this servlet  after forwarding, the control is transferred to the target servlet, and no further processing occurs in the original servlet.
//		Any commands or logic after the forward() call in the original servlet are ignored.
		
		
		PrintWriter out = res.getWriter();
		//fetch sttribute
		
//		int k = (int) request.getAttribute("value");
		//cannot use with sendREdirect
//		int k = Integer.parseInt(request.getParameter("k"));
		
//		fetch from session
		HttpSession session = request.getSession();
		int k = (int)session.getAttribute("value");
		
		out.print("this is second servlet call and k from second servlet by passsing is "+k);
	}

}
