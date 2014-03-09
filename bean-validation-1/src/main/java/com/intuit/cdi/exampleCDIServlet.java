package com.intuit.cdi;

import java.io.IOException;
import java.io.PrintWriter;
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
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.executable.ExecutableValidator;

import com.intuit.core.ItemServerConnection;
import com.intuit.core.SimpleGreeting;

/**
 * Servlet implementation class exampleCDIServlet
 */
@WebServlet("/test")
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
	    PrintWriter writer = response.getWriter();
	    try{
	    	flag = greeting.validateSomething("hello");
	    } catch(ConstraintViolationException e){
	    	//Handle the exception
	    	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	    	ExecutableValidator executableValidator = factory.getValidator().forExecutables();
	    	Set<ConstraintViolation<SimpleGreeting>> violations = null;
			try {
				Object[] parameterValues = { "hello" };
				violations = executableValidator.validateParameters(greeting, SimpleGreeting.class.getMethod("validateSomething", String.class), parameterValues);
		    	Iterator<ConstraintViolation<SimpleGreeting>> it = violations.iterator();
		    	String message = "";
		    	while(it.hasNext()){
	    			message +=  it.next().getMessage() + " : ";
	    		}
			    writer.println("<html><body><h1>" +  message + "</h1></body></html>");
			    writer.close();
			} catch (Exception e1) {

			}
	    }
	    
	    writer.println("<html><body><h1>" +  greeting.getGreeting() + "</h1></body></html>");
	    writer.close();
	}

}
