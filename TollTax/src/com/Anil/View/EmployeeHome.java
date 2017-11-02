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
 * Servlet implementation class EmployeeHome
 */
@WebServlet("/EmployeeHome")
public class EmployeeHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=response.getWriter();
	     HttpSession ses=request.getSession();
	     out.println("<html>");
		 try{
			 out.println("<html lang='en'>");
				out.println("<head>");
				out.println("		<link href='design/assets/css/bootstrap.min.css' rel='stylesheet'>");
				out.println("		<link href='design/assets/font/css/font-awesome.min.css' rel='stylesheet'>");
				out.println("		<link href='design/assets/css/style.css' rel='stylesheet'>");
				out.println("		<link href='design/assets/css/style-responsive.css' rel='stylesheet'>");
				out.println(" 	</head>");
			 
		 out.println("<h4><font color=green>Employee Id:"+ses.getValue("SEID").toString()+"["+ses.getValue("SEN").toString()+"]</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("LDATE").toString()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=EmployeeLogout>Logout</a>&nbsp;&nbsp;&nbsp;<img src=pic/"+ses.getValue("SPIC").toString()+" width=50 height=50></h4><hr color=red>");
		 out.println("<table>");
		 out.println("<tr valign=top><td><a href=CardIssueInterface  target=mw>Card Issue Register</a><br><a href=RechargeInterface target=mw>Card Recharge</a><br><a href=RechargeReport target=mw>Recharge Details</a><td>");
		 out.println("<td valign=top><iframe frameborder=0 width=800 height=800 name=mw></iframe></td></tr>");
		 out.println("</table>");
		 }catch(Exception e){
			 response.sendRedirect("EmployeeLogin");
			 
		 }
	}

}
