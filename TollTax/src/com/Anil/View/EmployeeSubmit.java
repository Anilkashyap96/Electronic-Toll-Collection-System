package com.Anil.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import com.Anil.DAO.EmployeeDAO;
import com.Anil.Model.Employee;


/**
 * Servlet implementation class EmployeeSubmit
 */
@WebServlet("/EmployeeSubmit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)

public class EmployeeSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=response.getWriter();
		  Employee E=new Employee();
		  E.setEmployeeid(request.getParameter("eid"));
		  E.setEmployeename(request.getParameter("en"));
		  E.setFathersname(request.getParameter("efn"));
		  E.setBirthdate(request.getParameter("dob"));
		  E.setGender(request.getParameter("eg"));
		  E.setAddress(request.getParameter("ea"));
		  E.setState(request.getParameter("es"));
		  E.setCity(request.getParameter("ec"));
		  E.setContactnumber(request.getParameter("econ"));
		  E.setMobileno(request.getParameter("emob"));
		  E.setEmailid(request.getParameter("email"));
		  E.setDateofjoining(request.getParameter("ejoin"));
		  E.setQualification(request.getParameter("eq"));
		  E.setDesignation(request.getParameter("ed"));
		  E.setPassword(request.getParameter("epass"));
		  //E.setPhotograph(request.getParameter("epic"));
		  Part part=request.getPart("epic");
		  String savepath="A:/Eclipse/Workspace/TollTax/WebContent/pic";
		  FileUpload F=new FileUpload(part,savepath);
		  E.setPhotograph(F.filename);
		 
		  boolean st=EmployeeDAO.AddNewRecord(E);
		  out.println("<html>");
		  System.out.println("ggg");
		  if(st)
		  {out.println("<h3><font color=green>Record Submitted<br><a href=EmployeeInterface>Click Here to Add More Employee..</a></font></h3>");
			System.out.println("submitted");
		  }
		  else
		  {
			  
			  out.println("<h3><font color=red>Fail to Record Submitted<br><a href=EmployeeInterface>Click Here to Add More Employee..</a></font></h3>");  
			  
		  }  
			  
		  out.println("</html>");
		  out.flush();
		  
		  
		  
		  
		  
		  
	
	}

}
