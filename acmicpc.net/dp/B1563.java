package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1563 {
	public static int mod = 1000000;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[][][][][] D = new int[1001][3][3][3][2];

		for (int now = 0; now < 3; now++) {
			for (int prev = 0; prev < 3; prev++) {
				for (int prev2 = 0; prev2 < 3; prev2++) {

					// 결석 연속3번은 안
					if (now == 1 && prev == 1 && prev2 == 1) {
						continue;
					}

					// 지각 2번은 안됨
					if ((now == 2 && prev == 2) || (now == 2 && prev2 == 2) || (prev == 2 && prev2 == 2)) {
						continue;
					}

					if (now == 2 || prev == 2 || prev2 == 2) {
						D[3][now][prev][prev2][1] = 1;
					} else {

						D[3][now][prev][prev2][0] = 1;

					}

				}
			}
		}

		for (int i = 4; i <= n; i++) {
			for (int prev = 0; prev < 3; prev++) {
				for (int prev2 = 0; prev2 < 3; prev2++) {
					for (int prev3 = 0; prev3 < 3; prev3++) {

						// 출석했을
						D[i][0][prev][prev2][0] += D[i - 1][prev][prev2][prev3][0];
						D[i][0][prev][prev2][0] %= mod;
						D[i][0][prev][prev2][1] += D[i - 1][prev][prev2][prev3][1];
						D[i][0][prev][prev2][1] %= mod;

						// 결석

						if (prev == 1 && prev2 == 1) {

						} else {

							D[i][1][prev][prev2][0] += D[i - 1][prev][prev2][prev3][0];
							D[i][1][prev][prev2][0] %= mod;
							D[i][1][prev][prev2][1] += D[i - 1][prev][prev2][prev3][1];
							D[i][1][prev][prev2][1] %= mod;

						}

						D[i][2][prev][prev2][1] += D[i - 1][prev][prev2][prev3][0];
						D[i][2][prev][prev2][1] %= mod;

					}
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 2; l++) {
						ans += D[n][i][j][k][l];
						ans %= mod;
					}
				}
			}
		}

		System.out.println(ans);

	}
}
