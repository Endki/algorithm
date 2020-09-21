import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SW2117_2 {
	static class Pair {
		int x;
		int y;
		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static int N,M,max;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int[][] city;
	static Queue<Pair> q = new LinkedList<Pair>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			city = new int[N][N];
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<N; j++) {
					city[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			max = 0;
            
            //모든칸 탐색
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					bfs(i,j);
				}
			}
			
			System.out.println("#"+tc+" "+max);
		}
	}
	
	static void bfs(int i, int j) {
		
		boolean check[][] = new boolean[N][N];
		q.add(new Pair(i,j));
		check[i][j] = true;
		int homecnt = 0;
		int k = 1;
		int size = q.size(); //처음 큐 사이즈 저장( 1값을 저장)
		while(!q.isEmpty()) {
			
			//K 값이 증가할 때마다 서비스를 받는 집의 수를 계산하고 최댓값을 저장한다.
			homecnt = calc(k++, check);
			if(max < homecnt) {
				max = homecnt;
			}
			
			size = q.size(); //단계별로 진행하기 위해서 매번 들어가있는 큐사이즈를 구해준다
			while(size-- > 0) { //size 만큼 탐색 진행
				Pair p = q.remove();
				int x = p.x;
				int y = p.y;

				
				for(int l=0; l<4; l++) {
					int nx = x+dx[l];
					int ny = y+dy[l];
					if(nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
					if(check[nx][ny]) continue;
					q.add(new Pair(nx,ny));
					check[nx][ny] = true;
					
				}
			}
			
			
		}
	}
	
	static int calc(int k, boolean[][] check) {
		int homecnt = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(check[i][j] && city[i][j] == 1) {
					homecnt += 1; //방문 한 곳(서비스 영역)중에 집이 있으면 집의 수를 count
				}
			}
		}
		
		int cost = (k*k)+((k-1)*(k-1));
		int profit = homecnt*M - cost;
		if(profit >= 0) //마이너스 값이 아닌 이상 손해가 아니다
			return homecnt;
		else
			return 0;
	}
}
