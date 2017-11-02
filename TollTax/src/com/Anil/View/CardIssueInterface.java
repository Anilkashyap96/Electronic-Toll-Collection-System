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
 * Servlet implementation class CardIssueInterface
 */
@WebServlet("/CardIssueInterface")
public class CardIssueInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CardIssueInterface() {
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
		out.println("<head><link href='design/assets/css/bootstrap.min.css' rel='stylesheet'></head>");
		out.println("<script src=asset/jquery-2.2.1.min.js></script>");
		out.println("<script src=cardissue.js></script>");
        out.println("<html><form action=CardissueSubmit>");
        out.println("<center><table class='table table-bordered'>");
        out.println("<tr><td><b><i>Employee ID:</i></b></td><td><input class='form-control' type=text name=eid value="+ses.getValue("SEID").toString()+" readonly=true></td></tr>");
        //int id=CardissueDAO.getId();
        out.println("<tr><td><b><i>Card NO:</i></b></td><td><input class='form-control' type=text name=cn ></td></tr>");
        out.println("<tr><td><b><i>Vehicle ID:</i></b></td><td><select class='form-control' name=vid id=vidc></select></td></tr>");
        out.println("<tr><td><b><i>Charge Type:</i></b></td><td><select class='form-control' name=ct id=ct><option>-Select-</option><option value=Monthly>Monthly</option><option value='Half Yearly'>Half Yearly</option><option value='Yearly'>Yearly</option></select></td></tr>");
		out.println("<tr><td><b><i>Amount:</i></b></td><td><input class='form-control' type=text name=amt id=amt></td></tr>");
	    out.println("<tr><td><b><i>Issue Date:</i></b></td><td><input class='form-control' type=text name=isd id=isd></td></tr>");
		out.println("<tr><td><b><i>Expiry Date:</i></b></td><td><input class='form-control' type=text name=expd id=expd></td></tr>");
        out.println("<tr><td><input type=submit class='btn btn-danger'></td><td><input class='btn btn-warning' type=reset></td></tr>");
		out.println("</table></center></form></html>");
		}
		catch(Exception e){
			response.sendRedirect("EmployeeLogin");
		}		

	}

}
