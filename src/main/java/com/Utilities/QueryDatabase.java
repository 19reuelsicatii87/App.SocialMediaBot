package com.Utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class QueryDatabase {
	
	static Connection connection = null;
	static PreparedStatement prepStatement = null;
	static Statement statement = null;

	
	public static void ConnectionBuildUp() throws SQLException{
		System.out.println("-------- DB Connection Build Up will now start ------------");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("No MySQL JDBC Driver was availabe");
			e.printStackTrace();
			return;
		}
		
		try {
			connection = DriverManager
			.getConnection("jdbc:mysql://10.10.3.196:3306/staging_central","weng", "weng12345");
			

		} catch (SQLException e) {
			System.out.println("Failed to make connection!");
			e.printStackTrace();
			return;
		}
		
	}
	
	public static String ReturnSpecificData (String Query, String identifier) throws SQLException{
		ConnectionBuildUp();
		String finalResult = null;
		if (connection != null) {
			prepStatement = connection.prepareStatement(Query);
			ResultSet result = prepStatement.executeQuery();
			  while(result.next()) {
				  finalResult = result.getString(identifier);
			
			  	}
			  prepStatement.close();
			
		} else {
			System.out.println("Failed to make connection!");
		}
		
		return finalResult;
	}
	
	public static void DeleteSpecificData (String Query) throws SQLException{
		ConnectionBuildUp();
		
		statement = connection.createStatement();
		statement.executeUpdate(Query);
		
	}
}
