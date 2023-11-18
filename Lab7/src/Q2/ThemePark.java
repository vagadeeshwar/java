package Q2;

public abstract class ThemePark {
	protected static double adultFee = 500, childFee = 300;

	public static double totalCost(int numOfAdult, int numOfChild) {
		return numOfAdult * adultFee + numOfChild * childFee;
	}

	public abstract void playGame();

}
