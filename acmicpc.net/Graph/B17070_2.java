package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B17070_2 {
	static int N;
	static int[][] map;
	// 대각선 체크 배열
	static int count;
	static int[] dx= {0,1,1};
	static int[] dy= {1,1,0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		map = new int[N][N];
		count = 0;


		for (int i = 0; i < N; i++) {
			StringTokenizer stz = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(stz.nextToken());
			}
		}
		
		dfs(0,1,0);
		
		System.out.println(count);
		
	}

	static void dfs(int x,int y,int direction) {
		//direction
		//0==가로 1==대각선 2==세로
		if(x==N-1 && y==N-1) {
			count++;
			return;
		}
		
		int[] direction_Arr=get_direction(direction);
		
		for(int i=0;i<direction_Arr.length;i++) {
			int rdx=x+dx[direction_Arr[i]];
			int rdy=y+dy[direction_Arr[i]];
			
			if(rdx<0 || rdy<0 ||rdx>=N||rdy>=N || map[rdx][rdy]!=0) {
				continue;
			}
			
			//대각
			if(direction_Arr[i]==1 && (map[x][y+1]!=0 || map[x+1][y]!=0)) {
				continue;
			}
			
			dfs(rdx,rdy,direction_Arr[i]);
			
			
		}
		
	}
	
	static int[] get_direction(int direction) {
		
		if(direction==0) {
			int[] Arr_direction= {0,1};
			return Arr_direction;
		}
		if(direction==1) {
			int[] Arr_direction= {0,1,2};
			return Arr_direction;
		}
		if(direction==2) {
			int[] Arr_direction= {1,2};
			return Arr_direction;
		}
		return null;
		
	}
}
