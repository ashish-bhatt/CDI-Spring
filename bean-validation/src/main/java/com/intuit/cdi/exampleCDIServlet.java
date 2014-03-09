package com.intuit.cdi;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.Validator;

import com.intuit.core.ItemServerConnection;
import com.intuit.core.SimpleGreeting;

/**
 * Servlet implementation class exampleCDIServlet
 */
@WebServlet("/validateBean")
public class exampleCDIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	SimpleGreeting greeting;
	@Inject
	ItemServerConnection connection;
//	@Inject
//	Validator val;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    boolean flag = false;
	    try{
	    	connection.setFtpServerURL(request.getParameter("URL"));
	    	connection.setName(request.getParameter("name"));
	    	connection.returnSomeString();

	    	request.setAttribute("message", "URL submitted successfully");

	    } catch(ConstraintViolationException e){
	    	request.setAttribute("message", e.getConstraintViolations().iterator().next().getMessage());
	    	//Handle the exception
	    }
	    
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
	    dispatcher.forward(request, response);
	}

}
