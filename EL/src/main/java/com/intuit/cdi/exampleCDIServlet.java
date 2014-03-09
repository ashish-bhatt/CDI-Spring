package com.intuit.cdi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		greeting.setEmail("ashish_bhatt@intuit.com");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/test.jsp");
	    dispatcher.forward(request, response);
	}

}
