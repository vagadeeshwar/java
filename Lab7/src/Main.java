import java.util.Scanner;

import Q1.BooleanCourse;
import Q1.Diploma;
import Q1.GradedCourse;
import Q2.Queensland;
import Q2.ThemePark;
import Q2.Wonderla;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		BooleanCourse course1 = new BooleanCourse("Statistics", true), course2 = new BooleanCourse("Physics", true);
		GradedCourse course3 = new GradedCourse("Chemistry", "B"), course4 = new GradedCourse("Humanitites", "E");
		System.out.println(Diploma.diplomaPassed(course1, course2, course3, course4));

		System.out.println("Total Cost: " + ThemePark.totalCost(5, 4));
		Queensland obj1 = new Queensland();
		Wonderla obj2 = new Wonderla();
		obj1.playGame();
		obj1.playGame();
		for (int i = 0; i < 5; i++)
			obj2.playGame();
		obj2.playedCount();

		System.out.print("Enter reg number and mobile number: ");
		String regNum = sc.nextLine(), mobNum = sc.nextLine();

		if (regNum.length() != 9 || mobNum.length() != 10) {
			System.out.println("invalid");
			throw new Exception("IllegalArgumentException");
		} else if (!onlyDigit(mobNum)) {
			System.out.println("invalid");

			throw new Exception("NumberFormatException");
		} else if (!onlyDigitAlpha(regNum)) {
			System.out.println("invalid");

			throw new Exception("NoSuchElementException");
		} else
			System.out.println("valid");
	}

	public static boolean onlyDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i) >= 48 && str.charAt(i) <= 57))
				return false;
		}
		return true;
	}

	public static boolean onlyDigitAlpha(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!((str.charAt(i) >= 48 && str.charAt(i) <= 57) || (str.charAt(i) >= 65 && str.charAt(i) <= 90)
					|| (str.charAt(i) >= 97 && str.charAt(i) <= 122)))
				return false;
		}
		return true;
	}
}
