package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		try {
			if (str.length() > 2)
				splitString(str);
			else
				throw new NullPointerException();
		} catch (Exception e) {
//			e.printStackTrace();
		} finally {
			System.out.println("Inside finally");
		}
	}

	static void splitString(String str) {
		int i = 0;
		for (var x : str.split("/")) {
			System.out.println(i + x);
			i++;
		}
	}

}
