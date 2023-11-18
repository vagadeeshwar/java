class EvenPrint extends Thread {
	public void run() {
		for (int i = 2; i <= 50; i += 2)
			System.out.print(i + " ");

		System.out.println();
	}

}

class OddPrint extends Thread {
	public void run() {
		for (int i = 1; i <= 50; i += 2)
			System.out.print(i + " ");

		System.out.println();
	}
}

class PrimePrint extends Thread {

	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public void run() {
		for (int i = 2; i <= 47; i++)
			if (isPrime(i))
				System.out.print(i + " ");
		System.out.println();
	}
}
