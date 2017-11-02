package com.Anil.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.Anil.Model.VehicleReg;



public class VehicleDAO {

	static String provider="jdbc:mysql://localhost:3306/TollRoad";
	 public static boolean AddNewRecord(VehicleReg V)
	 { try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","123");
		 String query="insert into vehiclereg values('"+V.getVehicleId()+"','"+V.getVehicletype()+"','"+V.getVehicleregistration()+"','"+V.getVehiclename()+"','"+V.getVehiclecolor()+"','"+V.getVehicleownername()+"','"+V.getAddress()+"','"+V.getState()+"','"+V.getCity()+"','"+V.getPhone()+"','"+V.getMobile()+"','"+V.getEmailid()+"','"+V.getPhotograph()+"')";
	     boolean st=DBHelper.executeUpdate(cn, query);
	    
	    return st;
	 }catch(Exception e)
	 {System.out.println(e);
		 return false;
	 }}

	 public static ResultSet DisplayAll()
	 { try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","123");
		 String query="select * from vehiclereg";
		ResultSet rs=DBHelper.executeQuery(cn, query);
		  System.out.println(rs);
	    return rs;
	  
	 }catch(Exception e)
	 {System.out.println(e);
		 return null;
	 }}
	public static ResultSet DisplayById(String vid)
	{ try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","123");
		 String query="select * from vehiclereg where vehicleid='"+vid+"'";
		 ResultSet rs=DBHelper.executeQuery(cn, query);
	   return rs;
	}catch(Exception e)
	{System.out.println(e);
		 return null;
	}}
	public static boolean DeleteById(String vhid)
	{
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn=DriverManager.getConnection(provider,"root","123");
			String query="delete from vehiclereg where vehicleid='"+vhid+"'";
			boolean st=DBHelper.executeUpdate(cn, query);
			return st;
		}catch(Exception e){
			System.out.println(e);
					return false;
		}
		}

	public static boolean EditById(VehicleReg V)
	{
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn=DriverManager.getConnection(provider,"root","123");
			String query="update vehiclereg set vehiclename='"+V.getVehiclename()+"',vehicleregistration='"+V.getVehicleregistration()+"',vehiclecolor='"+V.getVehiclecolor()+"',vehicletype='"+V.getVehicletype()+"',vehiclename='"+V.getVehiclename()+"',vehicleownername='"+V.getVehicleownername()+"',phone='"+V.getPhone()+"',mobile='"+V.getMobile()+"',emailid='"+V.getEmailid()+"',address='"+V.getAddress()+"',state='"+V.getState()+"',city='"+V.getCity()+"' where vehicleid='"+V.getVehicleId()+"'";
			System.out.println(query);
			boolean st=DBHelper.executeUpdate(cn, query);
			System.out.println(query);
			if(!V.getPhotograph().equals("")){
				query="update vehiclereg set photograph='"+V.getPhotograph()+"' where vehicleid='"+V.getVehicleId()+"'";
				System.out.println(query);
				 st=DBHelper.executeUpdate(cn, query);
			}
			return st;
		}catch(Exception e){
			System.out.println(e);
					return false;
		}
	}

}
