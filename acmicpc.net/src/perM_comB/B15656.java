package perM_comB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B15656 {
	static int N,M;
	static ArrayList<String> solve;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(stz.nextToken());
		M=Integer.parseInt(stz.nextToken());
		
		
		int[] arr=new int[N];
		
		stz=new StringTokenizer(br.readLine());
		
		int[] output=new int[M];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		solve=new ArrayList<String>();
		Arrays.sort(arr);
		StringBuilder sb=new StringBuilder();
		dfs(0, arr, output,sb);
		
		
		System.out.println(sb.toString());
		
	}
	public static void dfs(int depth,int[] arr,int[] output,StringBuilder sb) {
		if(depth==M) {
			
			for(int i=0;i<M;i++) {
				sb.append(output[i]).append(" ");
			}
			sb.append("\n");
			
			return ;
		}
		
		for(int i=0;i<N;i++) {
				output[depth]=arr[i];
		
				dfs(depth+1, arr, output,sb);

		}
		
	}

}
