package backtraking_bruteforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B2529 {
	static int N;
	static ArrayList<String> result=new ArrayList<String>();
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		
		char[] arr=new char[N];
		boolean[] visited=new boolean[10];
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			arr[i]=stz.nextToken().charAt(0);
		}
		
		dfs(0, arr, visited,"");
		
		System.out.println(result.get(result.size()-1));
		System.out.println(result.get(0));
	}

	public static void dfs(int depth,char[] arr,boolean[] visited,String check) {
		if(depth==N+1) {
			result.add(check);
			return;
		}
		
		for(int i=0;i<=9;i++) {
			
			
			if(depth==0 || !visited[i] && compare(check.charAt(check.length()-1)-'0', i, arr[depth-1])) {
				visited[i]=true;
				dfs(depth+1, arr, visited, check+i);
				visited[i]=false;
			}
		}
	}
    public static boolean compare(int a, int b, char c) {
        if (c == '<') return a < b;
        else return a > b;
    }
}
