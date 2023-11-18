
public class MyCart {

	static public class Salary {
		static int basicPay, AGP, DA, TA, HRA;
		public int salary;

		Salary() {
			salary = 0;

		}

		void computeSalary() {
			salary = basicPay + AGP + DA + TA + HRA;
		}

		public static void setBasicPay(int basicPay) {
			Salary.basicPay = basicPay;
		}

		public static void setAGP(int aGP) {
			AGP = aGP;
		}

		public static void setDA(int dA) {
			DA = dA;
		}

		public static void setTA(int tA) {
			TA = tA;
		}

		public static void setHRA(int hRA) {
			HRA = hRA;
		}

	}

	static public class ProjectManager extends Salary {
		public ProjectManager() {
			super();
		}

		void computeSalary() {
			salary = basicPay + AGP + DA + HRA;
		}

	}

	static public class SystemEngineer extends Salary {

		SystemEngineer() {
			super();

		}

		void computeSalary() {
			salary = basicPay + TA;
		}

	}

	static public class TechnicalAsst extends Salary {

		TechnicalAsst() {
			super();
		}

		void computeSalary() {
			salary = basicPay;
		}
	}

	public static void main(String[] args) {
		Salary.setBasicPay(1000);
		Salary.setAGP(500);
		Salary.setDA(400);
		Salary.setHRA(100);
		Salary.setTA(700);
		ProjectManager manager = new ProjectManager();
		SystemEngineer engineer = new SystemEngineer();
		TechnicalAsst assistant = new TechnicalAsst();
		manager.computeSalary();
		engineer.computeSalary();
		assistant.computeSalary();

		System.out.println(manager.salary);
		System.out.println(engineer.salary);
		System.out.println(assistant.salary);
	}

}
