package q4;

public class SystemEngineer extends EMP {
	double TA;

	public SystemEngineer(int eID, String eName, String eDesig, double eBasicPay, double eTA) {
		super(eID, eName, eDesig, eBasicPay);
		TA = eTA;
	}

	public double ComputeSalary() {
		return basicPay + TA;
	}

}
