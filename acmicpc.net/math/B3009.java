package math;

import java.util.Scanner;

public class B3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] arr = new int[3][3];

		for (int i = 0; i < 3; i++) {

			arr[i][0] = input.nextInt();
			arr[i][1] = input.nextInt();

		}

		int x = 0;
		int y = 0;

		if (arr[0][0] == arr[1][0]) {
			x = arr[2][0];
		} else if (arr[0][0] == arr[2][0]) {
			x = arr[1][0];
		} else {
			x = arr[0][0];
		}

		if (arr[0][1] == arr[1][1]) {
			y = arr[2][1];
		} else if (arr[0][1] == arr[2][1]) {
			y = arr[1][1];
		} else {
			y = arr[0][1];
		}

		System.out.println(x + " " + y);
	}

}
