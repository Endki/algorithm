import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B13549 {

	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().split(" ");
		
		int N=Integer.parseInt(input[0]);
		int K=Integer.parseInt(input[1]);
			
		boolean[] visited=new boolean[100001];
		Queue<int[]> qu=new LinkedList<int[]>();
		
		qu.add(new int[] {N,0});
		int min=Integer.MAX_VALUE;
		while(!qu.isEmpty()) {
			int[] node=qu.poll();
			visited[node[0]]=true;
			if(node[0]==K) {
				min=Math.min(min, node[1]);
			}
			
			if(node[0]*2 <=100000 && !visited[node[0]*2] ) {
				qu.add(new int[] {node[0]*2,node[1]});
			}
			
			if(node[0]+1 <=100000 && !visited[node[0]+1] ) {
				qu.add(new int[] {node[0]+1,node[1]+1});
			}
			
			if(node[0]-1 >=0 && !visited[node[0]-1] ) {
				qu.add(new int[] {node[0]-1,node[1]+1});
			}
		}
		System.out.println(min);
	}

}
