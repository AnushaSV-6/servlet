package com.pract;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
    
   
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        
        String num1Str = req.getParameter("num1");
        String num2Str = req.getParameter("num2");
        
   
        int i = Integer.parseInt(num1Str);
        int j = Integer.parseInt(num2Str);
    
        int k = i + j;
        k= k*k;
        
        HttpSession session =req.getSession();
        session.setAttribute("k", k);
        
        res.sendRedirect("sq");
        //req.setAttribute("k", k);
        
        
        // RequestDispatcher rd= req.getRequestDispatcher("sq");
        // rd.forward(req, res);
         }
     }

//RequestDispatcher is an interface used to forward or include content from another resource (like another servlet or JSP).
// req.getRequestDispatcher("sq") creates a RequestDispatcher object that points to a resource named "sq". This is likely a servlet or JSP path within the web application.
  



