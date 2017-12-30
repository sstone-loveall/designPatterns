package com.machineghost.designPatterns.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Demonstration of singleton pattern. Shows that two instances are the same object.
 * @author S. Stone-Loveall
 * Credit: Pluralsight
 */
public class LazyLoadSingletonDemo {
	
	/**
	 * Demonstrate the Singleton object
	 */
	private void demoLazyLoadSingleton() {
		LazyLoadSingleton instance = LazyLoadSingleton.getInstance();
		
		LazyLoadSingleton secondInstance = LazyLoadSingleton.getInstance();
		
		// demonstrate these are the same objects
		System.out.println(instance.equals(secondInstance));
	}
	
	/**
	 * Demonstrate the Singleton object with a "real world" example
	 */
	private void demoDBSingleton() {
		DBSingleton instance = DBSingleton.getInstance();
		
		Connection conn = instance.getConnection();
		
		Statement stmt;
		try {
			String sql = "CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))";
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Table created.");
			stmt.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBSingleton secondInstance = DBSingleton.getInstance();
		Connection secondConn = secondInstance.getConnection();
		
		// demonstrate the objects are the same
		System.out.println(instance.equals(secondInstance));
		System.out.println(conn.equals(secondConn));
	}
	
	public static void main(String arg []) {
		LazyLoadSingletonDemo demo = new LazyLoadSingletonDemo();
		demo.demoLazyLoadSingleton();
		demo.demoDBSingleton();
	}
}
