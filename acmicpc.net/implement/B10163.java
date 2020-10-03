package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10163 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[102][102];
		int[] output = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(stz.nextToken());
			int y1 = Integer.parseInt(stz.nextToken());
			int x2 = Integer.parseInt(stz.nextToken());
			int y2 = Integer.parseInt(stz.nextToken());

			for (int j = x1; j < x1+x2; j++) {
				for (int k = y1; k < y1+y2; k++) {
					arr[j][k] = i;
				}

			}

		}
		for (int z = 1; z <= N; z++) {
			for (int i = 0; i < 102; i++) {
				for (int j = 0; j < 102; j++) {
					if(arr[i][j]==z) {
						output[z]++;
					}
				}
			}
		}
		
		for(int i=1;i<=N;i++) {
			System.out.println(output[i]);
		}
	}

}
