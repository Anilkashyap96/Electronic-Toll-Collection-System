package com.Anil.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.Anil.Model.Employee;

public class EmployeeDAO {

	static String provider="jdbc:mysql://localhost:3306/tollroad";
	 public static boolean AddNewRecord(Employee E)
	 { try{
		 System.out.println("fddhello");
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		System.out.println("hello");
		 Connection cn=DriverManager.getConnection(provider,"root","123");
	System.out.println("hello");
		 String query="insert into employee values('"+E.getEmployeeid()+"','"+E.getEmployeename()+"','"+E.getFathersname()+"','"+E.getBirthdate()+"','"+E.getGender()+"','"+E.getAddress()+"','"+E.getState()+"','"+E.getCity()+"','"+E.getContactnumber()+"','"+E.getMobileno()+"','"+E.getEmailid()+"','"+E.getDateofjoining()+"','"+E.getQualification()+"','"+E.getDesignation()+"','"+E.getPassword()+"','"+E.getPhotograph()+"')";
	    boolean st=DBHelper.executeUpdate(cn, query);
	    
	    return st;
	 }catch(Exception e)
	 {
		 return false;
	 }}
	 
	public static ResultSet DisplayAll()
	{ try
	{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection cn=DriverManager.getConnection(provider,"root","123");
		String query="select * from employee";
		ResultSet rs=DBHelper.executeQuery(cn, query);
		return rs;
		
	}catch(Exception e){
		return null;
	}
		 }
	public static ResultSet DisplayById(String eid)
	{
		try{ Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection cn=DriverManager.getConnection(provider,"root","123");
		String query="select * from employee where employeeid='"+eid+"'";
		ResultSet rs=DBHelper.executeQuery(cn, query);
		return rs;
		}
		catch(Exception e){
			System.out.println(e);
			return null;	
		}
		}
	public static boolean DeleteById(String eid)
	{
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn=DriverManager.getConnection(provider,"root","123");
			String query="delete from employee where employeeid='"+eid+"'";
			boolean st=DBHelper.executeUpdate(cn, query);
			return st;
		}catch(Exception e){
			System.out.println(e);
					return false;
		}
		}
	public static boolean EditById(Employee E)
	{
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn=DriverManager.getConnection(provider,"root","123");
			String query="update employee set employeename='"+E.getEmployeename()+"',fathersname='"+E.getFathersname()+"',birthdate='"+E.getBirthdate()+"',gender='"+E.getGender()+"',address='"+E.getAddress()+"',state='"+E.getState()+"',city='"+E.getCity()+"',contactnumber='"+E.getContactnumber()+"',emailid='"+E.getEmailid()+"',dateofjoining='"+E.getDateofjoining()+"',qualification='"+E.getQualification()+"',designation='"+E.getDesignation()+"' where employeeid='"+E.getEmployeeid()+"'";
			System.out.println(query);
			boolean st=DBHelper.executeUpdate(cn, query);
			System.out.println(query);
			if(!E.getPhotograph().equals("")){
				query="update employee set photograph='"+E.getPhotograph()+"' where employeeid='"+E.getEmployeeid()+"'";
				System.out.println(query);
				 st=DBHelper.executeUpdate(cn, query);
			}
			return st;
		}catch(Exception e){
			System.out.println(e);
					return false;
		}
		}
	public static Employee CheckPassword(String eid,String pwd){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn=DriverManager.getConnection(provider,"root","123");
			String query="select * from Employee where Employeeid='"+eid+"'and password='"+pwd+"'";
			
			ResultSet rs=DBHelper.executeQuery(cn, query);
			if(rs.next()){
				
				 Employee E=new Employee();
				   E.setEmployeeid(rs.getString(1));
				   E.setEmployeename(rs.getString(2));
				   E.setPhotograph(rs.getString(16));
				   return(E);
			}
			return null;
			
		}
		catch(Exception e){
			System.out.println(e);
			return null;
		}
	}

	
	
	
}
