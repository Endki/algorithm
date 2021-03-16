package perM_comB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B13023 {
	
	static ArrayList<Integer>[] map;
	static boolean[] visited;
	static int count;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(stz.nextToken());
		int M=Integer.parseInt(stz.nextToken());
		
		map=new ArrayList[N];
		
		for(int i=0;i<N;i++) {
			map[i]=new ArrayList<Integer>();
		}
		
	
		
		for(int i=0;i<M;i++) {
			stz=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(stz.nextToken());
			int b=Integer.parseInt(stz.nextToken());
			
			map[a].add(b);
			map[b].add(a);
		}
		
		count=0;
		
		for(int i=0;i<N;i++) {
			if(count==1) {
				break;
			}
			visited=new boolean[N];
			dfs(i,0);
		}
		
		
		System.out.println(count);

	}
	
	public static void dfs(int num,int depth) {
		if(count==1) {
			return;
		}
		
		if(depth>=5) {
			count=1;
			return;
		}
		
		for(int i=0;i<map[num].size();i++) {
			int x=map[num].get(i);
			
			if(!visited[x]) {
				visited[x]=true;
				dfs(x,depth+1);
				visited[x]=false;
			}
		}
		
		
		
	}

}
