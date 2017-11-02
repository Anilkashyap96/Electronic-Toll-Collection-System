package com.Anil.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Anil.DAO.CardIssueDAO;
import com.Anil.DAO.RechargeDAO;
import com.Anil.Model.CardIssue;
import com.Anil.Model.Recharge;

/**
 * Servlet implementation class RechargeSubmit
 */
@WebServlet("/RechargeSubmit")
public class RechargeSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RechargeSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Recharge R=new Recharge();
		R.setCardid(request.getParameter("cn"));
		R.setRechargedate(request.getParameter("isd"));
		R.setAmount(Integer.parseInt(request.getParameter("amt")));
		boolean st=RechargeDAO.AddNewRecord(R);
		if(st){
			CardIssue C=new CardIssue();
			C.setCardid(request.getParameter("cn"));
			C.setChargetype(request.getParameter("ct"));
			C.setAmount(request.getParameter("amt"));
			C.setIssuedate(request.getParameter("isd"));
			C.setExpdate(request.getParameter("expd"));
			C.setBalance(request.getParameter("amt"));
			CardIssueDAO.UpdateOnRecharge(C);
			out.println("<html>");
			out.println("<h3><font color=green>Record Submitted<br><a href=RechargeInterface>Click Here to Recharge More Cards..</a></font></h3>"); 
		}
		else
		{
			 out.println("<h3><font color=green>Fail to Submit Record<br><a href=RechargeInterface>Click Here to Recharge More Cards..</a></font></h3>");
	         out.println("</html>");
		}
	
	}

}
