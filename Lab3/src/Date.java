import java.util.Scanner;

public class Date {
	private int month;
	private int day;
	private int year;

	public static void main(String[] args) {
		int month, day, year;
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter day: ");
		day = inp.nextInt();
		System.out.print("Enter month: ");
		month = inp.nextInt();
		System.out.print("Enter year: ");
		year = inp.nextInt();
		Date obj = new Date(month, day, year);
		System.out.println(obj.getYear());

		obj.displayDate();
	}

	Date(int month, int day, int year) {
		setMonth(month);
		setDay(day);
		setYear(year);
	}

	public int getMonth() {
		return month;
	}

	public void displayDate() {
		System.out.println(day + "/" + month + "/" + year);
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
