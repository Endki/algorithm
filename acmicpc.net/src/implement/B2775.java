package implement;
import java.util.Arrays;
import java.util.Scanner;

public class B2775 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		int sum = 0;
		for (int i = 0; i < t; i++) {
			sum = 0;
			int k = input.nextInt();
			int n = input.nextInt();
			int[][] arr = new int[k + 1][n];

			// 0Ãþ ÀÔ·Â
			for (int j = 0; j < n; j++) {
				arr[0][j] = j + 1;
			}
			
			// À§Ãþ ÀÔ·Â
			for (int j = 1; j <= k; j++) {
				sum=0;
				for (int l = 0; l < n; l++) {
					sum += arr[j - 1][l];
					arr[j][l] += sum;
				}
			}

			System.out.println(arr[k][n - 1]);
		}

	}

}
