package com.jdbc.edu;

import java.sql.*;

public class MyConnection {
	
 public void doconnection(){
	 Connection con=null;
	 Statement stmt=null;
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
         con=DriverManager.getConnection
        		 ("jdbc:mysql://localhost:3306/sakila", "root","@Sathya1999");
	     stmt=con.createStatement(); 
	     stmt.executeUpdate("insert into city values(602, 'Bangalore', 91, '2023-07-21 12:00:00')");
	     System.out.println("Executed succesfuly");
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 finally {
		 if(con!=null) {
		 try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyConnection m = new MyConnection();
		m.doconnection();
	}

}
