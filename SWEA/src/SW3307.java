import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW3307 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		for(int TC=1;TC<=T;TC++) {
			int N=Integer.parseInt(br.readLine());
			
			int[] arr=new int[N];
			int[] dp=new int[N];
			
			StringTokenizer stz=new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				arr[i]=Integer.parseInt(stz.nextToken());
			}
			
			
			int max=0;
			dp[0]=1;
			
			for(int i=1;i<N;i++) {
				dp[i]=1;
				for(int j=0;j<N;j++) {
					if(arr[j]<arr[i] && dp[j]+1>dp[i]) {
						dp[i]=dp[j]+1;
					}
				}
				max=Math.max(dp[i], max);
			}
			
			
			System.out.println("#"+TC+" "+max);
		}

	}

}
