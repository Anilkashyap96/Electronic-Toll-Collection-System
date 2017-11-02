package com.Anil.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.Anil.Model.CardIssue;



public class CardIssueDAO {

	static String provider="jdbc:mysql://localhost:3306/TollRoad";
	
	 public static boolean AddNewRecord(CardIssue C)
	 { try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","123");
		 String query="insert into carddetails values('"+C.getEmployeeid()+"','"+C.getCardid()+"','"+C.getVehicleid()+"','"+C.getChargetype()+"',"+C.getAmount()+",'"+C.getIssuedate()+"','"+C.getExpdate()+"',"+C.getBalance()+")";
		    boolean st=DBHelper.executeUpdate(cn, query);
	    
	    return st;
	 }catch(Exception e)
	 {System.out.println(e);
		 return false;
	 }}
	
public static ResultSet FetchVehicleAndCardDeatils(String cid){
	try{
		
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	Connection cn=DriverManager.getConnection(provider,"root","123");
	String query="select v.vehicleid,v.vehiclename,v.vehicleownername,v.vehicleregistration,c.chargetype,c.amount,c.issuedate,c.expdate,c.balance from vehiclereg v,carddetails c where v.vehicleid=c.vehicleid and c.cardid='"+cid+"'";
	ResultSet rs=DBHelper.executeQuery(cn, query);
	return(rs);
	}
	catch(Exception e){
		System.out.println(e);
		return null;
	}
}
public static boolean UpdateOnRecharge(CardIssue C)
{
	try{
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	Connection cn=DriverManager.getConnection(provider,"root","123");
	String query="update carddetails set chargetype='"+C.getChargetype()+"',amount="+C.getAmount()+",issuedate='"+C.getIssuedate()+"',expdate='"+C.getExpdate()+"',balance="+C.getBalance()+" where cardid='"+C.getCardid()+"'";
	Boolean st=DBHelper.executeUpdate(cn, query);
	return st;
	}
	catch(Exception e){
		System.out.println(e);
		return false;
	}
	}


}
