package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
//		new CreateDatabase(); //Both these statements to be run only once in the absence of the database/table
//		new CreateTable();

		Label l1 = new Label("Physics");
		Label l2 = new Label("Chemistry");
		Label l3 = new Label("Maths");
		Label l4 = new Label("English");
		Label l5 = new Label("Student name");
		Label l6 = new Label("Student Id");
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		TextField tf4 = new TextField();
		TextField tf5 = new TextField();
		TextField tf6 = new TextField();
		TextField tf7 = new TextField();

		Button btn1 = new Button("Submit");
		Button btn2 = new Button("Submit");

		GridPane root = new GridPane();
		Scene scene = new Scene(root, 500, 200);

		root.setVgap(10.0);
		root.setHgap(10.0);

		root.addRow(0, l6, tf6);
		root.addRow(1, l5, tf5);
		root.addRow(2, l1, tf1);
		root.addRow(3, l2, tf2);
		root.addRow(4, l3, tf3);
		root.addRow(5, l4, tf4);

		root.addRow(6, btn1);

		root.addRow(8, new Label("Enter Student Id to Search"), tf7);
		root.addRow(9, btn2);
		root.addRow(11, new Label("Id"), new Label("Name"), new Label("Physics"), new Label("Chemistry"),
				new Label("Maths"), new Label("English"), new Label("Phy_Grade"), new Label("Chem_Grade"),
				new Label("Math_Grade"), new Label("Eng_Grade"), new Label("Total Marks"), new Label("Average"));

		Label[] values = new Label[12];
		for (int i = 0; i < 12; i++)
			values[i] = new Label("");
//		root.addRow(12, values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7],
//				values[8], values[9], values[10], values[11]);
		root.addRow(12, values);

		EventHandler<ActionEvent> handler1 = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("btn1 clicked!");
				try {
					int phy = Integer.parseInt(tf1.getText()), chem = Integer.parseInt(tf2.getText()),
							math = Integer.parseInt(tf3.getText()), eng = Integer.parseInt(tf4.getText());
					int sum = phy + chem + math + eng;
					double avg = sum / 4.0;
					int[] arr = { phy, chem, math, eng };
					char[] arr_grade = new char[4];
					for (int i = 0; i < 4; i++) {
						if (arr[i] >= 80)
							arr_grade[i] = 'A';
						else if (arr[i] >= 60)
							arr_grade[i] = 'B';
						else if (arr[i] >= 40)
							arr_grade[i] = 'C';
						else if (arr[i] >= 20)
							arr_grade[i] = 'D';
						else
							arr_grade[i] = 'E';
					}
					new AddTuple(Integer.parseInt(tf6.getText()), tf5.getText(), phy, chem, math, eng, arr_grade[0],
							arr_grade[1], arr_grade[2], arr_grade[3], sum, avg);
				} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
			}

		};

		btn1.setOnAction(handler1);

		EventHandler<ActionEvent> handler2 = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("btn2 clicked!");

				final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // JDBC driver name and database URL
				final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS";
				final String USER = "root"; // Database credentials
				final String PASS = "vaguvagu";

				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName(JDBC_DRIVER); // Step-1 : Register the Driver

					System.out.println("Connecting to database...");
					conn = DriverManager.getConnection(DB_URL, USER, PASS); // Step-2 : Create Connection

					stmt = conn.createStatement();

					String sql = "SELECT * FROM Marks WHERE id=" + tf7.getText();
					ResultSet rs = stmt.executeQuery(sql); // Step-4 : Execute Statement

					rs.next();
					values[0].setText(rs.getInt("id") + "");
					values[1].setText(rs.getString("name"));
					values[2].setText(rs.getInt("physics") + "");
					values[3].setText(rs.getInt("chemistry") + "");
					values[4].setText(rs.getInt("maths") + "");
					values[5].setText(rs.getInt("english") + " ");
					values[6].setText(rs.getString("phy_grade"));
					values[7].setText(rs.getString("chem_grade"));
					values[8].setText(rs.getString("math_grade"));
					values[9].setText(rs.getString("eng_grade"));
					values[10].setText(rs.getInt("total") + "");
					values[11].setText(rs.getDouble("average") + "");

					// Display values
//					System.out.print(id + "\t");
//					System.out.print(age + "\t");
//					String padded = String.format("%15s", first).replace(' ', ' ');
//					System.out.print(padded + "\t\t");
//					System.out.println(last);

					System.out.println("Retrieved Record successfully...");

					conn.close();
					rs.close();
					stmt.close(); // Step-5 : Close Connection

					System.out.println("Goodbye!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		};

		btn2.setOnAction(handler2);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Q2");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
