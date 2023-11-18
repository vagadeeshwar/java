package bank;

public class SavAcct extends Account {
	private double rate;

	public SavAcct(String name, String type, int accNum, double balance, double rate) {
		super(name, type, accNum, balance);
		this.rate = rate;
	}

	public void computeInterest(int year) {
		balance = balance * Math.pow((1 + getRate() / 100), year);
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}
