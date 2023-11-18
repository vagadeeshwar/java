package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddTuple {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // JDBC driver name and database URL
	static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS";
	static final String USER = "root"; // Database credentials
	static final String PASS = "vaguvagu";

	public AddTuple(int id, String name, int physics, int chemistry, int maths, int english, char phy_g, char chem_g,
			char math_g, char eng_g, int total, double avg) throws SQLException, ClassNotFoundException {
		Connection conn = null;
		Statement stmt = null;

		Class.forName(JDBC_DRIVER); // Step-1 : Register the Driver

		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS); // Step-2 : Create Connection

		stmt = conn.createStatement();

		String sql = "INSERT INTO Marks VALUES(" + id + ",'" + name + "'," + physics + "," + chemistry + "," + maths
				+ "," + english + ",'" + phy_g + "','" + chem_g + "','" + math_g + "','" + eng_g + "'," + total + ","
				+ avg + ")";
		System.out.println(sql);
		stmt.executeUpdate(sql);
		// Step-4 : Execute Query

		System.out.println("Inserted Record successfully...");

		conn.close(); // Step-5 : Close Connection
		stmt.close();

		System.out.println("Goodbye!");
	}

}
