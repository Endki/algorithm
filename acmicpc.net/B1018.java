import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(stz.nextToken());
		int m = Integer.parseInt(stz.nextToken());

		char[][] arr = new char[n][m];

		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine().toCharArray();
		}

		int min=9999;
		for(int a=0;a<n-7;a++) {
			for(int b=0;b<m-7;b++) {
				int count = 0;
				int count2 = 0;
				
				
				
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						
						if ((i+j) % 2 == 1) {
							if (arr[a+i][b+j] != 'B') {
								count++;
							}
						} else {
							if (arr[a+i][b+j] != 'W') {
								count++;
							}
						}
					}
				}

				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if ((i+j) % 2 == 1) {
							if (arr[a+i][b+j] != 'W') {
								count2++;
							}
						} else {
							if (arr[a+i][b+j] != 'B') {
								count2++;
							}
						}
					}

				}
				if(min>Math.min(count, count2)) {
					min=Math.min(count, count2);
				}	
			}
		}

		System.out.println(min);
	}
}
