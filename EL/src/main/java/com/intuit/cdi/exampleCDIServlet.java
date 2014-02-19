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
	@Inject
	Validator val;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    boolean flag = false;
	    try{
	    	//flag = greeting.validateSomething(null);
	    	//greeting.setEmail(request.getParameter("URL"));
	    	//String var = ""; //"ftp://internet.address.com:21/path/file.gz"
	    	//if()
	    	String message = "";
	    	connection.setFtpServerURL(request.getParameter("URL"));
	    	connection.setName(request.getParameter("name"));
	    	Set<ConstraintViolation<ItemServerConnection>> violations = val.validate(connection);
	    	if(0 == violations.size()){
	    		//var = "everything fine";
	    		request.setAttribute("message", "URL submitted successfully");
	    	}else{
	    		//var = "something wrong";//+violations.size()+violations.iterator().next().getInvalidValue();
	    		Iterator<ConstraintViolation<ItemServerConnection>> it = violations.iterator();
	    		while(it.hasNext()){
	    			message +=  it.next().getMessage() + " : ";
	    		}
	    		request.setAttribute("message", message);
	    	}
	    } catch(ConstraintViolationException e){
	    	//Handle the exception
	    }
	    
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
	    dispatcher.forward(request, response);
	}

}
