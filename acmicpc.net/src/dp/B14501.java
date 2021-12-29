package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B14501 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		
		int[][] arr=new int[N][2];
		
		for(int i=0;i<N;i++) {
			String[] input=br.readLine().split(" ");
			arr[i][0]=Integer.parseInt(input[0]);
			arr[i][1]=Integer.parseInt(input[1]);
		}
		int[] dp=new int[N+1];
		
		for(int i=0;i<N;i++) {
			if(i+arr[i][0]<=N) {
				dp[i+arr[i][0]]=Math.max(dp[i+arr[i][0]], dp[i]+arr[i][1]);
			}
			
			dp[i+1]=Math.max(dp[i+1], dp[i]);
		}
		
		System.out.println(dp[N]);

	}

}
