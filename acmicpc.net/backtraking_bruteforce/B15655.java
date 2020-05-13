package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B15655 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");

		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);

		int[] arr = new int[a];
		boolean[] visit = new boolean[a];
		int[] mirror = new int[a];

		input = br.readLine().split(" ");

		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		Arrays.parallelSort(arr);

		backTraking(0, a, b, arr, mirror, visit, 0);

	}

	static void backTraking(int count, int a, int b, int[] arr, int[] mirror, boolean[] visit, int num) {
		if (count == b) {

			for (int i = 0; i < b; i++) {

				System.out.print(mirror[i] + " ");

			}
			System.out.println();

			return;
		}

		for (int i = num; i < a; i++) {
			if (!visit[i]) {
				visit[i] = true;
				mirror[count] = arr[i];
				backTraking(count + 1, a, b, arr, mirror, visit, i + 1);
				visit[i] = false;
			}

		}
	}
}
