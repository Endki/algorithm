package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2156 {
	static int[] dp;
	static int[] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		arr=new int[N+1];
		dp=new int[N+1];
		for(int i=0;i<N+1;i++) {
			dp[i]=-1;
		}
		for(int i=1;i<N+1;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		dp[0]=0;
		dp[1]=arr[1];
		
		if(N>1) {
			dp[2]=arr[1]+arr[2];
		}
		
		System.out.println(recursive(N));
	}
	
	public static int recursive(int N) {
		if(dp[N]==-1) {
			dp[N]=Math.max(Math.max(recursive(N-2),recursive(N-3)+arr[N-1])+arr[N], recursive(N-1));
		}
		return dp[N];
	}
}
