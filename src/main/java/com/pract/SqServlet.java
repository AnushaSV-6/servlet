package com.pract;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		
		//int k=(int) req.getAttribute("k");
//This calls the getAttribute method on the HttpServletRequest object req.
//"k" is the name of the attribute that was set in the request, presumably by another servlet or JSP (e.g., req.setAttribute("k", k);).
//getAttribute("k") retrieves the value associated with "k" from the request object.
		
		HttpSession session= req.getSession();
	int k=(int) session.getAttribute("k");
		
		PrintWriter out=res.getWriter();
		out.println("result of Square is:"+k);
		
		
		
		
	}
}
