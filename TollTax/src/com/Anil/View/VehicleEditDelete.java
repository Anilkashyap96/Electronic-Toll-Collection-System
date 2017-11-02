package com.Anil.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VehicleEditDelete
 */
@WebServlet("/VehicleEditDelete")
public class VehicleEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleEditDelete() {
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
		out.println("<script src=vehicle.js></script>");
		out.println("<html>");
		out.println("<form action=FinalEditDeleteVehicle method=post enctype=multipart/form-data>");
		out.println("<center><table class='table table-bordered'><caption><h3>Vehicle Edit/Delete</h3></caption>");
		out.println("<tr><td><b><i>Vehicle Id:</i></b><input class='form-control' type=text name=vhid id=vhid size=20></td>");
		out.println("<td><b><i>Vehicle Type:</i></b><select name=vt id=vt class='form-control'><option value=\"Light Weight\">Light Weight</option><option value=\"Heavy Weight\">Heavy Weight</option><option value=\"State Government\">State Government</option><option value=\"Ambulance\">Ambulance</option><option Value=\"Defence\">Defence</option></select></td>");
		out.println("<td><b><i>Vehicle Registration:</i></b><input class='form-control' type=text name=vr id=vr size=20></td></tr>");
		out.println("<tr><td><b><i>Vehicle Name</i></b><input class='form-control' type=text name=vn id=vn size=20></td>");
		out.println("<td><b><i>Vehicle Color:</i></b><input type=text class='form-control' name=vco id=vco size=20></td>");
		out.println("<td><b><i>Vehicle Owner Name:</i></b><input class='form-control' type=text name=von id=von size=20></td></tr>");
		out.println("<tr><td><b><i>Address:</i></b><textarea class='form-control' name=va id=va rows=3 cols=20></textarea></td>");
		out.println("<td><b><i>State:</i></b><select name=vs id=state class='form-control'></select></td>");
		out.println("<td><b><i>City:</i></b><select name=vc id=city class='form-control'></td></tr>");
		out.println("<tr><td><b><i>Phone:</i></b><input type=text name=vfon class='form-control' id=vfon size=20></td>");
		out.println("<td><b><i>Mobile:</i></b><input type=text name=vmob class='form-control' id=vmob size=20></td>");
		out.println("<td><b><i>Email ID:</i></b><input type=text class='form-control' name=vmail id=vmail size=20></td>");
		out.println("<tr><td><b><i>Photograph:</i></b><input type=file class='form-control' name=vpic size=20></td><td><img src=\"\" width=25 height=25 id=vpic></td>");
		out.println("<td><input type=submit class='btn btn-success' value=Edit name=btn>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=submit value=Delete name=btn class='btn btn-danger'></td></tr>");
		out.println("</table></center></form>");
		out.println("<br>");
		out.println("<span id=result></span>");
		out.println("</html>");
		
	}

}
