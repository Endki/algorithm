package implement;
import java.util.Scanner;

public class B1780 {
	static int num0 = 0;
	static int num1 = 0;
	static int num2 = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = input.nextInt();
			}
		}

		solve(0, 0, n, arr);

		System.out.println(num2);
		System.out.println(num0);
		System.out.println(num1);
	}

	public static void solve(int a, int b, int size, int[][] arr) {
		boolean tag = true;

		for (int i = b; i < b + size; i++) {
			for (int j = a; j < a + size; j++) {

				if (arr[b][a] != arr[i][j]) {
					tag = false;
					break;
				}
			}
		}
		if (tag && arr[b][a] == -1) {
			num2++;
		} else if (tag && arr[b][a] == 0) {
			num0++;
		} else if (tag && arr[b][a] == 1) {
			num1++;
		} else {
			solve(a, b, size / 3, arr);
			solve(a, b + size / 3, size / 3, arr);
			solve(a, b + 2 * size / 3, size / 3, arr);
			solve(a + size / 3, b, size / 3, arr);
			solve(a + size / 3, b + size / 3, size / 3, arr);
			solve(a + size / 3, b + 2 * size / 3, size / 3, arr);
			solve(a + 2 * size / 3, b, size / 3, arr);
			solve(a + 2 * size / 3, b + size / 3, size / 3, arr);
			solve(a + 2 * size / 3, b + 2 * size / 3, size / 3, arr);
		}

	}

}
