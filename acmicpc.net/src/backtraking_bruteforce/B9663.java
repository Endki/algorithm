package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9663 {
	static int k;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		k = 0;
		int[] arr = new int[n+1];
		for (int i = 0; i < n; i++) {
			arr[0] = i;
			backTraking(i, 0, n, arr);
		}
		System.out.println(k);

	}

	static void backTraking(int count, int m, int n, int[] arr) {
		for (int i = 0; i < m; i++) {
			if (arr[i] == count || Math.abs(count - arr[i]) == m - i) {
				return;
			}
		}

		if (m == n - 1) {
			k++;
			return;
		}

		for (int i = 0; i < n; i++) {

			arr[m + 1] = i;
			backTraking(i, m+1, n, arr);

		}
	}
}
