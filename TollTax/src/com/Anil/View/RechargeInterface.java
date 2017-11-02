package com.Anil.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RechargeInterface
 */
@WebServlet("/RechargeInterface")
public class RechargeInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RechargeInterface() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession ses=request.getSession();
		try{
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><link href='design/assets/css/bootstrap.min.css' rel='stylesheet'></head>");
		out.println("<script src=asset/jquery-2.2.1.min.js></script>");
		out.println("<script src=recharge.js></script>");
		out.println("<input class='form-control' type=hidden value="+ses.getValue("SEID")+"><table class='table table-bordered'><caption><h4><i>Recharge Register</i></h4></caption>");
		out.println("<tr><td><b><i>Input Card No:</i></b></td><td><input type=text name=cn id=cn size=50 class='form-contsrol'></td><td><input type=button class='btn btn-danger' value=Search id=btn></td></tr>");
		out.println("</table>");
        out.println("<form action=RechargeSubmit method=post");
		out.println("<br><span id=result></span>");
		out.println("<br><span id=result1></span>");
		out.println("</form></html>");
		out.flush();
	} 
		catch(Exception e){
			response.sendRedirect("EmployeeLogIn");
		}
	}

}
