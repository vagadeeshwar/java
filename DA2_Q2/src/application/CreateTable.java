package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // JDBC driver name and database URL
	static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS";
	static final String USER = "root"; // Database credentials
	static final String PASS = "vaguvagu";

	public CreateTable() throws SQLException, ClassNotFoundException {
		Connection conn = null;
		Statement stmt = null;

		Class.forName(JDBC_DRIVER); // Step-1 : Register the Driver

		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS); // Step-2 : Create Connection

		System.out.println("Creating database..."); // Step-3 : Create Statement
		stmt = conn.createStatement();
		// Create Tables in Students database
		String sql = "CREATE TABLE Marks " + "(id INTEGER not NULL PRIMARY KEY, " + " name VARCHAR(255), "
				+ " physics INTEGER, " + " chemistry INTEGER, " + " maths INTEGER,english INTEGER)";

		stmt.executeUpdate(sql); // Step-4 : Execute Query
		System.out.println("Table created successfully...");

		conn.close();
		stmt.close(); // Step-5 : Close Connection

		System.out.println("Goodbye!");
	}
}
