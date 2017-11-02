package com.Anil.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;



public class AdminDAO {
static String provider="jdbc:mysql://localhost:3306/TollRoad";
	
	public static boolean CheckPassword(String aid,String pwd)
	{
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();   
			Connection cn=DriverManager.getConnection(provider,"root","123");
		    String query="select * from admin where adminid='"+aid+"' and password='"+pwd+"'";
		    ResultSet rs=DBHelper.executeQuery(cn, query);
		    if(rs.next()){
		    	return true;
		    }
		        return false;
		}catch(Exception e){
			System.out.println(e);
			return false;
		}
		
	}

}
