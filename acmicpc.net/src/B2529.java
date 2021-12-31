import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2529 {
	static int N;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		
		char[] arr=new char[N];
		boolean[] visited=new boolean[N+1];
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			arr[i]=stz.nextToken().charAt(0);
		}
		
		dfs(0, arr, visited);
	}

	public static void dfs(int depth,char[] arr,boolean[] visited) {
		
	}
}
//https://programmers.co.kr/learn/courses/30/lessons/43162