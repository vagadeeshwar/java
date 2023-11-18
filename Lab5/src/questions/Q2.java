package questions;

public class Q2 {
	public static void matTranspose(int[][] matrix) {
		int matrix1[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix1[i][j] = matrix[i][j];
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = matrix1[j][i];
			}
		}
	}
}
