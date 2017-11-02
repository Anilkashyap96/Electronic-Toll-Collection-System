package com.Anil.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VehicleDisplayAll
 */
@WebServlet("/VehicleDisplayAll")
public class VehicleDisplayAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleDisplayAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<head><link href='design/assets/css/bootstrap.min.css' rel='stylesheet'></head>");
		out.println("<script src=asset/jquery-2.2.1.min.js></script>");
		out.println("<script src=project.js></script>");
		out.println("<html>");
		out.println("<input type=Button value=\"click here\" id=btn class='btn btn-danger'>");
		out.println("<span id=result></span></html>");
		out.flush();
	
	}

}
