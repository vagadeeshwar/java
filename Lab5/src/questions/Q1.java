package questions;

public class Q1 {
	public static int numOfSentences(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '.') {
				count++;
			}
		}
		return count;
	}

	public static int startC(String text) {
		int count = 0;
		for (int i = 0; i < text.length() - 1; i++) {
			if (text.charAt(i) == ' ' && (text.charAt(i + 1) == 'c' || text.charAt(i + 1) == 'C')) {
				++count;
			}
		}
		return count;
	}
}
