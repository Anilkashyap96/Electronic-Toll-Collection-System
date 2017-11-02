package com.Anil.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.Anil.Model.Recharge;


public class RechargeDAO {

	static String provider="jdbc:mysql://localhost:3306/TollRoad";
	public static boolean AddNewRecord(Recharge R)
	{   
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn=DriverManager.getConnection(provider,"root","123");
			String query="insert into recharge(cardid,rechargedate,amount) values('"+R.getCardid()+"','"+R.getRechargedate()+"',"+R.getAmount()+")";
			Boolean st=DBHelper.executeUpdate(cn, query);
			return st;
		}
		catch(Exception e){
			System.out.println(e);
			return false;
		}
	}
	public static ResultSet DisplayRechageDetails(String cid){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn=DriverManager.getConnection(provider,"root","123");
			String query="select * from recharge where cardid='"+cid+"'";
			ResultSet rs=DBHelper.executeQuery(cn, query);
			return rs;
		}
		catch(Exception e){
			System.out.println(e);
			return null;
			}
	}


}
