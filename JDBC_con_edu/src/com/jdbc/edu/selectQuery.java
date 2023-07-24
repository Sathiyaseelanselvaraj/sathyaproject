package com.jdbc.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectQuery {
	public void doconnection(){
		 Connection con=null;
		 Statement stmt=null;
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
	         con=DriverManager.getConnection
	        		 ("jdbc:mysql://localhost:3306/sakila", "root","@Sathya1999");
		     stmt=con.createStatement(); 
		     
		     ResultSet resultset = stmt.executeQuery("select * from city");
				
				String cityid;
				String cityName;
				String CountryId;
				String LastUpdate;
				
				while(resultset.next()) {
					cityid = resultset.getString("city_id");
					cityName = resultset.getString("city");
					CountryId = resultset.getString("country_id");
					LastUpdate = resultset.getString("last_update");
			System.out.println
					("city_id="+cityid+"  "+"cityName="+cityName+" "+ "CountryId="+CountryId+" "+" "+"LastUpdate="+ LastUpdate);	
				}
		     System.out.println("Executed succesfuly...");
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 finally {
			 try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectQuery obj=new selectQuery();
		obj.doconnection();
	}

}
