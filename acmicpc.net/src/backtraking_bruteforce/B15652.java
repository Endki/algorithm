package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15652 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stn = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(stn.nextToken());
		int m = Integer.parseInt(stn.nextToken());

		int[] arr = new int[n + 1];
		boolean[] visit = new boolean[n + 1];
		solve(0, m, n, arr, visit, 0);

	}

	public static void solve(int count, int M, int N, int[] arr, boolean[] visit, int num) {
		if (count == M) {
			for (int i = 0; i < M; i++) {

				System.out.print(arr[i] + " ");

			}
			System.out.println();
			return;
		}
		for (int i = 1; i <= N; i++) {
			if (count != 0 && arr[count - 1] > i) {
				continue;
			}

			arr[count] = i;
			solve(count + 1, M, N, arr, visit, i);

		}
	}
}
