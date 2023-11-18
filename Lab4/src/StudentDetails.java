public class StudentDetails {

	String name, department, dob, emailId;
	int regNum, mobNum;
	static int count = 0;

	StudentDetails(String name, String department, String dob, String emailId, int mobNum) {
		this.name = name;
		this.department = department;
		this.dob = dob;
		this.emailId = emailId;
		this.mobNum = mobNum;
		regNum = 202201 + count++;
	}

	void display() {
		System.out.println(name);
		System.out.println(department);
		System.out.println(dob);
		System.out.println(emailId);
		System.out.println(regNum);
		System.out.println(mobNum);
	}

	public static void main(String[] args) {
		StudentDetails[] obj = new StudentDetails[5];
		obj[0] = new StudentDetails("a", "A", "1/1/1", "a@a.com", 1);
		obj[1] = new StudentDetails("b", "B", "2/2/2", "b@b.com", 2);
		obj[2] = new StudentDetails("c", "C", "3/3/3", "c@c.com", 3);
		obj[3] = new StudentDetails("d", "D", "4/4/4", "d@d.com", 4);
		obj[4] = new StudentDetails("e", "E", "5/5/5", "e@e.com", 5);

		for (StudentDetails studentDetails : obj) {
			studentDetails.display();
		}
	}

}
