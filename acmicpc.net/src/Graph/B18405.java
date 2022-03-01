package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class B18405 {
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static int[][] map;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stz = new StringTokenizer(br.readLine());

		N = Integer.parseInt(stz.nextToken());
		int K = Integer.parseInt(stz.nextToken());

		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			stz = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(stz.nextToken());

			}
		}

		stz = new StringTokenizer(br.readLine());

		int S = Integer.parseInt(stz.nextToken());
		int X = Integer.parseInt(stz.nextToken()) - 1;
		int Y = Integer.parseInt(stz.nextToken()) - 1;

		while (S-- > 0) {
			for (int i = 1; i <= K; i++) {
				bfs(i);
			}
			if (map[X][Y] != 0) {
				break;
			}

		}

		System.out.println(map[X][Y]);
	}

	public static void bfs(int cost) {
		Queue<int[]> qu = new ArrayDeque<int[]>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == cost) {
					qu.add(new int[] { i, j });
				}
			}
		}

		while (!qu.isEmpty()) {
			int[] node = qu.poll();
			int x = node[0];
			int y = node[1];

			for (int i = 0; i < 4; i++) {
				int rdx = x + dx[i];
				int rdy = y + dy[i];

				if (rdx < 0 || rdy < 0 || rdx >= N || rdy >= N || map[rdx][rdy] != 0) {
					continue;
				}

				map[rdx][rdy] = cost;

			}
		}
	}
}
