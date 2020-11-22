import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class SW1249_dikstra {
	static int[][] map;
	static int N, cost;
	static int INF = Integer.MAX_VALUE;

	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int TC = 1; TC <= T; TC++) {
			N = Integer.parseInt(br.readLine());

			// 계산해야하기 때문에 무조건 int배열로 해야함 char해면 머리 과부화걸림
			map = new int[N][N];

			for (int i = 0; i < N; i++) {
				String k = br.readLine();
				for (int j = 0; j < N; j++) {
					map[i][j] = k.charAt(j) - '0';
				}
			}

			System.out.println("#" + TC + " " + dijkstra(0, 0, N - 1, N - 1));

		}

	}

	private static int dijkstra(int startX, int startY, int endX, int endY) {
		boolean[][] visited = new boolean[N][N];
		int[][] dist = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				dist[i][j] = INF;
			}
		}

		dist[startX][startY] = 0;
		int r = 0, c = 0, cost = 0, nr = 0, nc = 0;
		while (true) {
			// 1. 미방분 정점 중에 최소 비용 정점 찾기
			cost = INF;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j] && cost > dist[i][j]) {
						cost = dist[i][j];
						r = i;
						c = j;
					}
				}
			}
			visited[r][c] = true;
			if (r == endX && c == endY) {

				return cost;
			}
			
			for(int d=0;d<4;d++) {
				nr=r+dx[d];
				nc=c+dy[d];
				if(nr>=0 && nr<N && nc>=0 && nc<N && !visited[nr][nc] && dist[nr][nc]>cost+map[nr][nc]) {
					dist[nr][nc]=cost+map[nr][nc];
				}
			}
			

		}

	}

}
