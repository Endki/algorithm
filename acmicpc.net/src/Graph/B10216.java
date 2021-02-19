package Graph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B10216 {

	static int[][] map;
	static boolean[][] visited;

	static class Node{
		int x;
		int y;
		int r;
		
		public Node(int x, int y, int r) {
			this.x = x;
			this.y = y;
			this.r = r;
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int TC=Integer.parseInt(br.readLine());
		
		while(TC-->0) {
			int K=Integer.parseInt(br.readLine());
			ArrayList<Node> list = new ArrayList<>();
			
			for(int i=0;i<K;i++) {
				StringTokenizer stz=new StringTokenizer(br.readLine());
				int x=Integer.parseInt(stz.nextToken());
				int y=Integer.parseInt(stz.nextToken());
				int r=Integer.parseInt(stz.nextToken());
				
				list.add(new Node(x,y,r));
			}
			boolean[] visited=new boolean[K];
			int count=0;
			
			for(int i=0;i<K;i++) {
				if(!visited[i]) {
					visited[i]=true;
					Queue<Node> qu=new LinkedList<Node>();
					qu.add(list.get(i));
					
					while(!qu.isEmpty()) {
						Node node=qu.poll();
						
						
						
						for(int j=0;j<K;j++) {
							boolean flag=Math.sqrt(Math.pow(node.x - list.get(j).x,2)+ Math.pow(node.y-list.get(j).y,2))<=node.r+list.get(j).r;
							if(!visited[j] && flag) {
								visited[j]=true;
								qu.add(list.get(i));
							}
						}
					}
					count++;
				}
				
			}
			System.out.println(count);
		}
		
		
	}

}
