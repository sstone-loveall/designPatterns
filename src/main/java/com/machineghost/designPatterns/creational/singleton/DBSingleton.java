package com.machineghost.designPatterns.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Demo of Singleton pattern used for connections to Derby in-memory DB
 * @author Pluralsight
 * Credit:Pluralsight
 */
public class DBSingleton {

	// lazy load
	private static DBSingleton instance = null;
	
	private Connection conn = null;

	private DBSingleton () {
		try {
			// register the driver
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DBSingleton getInstance() {
		if (instance == null) {
			// thread-safe; put it here instead of method signature to save processing
			synchronized(DBSingleton.class) {
				if (instance == null) {
					instance = new DBSingleton();
				}
			}
		}
		return instance;
	}
	
	/**
	 * Get a connection to the DB. Requires an instance of DBSingleton. 
	 * @return Connection to DB
	 */
	public Connection getConnection() {
		if (conn == null) {
			synchronized (DBSingleton.class) {
				if (conn == null) {
					try {
						String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
						
						conn = DriverManager.getConnection(dbUrl);
					} 
					catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		return conn;
	}
}

