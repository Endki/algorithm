package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1051 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		char[][] arr = new char[n][m];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine().toCharArray();
		}

		int col = Math.min(n, m);
		int max = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < col; k++) {
					
					//예외 처리
					if(i+k>=n || j+k>=m) {
						continue;
					}
					
					//가로 세로 대각선 정사각형 넓이로 해줌
					if (arr[i][j] == arr[i][j + k] && arr[i][j] == arr[i + k][j]
							&& arr[i][j] == arr[i + k][j + k]) {
						sum = (k+1) * (k+1);
						if (sum > max) {
							max = sum;
						}
					}
				}

			}
		}

		System.out.println(max);

	}

}
