package Q1;

public abstract class Diploma {
	protected String courseName;

	public Diploma(String courseName) {
		this.courseName = courseName;
	}

	public abstract boolean coursePassed();

	public static boolean diplomaPassed(BooleanCourse course1, BooleanCourse course2, GradedCourse course3,
			GradedCourse course4) {
		boolean t1 = course1.coursePassed(), t2 = course2.coursePassed(), t3 = course3.coursePassed(),
				t4 = course4.coursePassed();

		return (t1 && t2 && (t3 || t4)) || (t3 && t4 && (t1 || t2));
	}
}
