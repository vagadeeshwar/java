
public class SavingsAccount {

	static double annualInterestRate;
	private double savingsBalance;

	public static void main(String[] args) {
		SavingsAccount.annualInterestRate = 0.04;
		SavingsAccount saver1 = new SavingsAccount(2000), saver2 = new SavingsAccount(3000);

		System.out.println("Monthly Interest 0.04");
		System.out.println(saver1.calculateMonthlyInterest());
		System.out.println(saver2.calculateMonthlyInterest() + "\n");

		System.out.println("New Balances");
		System.out.println(saver1.getSavingsBalance());
		System.out.println(saver2.getSavingsBalance() + "\n");

		modifyInterestRate(0.05);

		System.out.println("Monthly Interest 0.05");
		System.out.println(saver1.calculateMonthlyInterest());
		System.out.println(saver2.calculateMonthlyInterest() + "\n");

		System.out.println("New Balances");
		System.out.println(saver1.getSavingsBalance());
		System.out.println(saver2.getSavingsBalance());

	}

	SavingsAccount(double savingsBalance) {
		setSavingsBalance(savingsBalance);
	}

	public double calculateMonthlyInterest() {
		double monthlyInterest = savingsBalance * annualInterestRate / 12;
		setSavingsBalance(savingsBalance + monthlyInterest);
		return monthlyInterest;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static void modifyInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
}
