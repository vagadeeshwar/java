package bank;

public class Account {
	protected String name, type;
	protected int accNum;
	protected double balance;

	public Account(String name, String type, int accNum, double balance) {
		this.name = name;
		this.type = type;
		this.accNum = accNum;
		this.balance = balance;
	}

	public void displayBalance() {
		System.out.println(balance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
