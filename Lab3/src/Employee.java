import java.util.Scanner;

public class Employee {

	private String lastName, firstName;
	private double salary;

	Employee(String lastName, String firstName, double salary) {
		this.setLastName(lastName);
		this.setFirstName(firstName);
		this.setSalary(salary);
	}

	public static void main(String[] args) {
		String lastName, firstName;
		double salary;
		Employee obj[] = new Employee[2];

		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {

			System.out.print("Enter last name: ");
			lastName = inp.nextLine();
			System.out.print("Enter first name: ");
			firstName = inp.nextLine();
			System.out.print("Enter salary: ");
			salary = Integer.parseInt(inp.nextLine()); //nextDouble() doesn't read the newline entered by user after entering input
			obj[i] = new Employee(firstName, lastName, salary);//So, the nextLine() in next iteration of loop reads the single \n in buffer
			//and hence you won't be able to enter lastName in any other iteration except the first one
		}

		System.out.println(obj[0].getSalary());
		System.out.println(obj[1].getSalary());

		obj[0].raise();
		obj[1].raise();

		System.out.println(obj[0].getSalary());
		System.out.println(obj[1].getSalary());
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void raise() {
		setSalary(getSalary() * 1.1);
	}

	public void setSalary(double salary) {

		this.salary = salary >= 0 ? salary : 0;
	}

}
