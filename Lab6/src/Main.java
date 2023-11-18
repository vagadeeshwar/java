import java.util.Scanner;

import bank.CurAcct;
import bank.SavAcct;
import multiply.Complex;
import multiply.MyMultiplication;
import primespackage.Prime;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check if prime: ");
		int n = sc.nextInt();
		System.out.println(Prime.checkForPrime(n));
		System.out.print("Enter the lower limit of range to check for twin primes: ");
		int m = sc.nextInt();
		System.out.print("Enter the upper limit: ");
		n = sc.nextInt();
		TwinPrimes(m, n);

		CurAcct curAcct = new CurAcct("a", "a1", 1, 5000, 500, 2000);
		SavAcct savAcct = new SavAcct("b", "b1", 2, 10000, 5);

		System.out.println();
		System.out.print("Savings account balance: ");
		savAcct.displayBalance();

		System.out.print("Savings account balance after a year: ");
		savAcct.computeInterest(1);
		savAcct.displayBalance();

		System.out.print("Current account balance: ");
		curAcct.displayBalance();
		curAcct.deposit(2000);
		System.out.print("After deposit: ");
		curAcct.displayBalance();
		System.out.print("After withdraw: ");
		curAcct.withdraw(6000);
		curAcct.displayBalance();

		System.out.println("5*6=" + MyMultiplication.myMultiplication(5, 6));
		System.out.println("5.3*6.9=" + MyMultiplication.myMultiplication(5.3, 6.9));

		Complex c = MyMultiplication.myMultiplication(new Complex(1, 2), new Complex(5, 6));
		System.out.println("(1+2i)*(5+6i)=" + c.getRe() + " + " + c.getIm() + "i");

	}

	public static void TwinPrimes(int m, int n) {
		int[] arr = new int[n - m + 1];
		int j = 0;
		for (int i = m; i <= n; i++) {
			if (Prime.checkForPrime(i)) {
				arr[j] = i;
				++j;
			}
		}
		for (var i = 0; i < j - 1; i++) {
			if (arr[i + 1] - arr[i] == 2) {
				System.out.println(arr[i] + " " + arr[i + 1]);
			}
		}
	}

}
