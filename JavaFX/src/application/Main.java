//package application;
//
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextField;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//
//		TextField inp = new TextField("Enter the number");
//		TextField out = new TextField("Result");
//
//		Button reverse = new Button("Reverse of a Number");
//		Button armstrong = new Button("Armstrong");
//		Button binary = new Button("Decimal to Binary");
//		Button palindrome = new Button("Palindrome");
//
//		Group root = new Group();
//
//		inp.setLayoutX(530);
//		inp.setLayoutY(200);
//		inp.setMinWidth(300);
////		inp.setBackground(Color.web("#e7e6e6"));
//		inp.setStyle("background-color:#e7e6e6");
//		inp.setAlignment(Pos.CENTER);
////		Insets i = new Insets(10);
////		inp.setPadding(i);
//
//		armstrong.setLayoutX(600);
//		armstrong.setLayoutY(300);
////		armstrong.setMinWidth(180);
//
////		HBox row2 = new HBox();
////		row2.setLayoutX(450);
////		row2.setLayoutY(300);
////		row2.setSpacing(50);
//
////		row2.getChildren().addAll(reverse, armstrong, binary);
//
//		root.getChildren().addAll(inp, armstrong);
//
//		Scene scene = new Scene(root, 500, 200);
//		scene.setFill(Color.web("#e7e6e6"));
//		primaryStage.setScene(scene);
//		primaryStage.setTitle("Lab10");
//		primaryStage.show();
//	}
//
//	public static void main(String[] args) {
//		launch(args);
//	}
//}

package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	@Override

	public void start(Stage primaryStage) {

		// Create the top section of the UI
		Text tNumber1 = new Text("Enter the number: ");
		Text tResult = new Text("Result:");
		TextField tfNumber1 = new TextField();
		TextField tfResult = new TextField();
		tfResult.setEditable(false);

		// Create the bottom section of the UI
		Button bRev = new Button(" Reverse of a Number ");
		Button bArm = new Button(" Armstrong ");
		Button bD2B = new Button(" Decimal to Binary ");
		Button bPal = new Button(" Palindrome ");
		// Button btsum = new Button(" Sum of 0:n ");
		// Button btfib = new Button(" Fibonacci ");

		// Add top and bottom UI to HBox containers
		GridPane gridPane = new GridPane(); // Setting size for the pane
		gridPane.setMinSize(400, 200); // Setting the padding
		gridPane.setPadding(new Insets(10, 10, 10, 10)); // Setting the vertical and horizontal gaps between the columns
		gridPane.setVgap(5);
		gridPane.setHgap(5); // Setting the Grid alignment
		gridPane.setAlignment(Pos.CENTER); // Arranging all the nodes in the grid

		gridPane.add(tNumber1, 0, 0);
		gridPane.add(tfNumber1, 1, 0);
		gridPane.add(bRev, 0, 1);
		gridPane.add(bArm, 1, 1);
		gridPane.add(bD2B, 2, 1);
		gridPane.add(bPal, 0, 2);
		gridPane.add(tResult, 0, 3);
		gridPane.add(tfResult, 1, 3);
		tfNumber1.setStyle("-fx-text-box-border: blue");
		tfResult.setStyle("-fx-text-box-border: blue");
		bRev.setStyle("-fx-border-color: #B22222;");
		bArm.setStyle("-fx-border-color: #B22222;");
		bD2B.setStyle("-fx-border-color: #B22222;");
		bPal.setStyle("-fx-border-color: #B22222;");
		// btfib.setStyle("-fx-border-color: #B22222;");
		// btsum.setStyle("-fx-border-color: #B22222;");
		// button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill:
		// white;"); // Register event handlers for buttons
		bRev.setOnAction(e -> {
			int n = Integer.parseInt(tfNumber1.getText());
			int rev = 0, rem, i = 0;
			int dig[] = new int[10];
			while (n > 0) {
				rem = (n % 10);
				// rev=(int)(rev*Math.pow(10,i++))+ rem;
				dig[i++] = rem;
				n /= 10;
				// System.out.println(rem);

			}

			for (int k = i - 1, j = 0; j < i; k--, j++) {
				rev += dig[j] * Math.pow(10, k);
			}
			tfResult.setText(String.valueOf(rev));
		});
		bPal.setOnAction(e -> {
			int r, sum = 0, temp;
			int n = Integer.parseInt(tfNumber1.getText());
			temp = n;
			while (n > 0) {
				r = n % 10; // getting remainder
				sum = (sum * 10) + r;
				n = n / 10;
			}
			if (sum == temp)
				tfResult.setText("It is a palindrome");
			else
				tfResult.setText("It is not a palindrome");
			;

		});
		bD2B.setOnAction(e -> {
			int a = Integer.parseInt(tfNumber1.getText());
			int bin[] = new int[10];
			int dec = a, i;
			for (i = 0; dec > 1; i++) {
				bin[i] = dec % 2;
				dec /= 2;
			}
			bin[i] = dec;
			String res = " ";
			for (int j = i; j >= 0; j--)
				res = res + bin[j];
			tfResult.setText(res);

		});
		bArm.setOnAction(e -> {
			int n = Integer.parseInt(tfNumber1.getText());
			int temp, digits = 0, last = 0, sum = 0;
			temp = n;
			while (temp > 0) {
				temp = temp / 10;
				digits++;
			}
			temp = n;
			while (temp > 0) {
				last = temp % 10;
				sum += (Math.pow(last, digits));
				temp = temp / 10;
			}

			if (n == sum)
				tfResult.setText("It is Armstrong");
			else
				tfResult.setText("It is not Armstrong");
		});

		Scene scene = new Scene(gridPane);
		primaryStage.setTitle("Java FX Lab 10 ");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
