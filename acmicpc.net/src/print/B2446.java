package print;

import java.util.Scanner;

public class B2446 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int k = n;
		String m = " ";
		int c=2;
		String m2 = " ";
		for (int i = 0; i < 2 * n - 1; i++) {

			if (k != 0) {
				for (int j = 0; j < i; j++) {
					System.out.print(m);
				}
				for (int j = 0; j < (2 * k - 1); j++) {
					System.out.print("*");
				}
				k--;

				System.out.println();

			} else {
				for (int j = c; j < n; j++) {
					System.out.print(m2);
				}
				for(int j=0;j<(2*c-1);j++) {
					System.out.print("*");
				}
				c++;
				System.out.println();
			}

		}
	}

}
