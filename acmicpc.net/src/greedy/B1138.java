package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1138 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer stz = new StringTokenizer(br.readLine());

		int[] arr = new int[n ];
		int[] solve = new int[n ];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(stz.nextToken());
		}

		for (int i = 0; i < n ; i++) {
			
			int count = -1;
			
			for(int j=0;j<n;j++) {
				
				if(solve[j]==0) {
					count++;
				}else {
					continue;
				}
				
				
				if(count==arr[i]) {
					solve[j]=i+1;
					break;
				}
				
				
			}

		}
		for (int i = 0; i < n; i++) {
			System.out.print(solve[i]+" ");
		}

	}

}
