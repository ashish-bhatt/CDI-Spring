package com.intuit.bookservice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class exampleCDIServlet
 */
@WebServlet("/test")
public class exampleCDIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	BookService service;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter writer = response.getWriter();
	    writer.println("<html><body><h1>" +  service.getNewSerialNo() + "</h1></body></html>");
	    writer.close();
	}

}
