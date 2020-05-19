package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B11651 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer stz;
		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			stz = new StringTokenizer(br.readLine());

			arr[i][0] = Integer.parseInt(stz.nextToken());
			arr[i][1] = Integer.parseInt(stz.nextToken());
		}
	
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] var1, int[] var2) {
				if (var1[1] == var2[1]) {
					return Integer.compare(var1[0], var2[0]);
				} else {
					return Integer.compare(var1[1], var2[1]);
				}
				
			}
		});
		for(int i=0;i<n;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}

}
