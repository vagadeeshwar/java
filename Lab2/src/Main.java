import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice:\n1.Fibonacci\n2.Prime\n3.Palindrome\n4.Factorial\n"
				+ "5.Reverse String\n7.P(n,r)\n8.C(n,r)");

		int choice = sc.nextInt();

		while (choice != -1) {
			switch (choice) {
			case 1:
				System.out.print("Enter n: ");
				System.out.println(fib(sc.nextInt()));
				break;
			case 2:
				System.out.print("Enter n: ");
				System.out.println(isPrime(sc.nextInt()));
				break;
			case 3:
				System.out.print("Enter the string: ");
				sc.nextLine();
				System.out.println(palindrome(sc.nextLine()));
				break;
			case 4:
				System.out.print("Enter the number: ");
				System.out.println(fact(sc.nextInt()));
				break;
			case 5:
				System.out.print("Enter the string: ");
				sc.nextLine();
				System.out.println(reverse(sc.nextLine()));
				break;
			case 7:
				System.out.print("Enter n&r: ");
				System.out.println(permutation(sc.nextInt(), sc.nextInt()));
				break;
			case 8:
				System.out.print("Enter n&r: ");
				System.out.println(combination(sc.nextInt(), sc.nextInt()));

			}
			System.out.print("Enter your choice:\n1.Fibonacci\n2.Prime\n3.Palindrome\n4.Factorial\n"
					+ "5.Reverse String\n6.Duplicate char in String\n7.P(n,r)\n8.C(n,r)");
			choice = sc.nextInt();
		}
	}

	public static int fib(int n) {
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static int fact(int n) {
		if (n == 0)
			return 1;
		return n * fact(n - 1);
	}

	public static boolean palindrome(String s) {
		for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
			if (s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}

	public static String reverse(String s) {
		String sNew = "";
		for (int i = 0; i < s.length(); i++) {
			sNew = s.charAt(i) + sNew;
		}
		return sNew;
	}

	public static int permutation(int n, int r) {
		return fact(n) / fact(n - r);
	}

	public static int combination(int n, int r) {
		return fact(n) / (fact(r) * fact(n - r));
	}

}
