package com.csyx.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		switch(method) {
		case"indexMethod":{
			indexMethod(request,response);
			break;
		}case"resultMethod":{
			resultMethod(request,response);
		}
		}
	}

	private void resultMethod(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String str=request.getParameter("guess");
	     if(str==null||str.length()==0) {
	         response.sendRedirect("number.jsp");
	     }
	     else {
	    	HttpSession session = request.getSession(); 
	        int guessNumber=Integer.parseInt(str);
	        session.setAttribute("guess",new Integer(guessNumber));
	        Integer integer=(Integer)session.getAttribute("save");
	        int realnumber=integer.intValue();
	        if(guessNumber==realnumber) {
	           int n=((Integer)session.getAttribute("count")).intValue();
	           n=n+1;
	           session.setAttribute("count",new Integer(n));
	           response.sendRedirect("success.jsp");
	        } 
	        else if(guessNumber>realnumber){
	           int n=((Integer)session.getAttribute("count")).intValue();
	           n=n+1;
	           session.setAttribute("count",new Integer(n));
	           response.sendRedirect("large.jsp");
	        }
	        else if(guessNumber<realnumber) {
	           int n=((Integer)session.getAttribute("count")).intValue();
	           n=n+1;
	           session.setAttribute("count",new Integer(n));
	           response.sendRedirect("small.jsp");
	        }
	     }
	}

	private void indexMethod(HttpServletRequest request, HttpServletResponse response) {
		 int number=(int)(Math.random()*100)+1;
		 HttpSession session = request.getSession();
	     session.setAttribute("count",new Integer(0));
	     session.setAttribute("save",new Integer(number));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
