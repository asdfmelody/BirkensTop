package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/index2")
public class nulpwebController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("index", "index");
		
		request
		.getRequestDispatcher("/index.jsp")
		.forward(request, response);
		
		
    	//String testUrl = "/WEB-INF/portfolio-1-col.html";
 	 
		
	}

	
	
	
}
