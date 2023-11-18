package Q2;

import java.util.Arrays;
import java.util.Scanner;

public class Queensland extends ThemePark {

	public boolean[] games;

	public Queensland() {
		games = new boolean[30];
		Arrays.fill(games, false);
	}

	public void playGame() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter gamecode 0 - 29: ");
		int i = s.nextInt();
		if (games[i])
			System.out.println("Game already played");
		else
			games[i] = true;
	}

}
