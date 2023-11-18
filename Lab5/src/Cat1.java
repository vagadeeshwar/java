import java.util.Scanner;

import package2.StudentDetails;
import q4.ProjectManager;
import q4.SystemEngineer;
import q4.TechnicalAsst;
import questions.Q1;
import questions.Q2;
import questions.TollPlaza;

public class Cat1 {

	public static void main(String[] args) {
		String text = "Welcome to VIT Chennai Campus. Have a great learning experience. Wishing you all the best for this semester. Thank you for your cooperation.";
		System.out.println("Number of sentences is: " + Q1.numOfSentences(text));
		System.out.println("Number of words starting with c is: " + Q1.startC(text));

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Q2.matTranspose(matrix);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		TollPlaza vehicle1 = new TollPlaza("Car");
		TollPlaza vehicle2 = new TollPlaza("Lorry");
		System.out.println("Toll for Car: " + vehicle1.tollRate());
		System.out.println("Toll for Government Lorry: " + vehicle2.tollRate(true));

		ProjectManager manager = new ProjectManager(1, "a", "manager", 1000, 500, 500, 100);
		SystemEngineer engineer = new SystemEngineer(2, "b", "engineer", 800, 400);
		TechnicalAsst asst = new TechnicalAsst(3, "c", "asst", 400);
		System.out.println("Salary of manager: " + manager.ComputeSalary());
		System.out.println("Salary of engineer: " + engineer.ComputeSalary());
		System.out.println("Salary of assisstant: " + asst.ComputeSalary());

		System.out.println("1.New Student\n2.Change Hostel\n3.Check Availability\n4.Display\n5.Exit");
		int choice, i = 0;
		StudentDetails objArr[] = new StudentDetails[50];

		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		while (choice != 5) {
			switch (choice) {
			case 1:
				objArr[i] = new StudentDetails("Kavery", 5, 24, "Dinesh", "Maths", 1, 49);
//				++i
				break;
			case 2:
				objArr[i].name = "Narmada";
				break;
			case 3:
				if (objArr[i].stuName == "Dinesh") {
					System.out.println(true);
				} else {
					System.out.println(false);
				}
				break;
			case 4:
				if (objArr[i].regNum == 1) {
					objArr[i].display();
				} else {
					System.out.println(false);
				}
			}
			choice = sc.nextInt();
		}
	}
}