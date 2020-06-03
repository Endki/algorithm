package print;

import java.util.Scanner;

public class B10996 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 0; i < 2 * n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					if (j%2 == 0) {
						System.out.print("*");
					} else {
						System.out.print(" ");

					}

				}
			} else {

				for (int j = 0; j < n; j++) {
					if (j%2 == 0) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}

}
