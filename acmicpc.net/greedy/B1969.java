package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1969 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(stz.nextToken());
		int m = Integer.parseInt(stz.nextToken());

//		char[][] arrM=new char[n][m];
		String[] arrM = new String[n];

		for (int i = 0; i < n; i++) {
			arrM[i] = br.readLine();
		}

		char[] arr = { 'A', 'C', 'G', 'T' };
		int[] arrC = new int[4];
		int count = 0;
		int max = 0;
		for (int i = 0; i < m; i++) {
			max=0;
			Arrays.fill(arrC, 0);
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 4; k++) {
					if (arr[k] == arrM[j].charAt(i)) {
						arrC[k]++;
					}
				}
			}
			for (int j = 0; j < 4; j++) {
				if (max < arrC[j]) {
					max = arrC[j];
				}
			}

			for (int j = 0; j < 4; j++) {
				if (max == arrC[j]) {
					bw.append(arr[j]);
					break;
				}
			}
			count += n - max;
		}

		bw.newLine();
		bw.flush();

		System.out.println(count);
	}

}
