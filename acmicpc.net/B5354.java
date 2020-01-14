

import java.util.Scanner;

public class B5354 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int m = input.nextInt();

		for (int l = 0; l < m; l++) {
			int k = input.nextInt();

			for (int i = 0; i < k; i++) {
				for (int j = 0; j < k; j++) {
					if (i == 0 || i == k - 1 || j == 0 || j == k - 1) {
						System.out.print("#");
					}

					else {
						System.out.print("J");
					}
				}
				System.out.println("");
			}
			System.out.println();
		}
	}
}
