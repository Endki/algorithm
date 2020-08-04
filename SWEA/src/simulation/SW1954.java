package simulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW1954 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][n];

			int count = 1;// 넣을숫자
			int index = 0;

			while (count <= n * n) {

				// 위
				for (int i = index; i < n - index; i++) {
					arr[index][i] = count++;
				}

				
				//오
				int start=index+1;
				for(int i=start;i<n-index;i++) {
					arr[i][n-index-1]=count++;
				}
				
				//아
				start=n-index-2;
				for(int i=start;i>=index;i--) {
					arr[n-index-1][i]=count++;
				}
				
				
				//왼
				
	            start = n-index-2;
	            for(int i=start; i>index; i--){
	                arr[i][index] = count++;
	            }

	            index+=1;
				
				
			}

			System.out.println("#"+tc);
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

}
