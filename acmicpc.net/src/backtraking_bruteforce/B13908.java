package backtraking_bruteforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13908 {
	static int N,M,count;
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(stz.nextToken());
		M=Integer.parseInt(stz.nextToken());
		count=0;
		
		boolean[] visited=new boolean[10];
		
		if(M!=0) {
			stz=new StringTokenizer(br.readLine());
		}
		
		
		
		for(int i=0;i<M;i++) {
			int index=Integer.parseInt(stz.nextToken());
			visited[index]=true;
		}
		
		dfs(0,0,visited);
		System.out.println(count);

	}
	public static void dfs(int depth,int num,boolean[] visited) {
		if(depth==N) {
			if(num==M) {
				count++;
			}
			return;
		}
		
		
		for(int i=0;i<=9;i++) {
			if(visited[i]) {
				visited[i]=false;
				dfs(depth+1,num+1,visited);
				visited[i]=true;
			}else {
				dfs(depth+1,num,visited);
			}
			
			
		}
	}

}
