import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SW1868 {
	static int[][] map;
	static int N;
	static int[] dx= {-1,-1,-1,0,0,1,1,1};
	static int[] dy= {-1,0,1,-1,1,-1,0,1};
	static boolean[][] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		
		
		for(int TC=1;TC<=T;TC++) {
			N=Integer.parseInt(br.readLine());
			
			map=new int[N][N];
			visited=new boolean[N][N];
			
			for(int i=0;i<N;i++) {
				String input=br.readLine();
				for(int j=0;j<N;j++) {
					char m=input.charAt(j);
					
					if(m=='*') {
						visited[i][j]=true;
						map[i][j]=9;
						for(int z=0;z<8;z++) {
							int rdx=i+dx[z];
							int rdy=j+dy[z];
							
							if(rdx<0 || rdy<0 || rdx>=N || rdy>=N) {
								continue;
							}
							
							map[rdx][rdy]+=1;
						}
					}
				}
			}
			
			//표시 끝
			//이론상 0 인 친구부터 
			int count=0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(map[i][j]==0 && !visited[i][j]) {
						visited[i][j]=true;
						dfs(i,j);
						count++;
					}
				}
			}
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(!visited[i][j]) {
						count++;
					}
				}
			}
			System.out.println("#"+TC+" "+count);
		}

	}
	
	static public void dfs(int x,int y) {
		if(map[x][y]!=0) {
			return;
		}
		
		for(int i=0;i<8;i++) {
			int rdx=x+dx[i];
			int rdy=y+dy[i];
			
			if(rdx<0 || rdy<0 || rdx>=N || rdy>=N || visited[rdx][rdy] || map[rdx][rdy]>=9) {
				continue;
			}
			
			visited[rdx][rdy]=true;
			dfs(rdx,rdy);
			
		}
		
		
	}

}
