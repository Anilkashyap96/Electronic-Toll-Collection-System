package com.Anil.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeInterface
 */
@WebServlet("/EmployeeInterface")
public class EmployeeInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployeeInterface() {
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
	       out.println("<script src=asset/jquery.validate.min.js></script>");
	       out.println("<script src=validate.js></script>");
	       out.println("<script src=employee.js></script>");
	       out.println("<script src=statecity.js></script>");
	       out.println("<html><form id=myform action=EmployeeSubmit method=post enctype=multipart/form-data  >");
	       out.println("<a href=DisplayAllEmployee class='btn btn-primary'><b><i>Display All Employee</i></b></a>");
	       out.println("<center><table class='table table-bordered'><caption><h3>Employee Register</h3></caption>");
	       out.println("<tr><td><b><i>Employee Id:</i></b></td><td><input type=text class='form-control' name=eid size=40></td></tr>");
	       out.println("<tr><td><b><i>Name:</i></b></td><td><input type=text name=en class='form-control' size=40></td></tr>");
	       out.println("<tr><td><b><i>Father's Name:</i></b></td><td><input type=text class='form-control' name=efn size=40></td></tr>");
	       out.println("<tr><td><b><i>Birth Date:</i></b></td><td><input type=date name=dob class='form-control' size=40></td></tr>");
	       out.println("<tr><td><b><i>Gender:</i></b></td><td><input type=radio name=eg value=Male>Male<input type=radio name=eg value=Female>Female</td></tr>");
	       out.println("<tr><td><b><i>Address:</i></b></td><td><textarea class='form-control'  name=ea rows=3 cols=40></textarea></td></tr>");
	       out.println("<tr><td><b><i>State:</i></b></td><td><select name=es id=state class='form-control'></select></td></tr>");
	       out.println("<tr><td><b><i>City:</i></b></td><td><select name=ec id=city class='form-control'></select></td></tr>");
	      
	       out.println("<tr><td><b><i>Contact No:</i></b></td><td><input type=text class='form-control' name=econ size=40></td></tr>");
	       out.println("<tr><td><b><i>Mobile:</i></b></td><td><input type=text name=emob class='form-control' size=40></td></tr>");
	       out.println("<tr><td><b><i>Email Id:</i></b></td><td><input type=email name=email class='form-control' size=40></td></tr>");
	       out.println("<tr><td><b><i>Joining Date:</i></b></td><td><input type=date name=ejoin class='form-control' size=40></td></tr>");
	       out.println("<tr><td><b><i>Qualification:</i></b></td><td><textarea  name=eq rows=3 class='form-control' cols=40></textarea></td></tr>");
	       out.println("<tr><td><b><i>Designation:</i></b></td><td><select name=ed class='form-control'><option value=\"Collector\">Collector</option><option value=\"Cashier\">Cashier</option><option value=\"Toll Incharge\">Toll Incharge</option></select></td></tr>");
	       out.println("<tr><td><b><i>Password:</i></b></td><td><input type=password class='form-control' name=epass size=40></td></tr>");
	       out.println("<tr><td><b><i>Photograph:</i></b></td><td><input type=file class='form-control' name=epic size=40></td></tr>");
	       out.println("<tr><td><input type=submit class='btn btn-success'></td><td><input type=reset class='btn btn-danger'></td></tr>");
	       out.println("</table></center></form></html>");
	       out.flush();

	
	}

}
