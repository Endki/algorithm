import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class B16948 {
	static int[] dx= {-2,-2,0,0,2,2};
	static int[] dy= {-1,1,-2,2,-1,1};
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int[][] map=new int[N][N];
		boolean[][] visited=new boolean[N][N];
		
		int r1=Integer.parseInt(stz.nextToken());
		int c1=Integer.parseInt(stz.nextToken());
		int r2=Integer.parseInt(stz.nextToken());
		int c2=Integer.parseInt(stz.nextToken());
		
		Queue<int[]> qu=new ArrayDeque<int[]>();
		visited[r1][c1]=true;
		
		qu.add(new int[] {r1,c1});
		
		while(!qu.isEmpty()) {
			int[] index=qu.poll();
			int x=index[0];
			int y=index[1];
			
			if(x==r2 && y==c2) {
				break;
			}
			
			for(int i=0;i<6;i++) {
				int rdx=x+dx[i];
				int rdy=y+dy[i];
				
				if(rdx<0 || rdy<0 || rdx>=N || rdy>=N || visited[rdx][rdy]) {
					continue;
				}
				
				map[rdx][rdy]=map[x][y]+1;
				visited[rdx][rdy]=true;
				qu.add(new int[] {rdx,rdy});
				
			}
		}
		
		if(map[r2][c2]==0) {
			System.out.println(-1);
		}else {
			System.out.println(map[r2][c2]);
		}
	}

}
