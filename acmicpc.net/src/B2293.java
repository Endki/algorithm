import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2293 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().split(" ");
		
		int N=Integer.parseInt(input[0]);
		int K=Integer.parseInt(input[1]);
		
		int[] arr=new int[N+1];
		int[] dp=new int[K+1];
		
		
		dp[0]=1;
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			for(int j=arr[i];j<=K;j++) {
				dp[j]+=dp[j-arr[i]];
			}
			
		}
		System.out.println(dp[K]);
	}

}
