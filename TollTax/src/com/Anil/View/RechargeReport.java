package com.Anil.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RechargeReport
 */
@WebServlet("/RechargeReport")
public class RechargeReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RechargeReport() {
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
	    out.println("<script src=report.js></script>");  
		out.println("<html>");
		out.println("<table align=center class='table table-bordered'><caption><h4>Recharge Details</h4></caption>");
		out.println("<tr><td><b><i>Enter Card No:</b></i></td><td><input class='form-control' type=text name=cn1 id=cn1></td><td><input type=button value=Search class='btn btn-success' name=btn1 id=btn1></tr></table>");
		out.println("<br><span id=result></span>");
	
		out.println("</html>");
		out.flush();
	}

}
