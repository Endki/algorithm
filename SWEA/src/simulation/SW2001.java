package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW2001 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;
		int tc=Integer.parseInt(br.readLine());
		for(int t=1;t<=tc;t++) {
			//입력
			stz=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(stz.nextToken());
			int m=Integer.parseInt(stz.nextToken());
			
			int[][] arr=new int[n][n];
			for(int i=0;i<n;i++) {
				stz=new StringTokenizer(br.readLine());	
				for(int j=0;j<n;j++) {
					arr[i][j]=Integer.parseInt(stz.nextToken());
				}
			}
			int max=Integer.MIN_VALUE;
			int sum=0;
			//solve
			for(int i=0;i<=n-m;i++) {
				
				for(int j=0;j<=n-m;j++) {
					
					sum=0;
					//시작점
					
					for(int a=0;a<m;a++) {
						for(int b=0;b<m;b++) {
							sum+=arr[i+a][j+b];
						}
					}
					if(max<sum) {
						max=sum;
					}
				}
				
			}
			
			
			
			
			
			
			//출력
			
			System.out.println("#"+t+" "+max);
			
			
		}
		
		
		
	}

}
