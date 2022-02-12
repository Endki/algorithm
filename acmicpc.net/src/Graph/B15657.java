package Graph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B15657 {
	static int N,M;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(stz.nextToken());
		M=Integer.parseInt(stz.nextToken());
		
		int[] arr=new int[N];
		int[] output=new int[M];
		stz=new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		Arrays.sort(arr);
		dfs(0, arr, output);
	}
	
	public static void dfs(int depth,int[] arr,int[] output) {
		if(depth==M) {
			for(int i=0;i<M;i++) {
				System.out.print(output[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(depth>0 && output[depth-1]>arr[i]) {
				continue;
			}
			
			output[depth]=arr[i];
			
			dfs(depth+1, arr, output);
		}
	}
}
