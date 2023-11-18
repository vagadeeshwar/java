package primespackage;

public class Prime {
	public static boolean checkForPrime(int n) {
		for (int i = (int) Math.sqrt(n); i >= 2; i--) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}
}
