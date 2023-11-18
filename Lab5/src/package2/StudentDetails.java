package package2;

import package1.HostelDetails;
import package1.School;

public class StudentDetails extends HostelDetails implements School {

	public String stuName, subject;
	public int regNum;
	public double marks;

	public StudentDetails(String name, int blockNum, int numRooms, String name2, String subject, int regNum,
			double marks) {
		super(name, blockNum, numRooms);
		stuName = name2;
		this.subject = subject;
		this.regNum = regNum;
		this.marks = marks;
	}

	public void display() {
		super.display();
		System.out.println(stuName + " " + regNum + subject + " " + marks);

	}

}
