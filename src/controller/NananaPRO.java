package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/portfolio")
public class NananaPRO extends HttpServlet {

	
		// TODO Auto-generated method stub
		@Override
		   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		      request.setAttribute("portfolio-1-col", "portfolio-1-col");
		      
		      request
		      .getRequestDispatcher("/portfolio-1-col.jsp")
		      .forward(request, response);
		      
	

}

}