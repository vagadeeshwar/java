package Q1;

public class BooleanCourse extends Diploma {
	private boolean passed;

	public BooleanCourse(String courseName, boolean passed) {
		super(courseName);
		this.passed = passed;
	}

	public boolean coursePassed() {
		return passed;
	}

}
