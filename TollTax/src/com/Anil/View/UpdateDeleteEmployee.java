package com.Anil.View;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Anil.DAO.EmployeeDAO;

/**
 * Servlet implementation class UpdateDeleteEmployee
 */
@WebServlet("/UpdateDeleteEmployee")
public class UpdateDeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDeleteEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try{
			String eid=request.getParameter("eid");
		ResultSet rs=EmployeeDAO.DisplayById(eid);
		if(rs.next())
		{out.println("<head><link href='design/assets/css/bootstrap.min.css' rel='stylesheet'></head>");
			 out.println("<html><center><form action=FinalEditDeleteEmployee method=post enctype=multipart/form-data>");
			 out.println("<table class='table table-bordered' Cellpadding=15 cellspacing=15>");
			 out.println("<tr><th>");
		       out.println("<table><caption><h3>Update Employee</h3></caption>");
		       out.println("<tr><td><b><i>Employee Id:</i></b></td><td><input type=text class='form-control' name=eid size=40 value="+rs.getString(1)+"></td></tr>");
		       out.println("<tr><td><b><i>Name:</i></b></td><td><input type=text class='form-control' name=en size=40 value="+rs.getString(2)+"></td></tr>");
		       out.println("<tr><td><b><i>Father's Name:</i></b></td><td><input class='form-control' type=text name=efn size=40 value="+rs.getString(3)+"></td></tr>");
		       out.println("<tr><td><b><i>Birth Date:</i></b></td><td><input class='form-control' type=text name=dob size=40 value="+rs.getString(4)+"></td></tr>");
		       if(rs.getString(5).equals("Male")){
		       out.println("<tr><td><b><i>Gender:</i></b></td><td><input type=radio name=eg value=Male checked>Male<input type=radio name=eg value=Female>Female</td></tr>");
		       }else{
		    	   out.println("<tr><td><b><i>Gender:</i></b></td><td><input type=radio name=eg value=Male checked>Male<input type=radio name=eg value=Female checked>Female</td></tr>");
				        
		       }
		       out.println("<tr><td><b><i>Address:</i></b></td><td><textarea class='form-control'  name=ea rows=3 cols=40>"+rs.getString(6)+"</textarea></td></tr>");
		       out.println("<tr><td><b><i>State:</i></b></td><td><input type=text class='form-control' name=es size=40 value="+rs.getString(7)+"></td></tr>");
		       out.println("<tr><td><b><i>City:</i></b></td><td><input type=text class='form-control' name=ec size=40 value="+rs.getString(8)+"></td></tr>");
		      
		       out.println("<tr><td><b><i>Contact No:</i></b></td><td><input class='form-control' type=text name=econ size=40 value="+rs.getString(9)+"></td></tr>");
		       out.println("<tr><td><b><i>Mobile:</i></b></td><td><input type=text class='form-control' name=emob size=40 value="+rs.getString(10)+"></td></tr>");
		       out.println("<tr><td><b><i>Email Id:</i></b></td><td><input type=text class='form-control' name=email size=40 value="+rs.getString(11)+"></td></tr>");
		       out.println("<tr><td><b><i>Joining Date:</i></b></td><td><input class='form-control' type=text name=ejoin size=40 value="+rs.getString(12)+"></td></tr>");
		       out.println("<tr><td><b><i>Qualification:</i></b></td><td><textarea class='form-control'  name=eq rows=3 cols=40>"+rs.getString(13)+"</textarea></td></tr>");
		       out.println("<tr><td><b><i>Designation:</i></b></td><td><select name=ed class='form-control'><option value="+rs.getString(14)+">"+rs.getString(14)+"</option><option value=\"Collector\">Collector</option><option value=\"Cashier\">Cashier</option><option value=\"Toll Incharge\">Toll Incharge</option></select></td></tr>");
		      out.println("</table></th>");
		       out.println("<th valign=middle><img src=pic/"+rs.getString(16)+" height=150 width=150 class='img-thumbnail'><br><input type=file name=epic class='form-control'></th></tr></table>");      
		       out.println("<tr><td><input class='form-control' type=hidden value="+rs.getString(16)+" name=pic enabled=true></d></tr>");
		       out.println("<input type=submit class='btn btn-danger' name=btn value=Update>&nbsp;&nbsp;&nbsp;&nbsp;<input type=submit class='btn btn-success' name=btn value=Delete>");
		       
		       out.println("</form></center><html>");
		}
		else{
			out.println("Record Not Found.........");
		}
		}catch(Exception e){
			out.println(e);
		}

	}

}
