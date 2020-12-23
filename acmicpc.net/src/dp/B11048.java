package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11048 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		
		int n=Integer.parseInt(input[0]);
		int m=Integer.parseInt(input[1]);
		
		
		int[][] arr=new int[n+1][m+1];
		
		for(int i=1;i<n+1;i++) {
			input=br.readLine().split(" ");
			for(int j=1;j<m+1;j++) {
				arr[i][j]=Integer.parseInt(input[j-1]);
			}
		}
		
		
		for(int i=1;i<n+1;i++) {	
			for(int j=1;j<m+1;j++) {
				arr[i][j]+=Integer.max(arr[i][j-1], Integer.max(arr[i-1][j], arr[i-1][j-1]));
			}
		}
		System.out.println(arr[n][m]);
	}

}
