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
 * Servlet implementation class AdminHome
 */
@WebServlet("/AdminHome")
public class AdminHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminHome() {
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
			out.println("	<body class='tooltips'>");
			out.println("		<div class='wrapper'>");
			out.println("			<!-- BEGIN TOP NAV -->");
			out.println("			<div class='top-navbar'>");
			out.println("				<div class='top-navbar-inner'>");
			out.println("					<div class='logo-brand'>");
			out.println("						<a href='index.html'><img src='design/assets/img/sentir-logo-primary.png' alt='Sentir logo'></a>");
			out.println("					</div><!-- /.logo-brand -->");
			out.println("				</div><!-- /.top-navbar-inner -->");
			out.println("			</div><!-- /.top-navbar -->");
			out.println("			<div class='sidebar-left sidebar-nicescroller'>");
			out.println("				<ul class='sidebar-menu'>");
			out.println("					<li>");
			out.println("						<a href='EmployeeInterface' target=mw>");
			out.println("							<i class='fa fa-dashboard icon-sidebar'></i>");
			out.println("							Employee Register");
			out.println("						</a>");
			out.println("					</li>");
			out.println("					<li>");
			out.println("						<a href='VehicleInterface' target=mw>");
			out.println("							<i class='fa fa-bomb icon-sidebar'></i>");
			out.println("							Vehicle Register");
			out.println("						</a>");
			out.println("					</li>");
			out.println("					<li>");
			out.println("						<a href='DisplayAllEmployee' target=mw>");
			out.println("							<i class='fa fa-desktop icon-sidebar'></i>");
			out.println("							<i class='fa fa-angle-right chevron-icon-sidebar'></i>");
			out.println("							List of Employees");
			out.println("							</a>");
			out.println("					</li>");
			out.println("					<li>");
			out.println("						<a href='VehicleEditDelete' target=mw>");
			out.println("							<i class='fa fa-flask icon-sidebar'></i>");
			out.println("							<i class='fa fa-angle-right chevron-icon-sidebar'></i>");
			out.println("							Vehicle Edit and Delete");
			out.println("						</a>");
			out.println("					</li>");
			out.println("					<li>");
			out.println("						<a href='AdminLogin'>");
			out.println("							<i class='fa fa-flask icon-sidebar'></i>");
			out.println("							<i class='fa fa-angle-right chevron-icon-sidebar'></i>");
			out.println("							Logout");
			out.println("						</a>");
			out.println("					</li>");
			
			out.println("				</ul>");
			out.println("			</div><!-- /.sidebar-left -->");
			out.println("			<div class='sidebar-right-heading'>");
			out.println("				<ul class='nav nav-tabs square nav-justified'>");
				out.println("				</ul>");
			out.println("			</div><!-- /.sidebar-right-heading -->");
			out.println("			<div class='page-content'>");
			out.println("				<div class='container-fluid'>");
			out.println("				<h1 class='page-heading'></h1>");
			out.println("                <div class='row'>");
			out.println("						<div class='col-lg-12' style='margin-top:-40px;'>");
			out.println("							<!-- BEGIN SITE STATISTIC -->");
			out.println("							<div class='panel panel-default panel-square panel-no-border'>");
			out.println("							  <div class='panel-heading'>");
			//out.println("								<h3 class='panel-title'>SITE STATISTIC</h3>");
			out.println("<h4><font color=green>Admin ID:"+ses.getValue("SAID").toString()+"</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("LDATE").toString()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp<a href=AdminLogin>Logout</a></h4>");

			out.println("</div>");
			out.println("							  <div class='panel-body'>");
			out.println("								<div id='visitors-chart'>");
			out.println("									<div id='visitors-container' style='width: 100%;height:auto; text-align: center; margin:0 auto;'><iframe frameborder=0 height=1200 width=800 name=mw></iframe></div>");
			out.println("</div><!-- /.visitors-chart -->");
			out.println("							  </div><!-- /.panel-body -->");
			out.println("							</div><!-- /.panel panel-default panel-square panel-no-border -->");
			out.println("							<!-- END SITE STATISTIC -->");
			out.println("						</div><!-- /.col-sm-8 -->");
			out.println("					</div><!-- /.row -->");
			out.println("				</div><!-- /.container-fluid -->");
			out.println("				<footer>");
			out.println("				</footer>");
			out.println("				<!-- END FOOTER -->");
			out.println("			</div><!-- /.page-content -->");
			out.println("		</div><!-- /.wrapper -->");
			out.println("		<div id='back-top'>");
			out.println("			<a href='#top'><i class='fa fa-chevron-up'></i></a>");
			out.println("		</div>");
			out.println("		<script src='design/assets/js/jquery.min.js'></script>");
			out.println("		<script src='design/assets/js/bootstrap.min.js'></script>");
			out.println("		<script src='design/assets/js/full-calendar.js'></script>");
			out.println("</body>");
			out.println("</html>");
			



			
		}catch(Exception e){
			response.sendRedirect("AdminLogin");
		}
	}

}
