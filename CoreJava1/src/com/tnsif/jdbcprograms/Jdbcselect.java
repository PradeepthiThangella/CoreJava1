package com.tnsif.jdbcprograms;

import java.sql.*;
import javax.sql.*; //step 1: import package

public class Jdbcselect
{
   public static void main(String[] args) {

	//step2: load and register the driver
	
	   //step3: Establish connection
	
	try {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hyd11","root","root");
				
		//step4:create statement
		
		Statement st=conn.createStatement();
		
		//step5 : execute query
		
		String strselect="Select booktitle,price,qty from books";
		
				//process the result to display
		
				ResultSet rst=st.executeQuery(strselect);
		System.out.println("The records are");
		int rowcount=0;
		while(rst.next())
		{
			String booktitle=rst.getString("booktitle");
			int price=rst.getInt("price");
			int qty=rst.getInt("qty");
			
			System.out.println(booktitle+" "+price+" "+qty);
			++rowcount;

		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
	}
}
}
