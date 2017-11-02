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
 * Servlet implementation class DisplayAllEmployee
 */
@WebServlet("/DisplayAllEmployee")
public class DisplayAllEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllEmployee() {
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
			ResultSet rs=EmployeeDAO.DisplayAll();
			out.println("<head><link href='design/assets/css/bootstrap.min.css' rel='stylesheet'></head>");
			out.println("<html><a href=EmployeeInterface class='btn btn-danger'><b><i>Add More Employee</i></b></a>");
			if(rs.next()){
				out.println("<center><table class='table table-bordered'><caption><h2>All Employees List<h2></caption>");
				out.println("<tr><th>Employee ID<br>Name</th><th>DOB<br>Gender</th><th>Address</th><th>Contact no.<br>Mobile No.</th><th>Joining Date<br>Qualification</th><th>Photograph</th><th>Update</th></tr>");
				do{
					String g="";
					if(rs.getString(5).equals("female"))
					{
						g=" d/o ";
					}else{
						g=" s/o ";
					}
out.println("<tr><td>"+rs.getString(1)+"<br>"+rs.getString(2)+g+rs.getString(3)+"</td><td>"+rs.getString(4)+"<br>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"<br>"+rs.getString(7)+"<br>"+rs.getString(8)+"</td><td>"+rs.getString(9)+"<br>"+rs.getString(10)+"<br>"+rs.getString(11)+"</td><td>"+rs.getString(12)+"<br>"+rs.getString(13)+"</td><td><img src=pic/"+rs.getString(16)+" width=60 height=60><br>["+rs.getString(14)+"]</td><td><a href=UpdateDeleteEmployee?eid="+rs.getString(1)+" class='btn btn-warning'>Edit/Delete</a></td></tr>");
				}while(rs.next());
rs.close();
				out.println("</table></center>");
			}
			else{
					out.println("Record NOtFound.........");
				}out.println("</html>");
		}
		
		catch(Exception e){
			System.out.println(e);
			out.println(e);
			}

	
	}
	

}
