package Y2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2583 {
	static int[] dx=new int[] {0,0,1,-1};
	static int[] dy=new int[] {1,-1,0,0};
	
	public static class node{
		int x;
		int y;
		
		public node(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		//init
		int M=Integer.parseInt(stz.nextToken());
		int N=Integer.parseInt(stz.nextToken());
		int K=Integer.parseInt(stz.nextToken());
		
		
		int[][] map=new int[M][N];
		
		for(int i=0;i<K;i++) {
			stz=new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(stz.nextToken());
			int y1=Integer.parseInt(stz.nextToken());
			int x2=Integer.parseInt(stz.nextToken());
			int y2=Integer.parseInt(stz.nextToken());
			
			
			//draw color
			for(int j=x1;j<x2;j++) {
				for(int k=y1;k<y2;k++) {
					map[k][j]=-1;
				}
			}
		}
				
		
//		printMap(map);
		ArrayList<Integer> list=new ArrayList<Integer>();
		//logic
		//check count
		Queue<node> qu=new LinkedList<node>();
		int count=0;
//		printMap(map);
//		System.out.println("=-------------------=");
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j]==0) {
					
					qu.add(new node(i,j));
					map[i][j]=++count;
					//bfs
					
					while(!qu.isEmpty()) {
						node n=qu.poll();
						
						int x=n.x;
						int y=n.y;
						
						
						for(int a=0;a<4;a++) {
							int rdx=x+dx[a];
							int rdy=y+dy[a];
							
							if(rdx>=M || rdy>=N || rdx<0 || rdy<0 || map[rdx][rdy]!=0) {
								continue;
							}
							map[rdx][rdy]=count;
							qu.add(new node(rdx,rdy));
						}
					}
					
					
				}
			}
		}
		
//		printMap(map);
		
		int[] arr=new int[count+1];
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j]>0) {
					arr[map[i][j]]++;
				}
			}
		}
		
		Arrays.sort(arr);
		
		//output
		System.out.println(count);
		for(int i=1;i<=count;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
	public static void printMap(int[][] map) {
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[0].length;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}
