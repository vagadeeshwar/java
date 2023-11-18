package multiply;

public class MyMultiplication {
	public static int myMultiplication(int a, int b) {
		return a * b;
	}

	public static double myMultiplication(double a, double b) {
		return a * b;
	}

	public static Complex myMultiplication(Complex a, Complex b) {
		double ra = a.getRe(), ia = a.getIm(), rb = b.getRe(), ib = b.getIm();

		double rc = ra * rb - ia * ib;
		double ic = ra * ib + ia * rb;
		return new Complex(rc, ic);

	}

}
