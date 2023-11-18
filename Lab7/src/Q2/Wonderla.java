package Q2;

import java.util.Arrays;
import java.util.Scanner;

public class Wonderla extends ThemePark {
	public int[] games;

	public Wonderla() {
		games = new int[40];
		Arrays.fill(games, 0);
	}

	public void playGame() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter gamecode 0 - 29: ");
		games[s.nextInt()]++;
	}

	public void playedCount() {
		int count1 = 0, count2 = 0;
		for (int x : games) {
			if (x >= 2) {
				count1++;
			} else if (x == 0) {
				count2++;
			}
		}
		System.out.println("Number of games not played even once: " + count2);
		System.out.println("Number of games played more than once: " + count1);
	}

}
