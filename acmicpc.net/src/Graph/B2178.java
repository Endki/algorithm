package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2178 {

	static int[] dx= {0,0,1,-1};
	static int[] dy= {1,-1,0,0};
	static int[][] arr;
	static boolean[][] visited;
	static int N,M;
	static int count;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		N=Integer.parseInt(stz.nextToken());
		M=Integer.parseInt(stz.nextToken());
		
		arr=new int[N][M];
		
		for(int i=0;i<N;i++) {
			char[] input=br.readLine().toCharArray();
			for(int j=0;j<M;j++) {
				arr[i][j]=input[j]-'0';
			}
		}
		
		Queue<Node> qu=new LinkedList<Node>();
		visited=new boolean[N][M];
		
		qu.add(new Node(0,0));
		visited[0][0]=true;
		int min=Integer.MAX_VALUE;
		while(!qu.isEmpty()) {
			Node node=qu.poll();
			int x=node.x;
			int y=node.y;
			
			
			for(int i=0;i<4;i++) {
				int rdx=x+dx[i];
				int rdy=y+dy[i];
				
				
				
				
				if(rdx<0||rdy<0||rdx>=N|| rdy>=M || arr[rdx][rdy]==0||visited[rdx][rdy]) {
					continue;
				}
				
				visited[rdx][rdy]=true;
				arr[rdx][rdy]+=arr[x][y];	
				qu.add(new Node(rdx,rdy));
			}
		}
		System.out.println(arr[N-1][M-1]);
		
		

	}
	
	static class Node{
		int x;
		int y;
		public Node(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
		
	}

}
