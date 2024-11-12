package com.pract;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
    
   
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        
        String num1Str = req.getParameter("num1");
        String num2Str = req.getParameter("num2");
        
   
        int i = Integer.parseInt(num1Str);
        int j = Integer.parseInt(num2Str);
    
        int k = i + j;
        k= k*k;
        
        req.setAttribute("k", k);
        
        
         RequestDispatcher rd= req.getRequestDispatcher("sq");
      rd.forward(req, res);
    }
}
