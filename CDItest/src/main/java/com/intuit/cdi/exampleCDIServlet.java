package com.intuit.cdi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;

import com.intuit.core.SimpleGreeting;

/**
 * Servlet implementation class exampleCDIServlet
 */
@WebServlet("/test")
public class exampleCDIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	SimpleGreeting greeting;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter writer = response.getWriter();
	    boolean flag;
	    try{
	    	flag = greeting.validateSomething("null");
	    	writer.println("<html><body><h1>" + "everything fine" + "</h1></body></html>");
	    } catch(ConstraintViolationException e){
	    	writer.println("<html><body><h1>" +  "ConstraintViolationException" + "</h1></body></html>");
	    }
	    
	    writer.close();
	}

}
