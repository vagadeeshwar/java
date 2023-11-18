package q4;

public class EMP {
	int id;
	String name, desig;
	double basicPay;

	public EMP(int eID, String eName, String eDesig, double eBasicPay) {
		id = eID;
		name = eName;
		desig = eDesig;
		basicPay = eBasicPay;
	}

	public double ComputeSalary() {
		return basicPay;
	}
}
