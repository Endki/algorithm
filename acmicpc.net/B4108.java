import java.util.Scanner;

public class B4108 {

	static int[] x = { 0, 1, 0, -1, 1, -1, 1, -1 };
	static int[] y = { 1, 0, -1, 0, 1, -1, -1, 1 };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		while (true) {


			int r = input.nextInt();
			int c = input.nextInt();
			
			input.nextLine();
			
			if (r == 0 && c == 0) {
				break;
			}
			
			char[][] arr = new char[r][c];
			
			for (int i = 0; i < r; i++) {
				String k = input.next();

				for (int j = 0; j < c; j++) {
					arr[i][j] = k.charAt(j);
				}
			}

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (arr[i][j] == '*') {
						System.out.print(arr[i][j]);
					} else {
						System.out.print(solve(arr, i, j));
					}
				}
				System.out.println();
			}
		}
	}

	public static int solve(char[][] arr, int a, int b) {
		int count = 0;

		for (int i = 0; i < x.length; i++) {
			int ax = a + x[i];
			int by = b + y[i];

			if (ax < 0 || ax >= arr.length || by < 0 || by >= arr[0].length) {
				continue;
			}
			if (arr[ax][by] == '*') {
				count++;
			}

		}
		return count;
	}

}
