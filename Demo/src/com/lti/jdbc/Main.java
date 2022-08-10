package com.lti.jdbc;

import java.sql.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url="";
        String username="";
        String password="";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");  // Step 2 
            url="jdbc:oracle:thin:@localhost:1521:xe";  // type 4
            username="ABHI";
            password="abhi12317";

            con= DriverManager.getConnection(url,username,password);  // Step 3
            String query = "select * from EMP";
            
            stmt = con.createStatement();
            rs= stmt.executeQuery(query); // Execute query
            rs.next();
            String name = rs.getString("ENAME"); // Retrieve name from db
            	 
            System.out.println(name); // Print result on console
            
            stmt.close(); // close statement
            con.close(); // close connection
            System.out.println("Connection Closed....");
            
            con.close(); 


        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }
        
	}

}
