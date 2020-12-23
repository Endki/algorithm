package print;

import java.util.Scanner;

public class B2523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int j=-1;
		for (int i = 0; i < 2 * n - 1; i++) {

			if (j != n-1) {
				for (j = -1; j < i; j++) {
					System.out.print("*");
				}
			}else {
				for(int k=(i-n)+1;k<n;k++) {
					System.out.print("*");
				}
			}
			System.out.println();

		}
	}

}
