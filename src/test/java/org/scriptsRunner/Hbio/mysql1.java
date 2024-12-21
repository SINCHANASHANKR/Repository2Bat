package org.scriptsRunner.Hbio;

import java.sql.DriverManager;
import java.sql.SQLException;

public class mysql1 {
	public static void main(String[] args) throws ClassNotFoundException {
		String dbURL="jdbc:mysql://localhost:3306/advsel"; //path of db
		Class.forName("com.mysql.cj.jdbc.Driver"); //connector file path to db
		
		try {
			DriverManager.getConnection(dbURL, "root", "root");
			System.out.println("connection established");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("connection failed");
		}
		
		
	}

}
