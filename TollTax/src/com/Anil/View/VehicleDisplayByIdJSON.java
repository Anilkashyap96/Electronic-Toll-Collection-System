package com.Anil.View;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.Anil.DAO.DBHelper;
import com.Anil.DAO.VehicleDAO;

/**
 * Servlet implementation class VehicleDisplayByIdJSON
 */
@WebServlet("/VehicleDisplayByIdJSON")
public class VehicleDisplayByIdJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleDisplayByIdJSON() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		System.out.print("higbgbgbi");
	    ResultSet rs=VehicleDAO.DisplayById(request.getParameter("vid"));
	   // System.out.print(rs);
	    System.out.print("hi");
	     ArrayList <JSONObject>list=DBHelper.getFormateResult(rs);
			out.println(list);
			System.out.println(list);
	}

}
