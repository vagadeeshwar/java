public class JavaQuiz {

	String name, emailId;
	int regNum, mobNum;
	static int studentCount = 0;

	JavaQuiz(String name, String emailId, int mobNum, int regNum) {
		this.name = name;
		this.emailId = emailId;
		this.mobNum = mobNum;
		this.regNum = regNum;
		++studentCount;
	}

	void display() {
		System.out.println(studentCount);
		System.out.println(name);
		System.out.println(emailId);
		System.out.println(regNum);
		System.out.println(mobNum);
	}

	public static void main(String[] args) {
		JavaQuiz[] obj = new JavaQuiz[2];
		obj[0] = new JavaQuiz("Ramesh", "ramesh@gmail.com", 999999999, 1);
		obj[1] = new JavaQuiz("Priya", "priya@hotmail.com", 222222222, 2);

		obj[0].display();

	}

}
