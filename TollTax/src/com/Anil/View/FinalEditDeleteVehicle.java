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

import com.Anil.DAO.VehicleDAO;
import com.Anil.Model.VehicleReg;


/**
 * Servlet implementation class FinalEditDeleteVehicle
 */
@WebServlet("/FinalEditDeleteVehicle")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)
public class FinalEditDeleteVehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalEditDeleteVehicle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try{
			String btn=request.getParameter("btn");
			System.out.println(btn);
		if(btn.equals("Delete"))
		{
			boolean st=VehicleDAO.DeleteById(request.getParameter("vhid"));
			
		}
		else if(btn.equals("Edit")){
			VehicleReg V=new VehicleReg();
			V.setVehicleId(request.getParameter("vhid"));
			V.setVehicletype(request.getParameter("vt"));
			V.setVehicleregistration(request.getParameter("vr"));
			V.setVehiclename(request.getParameter("vn"));
			V.setVehiclecolor(request.getParameter("vco"));
			V.setVehicleownername(request.getParameter("von"));
			V.setAddress(request.getParameter("va"));
			V.setState(request.getParameter("vs"));
			V.setCity(request.getParameter("vc"));
			V.setPhone(request.getParameter("vfon"));
			V.setMobile(request.getParameter("vmob"));
			V.setEmailid(request.getParameter("vmail"));
			//V.setPhotograph(request.getParameter("vpic"));
			
				Part part=request.getPart("vpic");
				  String savepath="C:/Users/Yes iam/workspace/ProjectToll/WebContent/pic";
				  FileUpload F=new FileUpload(part,savepath);
				  V.setPhotograph(F.filename);
			
			boolean st=VehicleDAO.EditById(V);
		}
		response.sendRedirect("VehicleEditDelete");
	}
		catch(Exception e)
	{
		out.println(e);
		System.out.println(e);
	}
out.flush();
	}

}
