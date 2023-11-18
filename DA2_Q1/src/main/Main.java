package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public static int fact(int n) {
		if (n == 0)
			return 1;
		return n * fact(n - 1);
	}

	public static int[] fib(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			if (i == 0)
				arr[i] = 0;
			else if (i == 1)
				arr[i] = 1;
			else
				arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr;
	}

	public void start(Stage primaryStage) throws Exception {
		final Boolean[] state = new Boolean[6];
		ToggleGroup group = new ToggleGroup();
		RadioButton button1 = new RadioButton("Factorial");
		RadioButton button2 = new RadioButton("Sum of n Natural Numbers");
		RadioButton button3 = new RadioButton("Positive/Negative");
		RadioButton button4 = new RadioButton("Even/Odd");
		RadioButton button5 = new RadioButton("ASCII");
		RadioButton button6 = new RadioButton("Fibonacci");
		RadioButton[] btn = { button1, button2, button3, button4, button5, button6 };
		Label l = new Label("Select any one of the options");
		button1.setToggleGroup(group);
		button2.setToggleGroup(group);
		button3.setToggleGroup(group);
		button4.setToggleGroup(group);
		button5.setToggleGroup(group);
		button6.setToggleGroup(group);

		TextField text = new TextField();
		Label ans = new Label("nil");
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				int choice = -1;
				for (int i = 0; i < 6; i++) {
					if (btn[i].isSelected()) {
						choice = i;
						break;
					}
				}
				int n;
				String str = "";
				int result;
				switch (choice) {
				case 0:
					n = Integer.parseInt(text.getText());
					ans.setText(fact(n) + "");
					break;
				case 1:
					n = Integer.parseInt(text.getText());
					result = n * (n + 1) / 2;
					ans.setText(result + "");
					break;
				case 2:
					n = Integer.parseInt(text.getText());
					ans.setText(n >= 0 ? "Positive" : "Negative");
					break;
				case 3:
					n = Integer.parseInt(text.getText());
					ans.setText(n % 2 == 0 ? "Even" : "Odd");
					break;
				case 4:
					str = text.getText().trim();
					ans.setText(str.codePointAt(0) + "");
					break;
				case 5:
					n = Integer.parseInt(text.getText());
					for (var x : fib(n))
						str += x + " ";
					ans.setText(str);
					break;
				default:
					ans.setText("Invalid!");
				}

			}
		};

//		ans.setText(text.getText());
		text.setOnAction(event);

		VBox root = new VBox();
		root.setSpacing(10);
		root.getChildren().addAll(l, button1, button2, button3, button4, button5, button6, text, ans);
		Scene scene = new Scene(root, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Q1");
		primaryStage.show();
	}
}