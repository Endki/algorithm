package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11052 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int[] arr=new int[N+1];
		int[] solve=new int[N+1];
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				solve[i]=Math.max(solve[i], solve[i-j]+arr[j]);
			}
			
		}
		
		
		System.out.println(solve[N]);

	}
	//1개를 사는 최대값은 1개를 사는 비용임
	//2개는 2개살돈 vs 1개를 2개 사는 돈임
	//3개는 3개살돈 vs 2개의 max값+1개살돈임
	//4개는 4개살돈 vs 3개의 max값+1개살돈임
}
