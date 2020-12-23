package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;

		int n = Integer.parseInt(br.readLine());
		int[] arrN = new int[n];

		stz = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arrN[i] = Integer.parseInt(stz.nextToken());
		}
		Arrays.parallelSort(arrN);

		int m = Integer.parseInt(br.readLine());
		int[] arrM = new int[m];
		stz = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			arrM[i] = Integer.parseInt(stz.nextToken());
		}

		for (int i = 0; i < m; i++) {
			if(Arrays.binarySearch(arrN, arrM[i])>=0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}

		}
		
	}


}
