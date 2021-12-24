import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11053 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int[] arr=new int[N];
		int[] dp=new int[N];
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		

		for(int i=0;i<N;i++) {
			dp[i]=1;
			
			
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i] && dp[i]<dp[j]+1) {
					dp[i]=dp[j]+1;
				}
			}
		}
		
		int max=-1;
		
		for(int i=0;i<N;i++) {
			max=dp[i]>max?dp[i]:max;
		}
		
		System.out.println(max);
		

	}

}
