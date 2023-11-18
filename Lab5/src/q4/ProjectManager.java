package q4;

public class ProjectManager extends EMP {
	double AGP, DA, HRA;

	public ProjectManager(int eID, String eName, String eDesig, double eBasicPay, double eAGP, double eDA,
			double eHRA) {
		super(eID, eName, eDesig, eBasicPay);
		AGP = eAGP;
		DA = eDA;
		HRA = eHRA;
	}

	public double ComputeSalary() {
		return basicPay + AGP + DA + HRA;
	}
}
