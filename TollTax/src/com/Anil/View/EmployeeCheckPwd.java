package com.Anil.View;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.Anil.DAO.EmployeeDAO;
import com.Anil.Model.Employee;

/**
 * Servlet implementation class EmployeeCheckPwd
 */
@WebServlet("/EmployeeCheckPwd")
public class EmployeeCheckPwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeCheckPwd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=response.getWriter();
		Employee E=EmployeeDAO.CheckPassword(request.getParameter("eid"),request.getParameter("pwd"));
	  System.out.println(E);
		if(E!=null){
		HttpSession ses=request.getSession();
		ses.putValue("SEID", request.getParameter("eid"));
		ses.putValue("SEN", E.getEmployeename());
		ses.putValue("LDATE", new java.util.Date());
		 
		  ses.putValue("SPIC", E.getPhotograph());
		    		System.out.println("hiiiiiiiii");
		response.sendRedirect("EmployeeHome");
		System.out.println("aaaa");
		//	response.sendRedirect("EmployeeHome");
		
	}
	else{
		
		out.println("<html><font color=red size=5>Invalid invalid User ID/Password</font></html>");
	}
	out.flush();
	
	}

}
