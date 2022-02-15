package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11055 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int[] arr=new int[N];
		int[] dp=new int[N];
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		
		dp[0]=arr[0];
		int max=dp[0];
		for(int i=1;i<N;i++) {
			dp[i]=arr[i];
			for(int j=0;j<i-1;j++) {
				if(arr[i]>arr[j]) {
					dp[i]=Math.max(dp[i], dp[j]+arr[i]);
				}
			}
			max=Math.max(max, dp[i]);
		}
		
		System.out.println(max);
		

	}

}
