import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SW1953 {
	static int N, M, R, C, L, count;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static Queue<guilty> qu;

	static class guilty {
		int x;
		int y;

		public guilty(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 시간 경과후 '갈 수 있는 곳 없는 곳 판단' 하여 갈수있는 곳으로 이동 후 visit 찍어주면 되는 문제
		int TC = Integer.parseInt(br.readLine());
		for (int T = 1; T <= TC; T++) {

			StringTokenizer stz = new StringTokenizer(br.readLine());
			N = Integer.parseInt(stz.nextToken());
			M = Integer.parseInt(stz.nextToken());
			R = Integer.parseInt(stz.nextToken());
			C = Integer.parseInt(stz.nextToken());
			L = Integer.parseInt(stz.nextToken());

			map = new int[N][M];
			visited = new boolean[N][M];

			for (int i = 0; i < N; i++) {
				stz = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					map[i][j] = Integer.parseInt(stz.nextToken());
				}
			}

			// 시작시 1초 후 맨홀 위치 진입
			int Time = 1;

			count = 1;
			visited[R][C] = true;
			qu = new LinkedList<guilty>();
			qu.add(new guilty(R, C));

			
			for (int nb = 0; nb < L; nb++) {
				int size = qu.size();
				for (int z = 0; z < size; z++) {

					guilty gu = qu.poll();

					int x = gu.x;
					int y = gu.y;

					// 구분 조건 식 넣을 자리

					switch (map[x][y]) {
					// 상하좌우
					case 1:
						for (int i = 0; i < 4; i++) {
							int rdx = x + dx[i];
							int rdy = y + dy[i];

							if (isCheck(rdx, rdy)) {
								continue;
							}
							if (isPCheck(i, rdx, rdy)) {
								continue;
							}
							count++;
							visited[rdx][rdy] = true;
							qu.add(new guilty(rdx, rdy));
						}

						break;
					// 상하
					case 2:
						for (int i = 2; i <= 3; i++) {
							int rdx = x + dx[i];
							int rdy = y + dy[i];

							if (isCheck(rdx, rdy)) {
								continue;
							}
							if (isPCheck(i, rdx, rdy)) {
								continue;
							}



							count++;
							visited[rdx][rdy] = true;
							qu.add(new guilty(rdx, rdy));
						}
						break;
					// 좌우
					case 3:
						for (int i = 0; i <= 1; i++) {
							int rdx = x + dx[i];
							int rdy = y + dy[i];

							if (isCheck(rdx, rdy)) {
								continue;
							}
							if (isPCheck(i, rdx, rdy)) {
								continue;
							}


							visited[rdx][rdy] = true;
							qu.add(new guilty(rdx, rdy));

						}
						break;
					// 상우
					case 4:
						for (int i = 0; i <= 3; i++) {
							if (i == 1 || i==2) {
								continue;
							}
							int rdx = x + dx[i];
							int rdy = y + dy[i];

							if (isCheck(rdx, rdy)) {
								continue;
							}

							if (isPCheck(i, rdx, rdy)) {
								continue;
							}

							count++;
							visited[rdx][rdy] = true;
							qu.add(new guilty(rdx, rdy));

						}
						break;
					// 하우
					case 5:
						for (int i = 0; i < 4; i++) {
							if (i == 1 || i == 3) {
								continue;
							}
							int rdx = x + dx[i];
							int rdy = y + dy[i];

							if (isCheck(rdx, rdy)) {
								continue;
							}
							if (isPCheck(i, rdx, rdy)) {
								continue;
							}

							count++;
							visited[rdx][rdy] = true;
							qu.add(new guilty(rdx, rdy));

						}
						break;
					// 하좌
					case 6:
						for (int i = 0; i < 4; i++) {
							if (i == 0 || i == 3) {
								continue;
							}
							int rdx = x + dx[i];
							int rdy = y + dy[i];

							if (isCheck(rdx, rdy)) {
								continue;
							}
							if (isPCheck(i, rdx, rdy)) {
								continue;
							}

							count++;
							visited[rdx][rdy] = true;
							qu.add(new guilty(rdx, rdy));

						}
						break;
					// 상좌
					case 7:
						for (int i = 0; i < 4; i++) {
							if (i == 0 ||i==2) {
								continue;
							}
							int rdx = x + dx[i];
							int rdy = y + dy[i];

							if (isCheck(rdx, rdy)) {
								continue;
							}
							if (isPCheck(i, rdx, rdy)) {
								continue;
							}

							count++;
							visited[rdx][rdy] = true;
							qu.add(new guilty(rdx, rdy));

						}
						break;
					}

				}
			}
			count = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (visited[i][j]) {
						count++;
					}
				}
			}
			System.out.println(Arrays.deepToString(visited));
			System.out.println(count);

		}

	}

	static public boolean isCheck(int rdx, int rdy) {
		if (rdx < 0 || rdy < 0 || rdx >= N || rdy >= M || map[rdx][rdy] == 0 || visited[rdx][rdy]) {
			return true;
		}
		return false;
	}

	static public void move(int x, int y) {
		for (int i = 0; i < 4; i++) {
			int rdx = x + dx[i];
			int rdy = y + dy[i];

			if (isCheck(rdx, rdy)) {
				continue;
			}

			count++;
			visited[rdx][rdy] = true;
			qu.add(new guilty(rdx, rdy));
		}
	}

	static public boolean isPCheck(int x, int rdx, int rdy) {
		switch (x) {
		//입구가 우를 보고있음
		case 0:
			if (!(map[rdx][rdy] == 3 || map[rdx][rdy] == 6 || map[rdx][rdy] == 1 || map[rdx][rdy] == 7)) {
				return true;
			}
			break;
	    //입구가 좌를 보고있음
		case 1:
			if (!(map[rdx][rdy] == 3 || map[rdx][rdy] == 4 || map[rdx][rdy] == 5 || map[rdx][rdy] == 1)) {
				return true;
			}
			break;
		//입구가 하를 보고있음
		case 2:
			if (!(map[rdx][rdy] == 4 || map[rdx][rdy] == 7 || map[rdx][rdy] == 1 || map[rdx][rdy] == 2)) {
				return true;
			}
			break;
		//입구가 상을 보고있음
		case 3:
			if (!(map[rdx][rdy] == 5 || map[rdx][rdy] == 6 || map[rdx][rdy] == 1 || map[rdx][rdy] == 2)) {
				return true;
			}
			break;
		}
		return false;
	}
}
