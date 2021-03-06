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
import com.Anil.DAO.RechargeDAO;

/**
 * Servlet implementation class RechargeReportJSON
 */
@WebServlet("/RechargeReportJSON")
public class RechargeReportJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RechargeReportJSON() {
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

		ResultSet rs=RechargeDAO.DisplayRechageDetails(request.getParameter("cid"));
		
		ArrayList<JSONObject>list=DBHelper.getFormateResult(rs);
		
		out.println(list);
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
