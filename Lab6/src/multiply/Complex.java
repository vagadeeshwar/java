package multiply;

public class Complex {
	private double re, im;

	public Complex(double re, double im) {
		this.re = re;
		this.setIm(im);
	}

	public double getRe() {
		return re;
	}

	public void setRe(double re) {
		this.re = re;
	}

	public double getIm() {
		return im;
	}

	public void setIm(double im) {
		this.im = im;
	}
}
