package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14889 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;
		
		int n=Integer.parseInt(br.readLine());
		
		
		int[][] arr=new int[n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			stz=new StringTokenizer(br.readLine());
			for(int j=1;j<=n;j++) {
				arr[i][j]=Integer.parseInt(stz.nextToken());
			}
		}
		
		int length=n/2;
		
		int sumOne=0;
		int sumTwo=0;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				
				
				
				for(int k=1;k<=length;k++) {
					
					
					
					
					
				
				}
				
				
				
				
			}
		}
		
		
		
	}

}
