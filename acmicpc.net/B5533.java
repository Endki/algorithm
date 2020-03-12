import java.util.Arrays;
import java.util.Scanner;

public class B5533 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[][] point = new int[3][n];
		int[] sum = new int[n];
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				point[j][i] = input.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				int sw = 0;
				for (int k = 0; k < n; k++) {
					if (i != k && point[j][i] == point[j][k]) {
						point[j][k] = 0;
						sw = 1;

					}
				}

				if (sw == 1) {
					point[j][i]=0;
				}
			}
			System.out.println(point[0][i]+point[1][i]+point[2][i]);
			
		}

	}
}
