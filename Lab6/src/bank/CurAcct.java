package bank;

public class CurAcct extends Account {
	private double serviceCharge, minBalance;

	public CurAcct(String name, String type, int accNum, double balance, double serviceCharge, double minBalance) {
		super(name, type, accNum, balance);
		this.setServiceCharge(serviceCharge);
		this.setMinBalance(minBalance);
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (balance < minBalance) {
			System.out.println("Deposit more money");
			return;
		}
		balance -= amount;
		if (balance < minBalance) {
			balance -= serviceCharge;
		}
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

}
