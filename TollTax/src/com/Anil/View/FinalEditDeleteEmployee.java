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
 * Servlet implementation class FinalEditDeleteEmployee
 */
@WebServlet("/FinalEditDeleteEmployee")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)
public class FinalEditDeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalEditDeleteEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try{
			String btn=request.getParameter("btn");
		if(btn.equals("Delete"))
		{
			boolean st=EmployeeDAO.DeleteById(request.getParameter("eid"));
			
		}
		else if(btn.equals("Update")){
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
			//E.setPhotograph(request.getParameter("epic"));
			
				Part part=request.getPart("epic");
				  String savepath="C:/Users/Yes iam/workspace/ProjectToll/WebContent/pic";
				  FileUpload F=new FileUpload(part,savepath);
				  E.setPhotograph(F.filename);
			
			boolean st=EmployeeDAO.EditById(E);
		}
		response.sendRedirect("DisplayAllEmployee");
	}
		catch(Exception e)
	{
		out.println(e);
		System.out.println(e);
	}
out.flush();

	}

}
