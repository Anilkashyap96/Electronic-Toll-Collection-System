package com.Anil.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VehicleInterface
 */
@WebServlet("/VehicleInterface")
public class VehicleInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleInterface() {
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
	       out.println("<script src=statecity.js></script>");
	       out.println("<html><form action=VehicleSubmit method=post enctype=multipart/form-data>");
	       out.println("<a href=VehicleDisplayAll class='btn btn-warning'>List of vehicles</a><br>");
	       out.println("<center><table class='table table-bordered'><caption><h3>Vehicle Register</h3></caption>");
	       out.println("<tr><td><b><i>Vehicle Id:</i></b></td><td><input class='form-control' type=text name=vid size=40></td></tr>");
	       out.println("<tr><td><b><i>Vehicle Type:</i></b></td><td><select name=vt class='form-control'><option value=\"Light Weight\">Light Weight</option><option value=\"Heavy Weight\">Heavy Weight</option><option value=\"State Government\">State Government</option><option value=\"Ambulance\">Ambulance</option><option value=\"Defence\">Defence</option></select></td></tr>");
	       out.println("<tr><td><b><i>Vehicle Registration:</i></b></td><td><input class='form-control' type=text name=vr size=40></td></tr>");
	       out.println("<tr><td><b><i>Vehicle Name:</i></b></td><td><input type=text class='form-control' name=vn size=40></td></tr>");
	       out.println("<tr><td><b><i>Vehicle Color:</i></b></td><td><input type=text class='form-control' name=vco size=40></td></tr>");
	       out.println("<tr><td><b><i>Vehicle Owner Name:</i></b></td><td><input class='form-control' type=text name=von size=40></td></tr>");
	       out.println("<tr><td><b><i>Address:</i></b></td><td><textarea  class='form-control' name=va rows=3 cols=40></textarea></td></tr>");
	       out.println("<tr><td><b><i>State:</i></b></td><td><select name=vs id=state class='form-control'></select></td></tr>");   
	       out.println("<tr><td><b><i>City:</i></b></td><td><select class='form-control' name=vc id=city></select></td></tr>");
	       out.println("<tr><td><b><i>phone:</i></b></td><td><input class='form-control' type=text name=vfon size=40></td></tr>");
	       out.println("<tr><td><b><i>Mobile:</i></b></td><td><input class='form-control' type=text name=vmob size=40></td></tr>");
	       out.println("<tr><td><b><i>Emailid:</i></b></td><td><input class='form-control' type=text name=vmail size=40></td></tr>");
	       out.println("<tr><td><b><i>Photograph:</i></b></td><td><input class='form-control' type=file name=vpic size=40></td></tr>");
	       out.println("<tr><td><input type=submit class='btn btn-success'></td><td><input class='btn btn-danger' type=reset></td></tr>");
	       out.println("</table></center></form></html>");
	       out.flush();
		
	}

}
