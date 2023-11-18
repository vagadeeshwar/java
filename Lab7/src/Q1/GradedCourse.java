package Q1;

public class GradedCourse extends Diploma {
	private String grade;

	public GradedCourse(String courseName, String grade) {
		super(courseName);
		this.grade = grade;
	}

	public boolean coursePassed() {
		return grade == "E" ? false : true;
	}

}
