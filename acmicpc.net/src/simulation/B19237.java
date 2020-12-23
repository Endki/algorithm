package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B19237 {
	static int[][] map;
	static int N, M, k;

	// 위 아래 왼쪽 오른쪽
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static class Shark {
		int x;
		int y;

		public Shark(int x, int y) {

			this.x = x;
			this.y = y;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(br.readLine());

		N = Integer.parseInt(stz.nextToken());
		M = Integer.parseInt(stz.nextToken());
		k = Integer.parseInt(stz.nextToken());

		map = new int[N][N];
		HashMap<Integer, Shark> hashmap = new HashMap<Integer, Shark>();
		int[][] arr = new int[N][N];

		int[] Shark_Current_Direction = new int[M + 1];// 현재 방향 1부터 M까지 사용
		int[][][] Shark_Priority = new int[M + 1][4][4]; // 1부터 M까지 사용 4방향의 4가지 기준
		// map input
		for (int i = 0; i < N; i++) {
			stz = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(stz.nextToken());
				if (map[i][j] != 0) {
					hashmap.put(map[i][j], new Shark(i, j));
					// key값을 상어의 번호로 사용한다. value는 상어의 위치 정보
					arr[i][j] = k;
				}
			}
		}

		// 상어의 첫방향 1 ~ M 순
		stz = new StringTokenizer(br.readLine());
		for (int i = 1; i <= M; i++) {
			Shark_Current_Direction[i] = Integer.parseInt(stz.nextToken());
		}

		// 상어의 방향 우선순위 1 ~ M까지 4번씩
		for (int i = 1; i <= M; i++) {
			for (int j = 0; j < 4; j++) {
				stz = new StringTokenizer(br.readLine());
				for (int z = 0; z < 4; z++) {
					Shark_Priority[i][j][z] = Integer.parseInt(stz.nextToken());
				}
			}
		}

		// input 종료

		int Time = 0;

		// solve
		while (true) {
			System.out.println(Arrays.deepToString(arr));
			System.out.println(Time);
			// 1번 샤크만 남았을 경우
			if (hashmap.size() == 1 || Time == 1001) {
				break;
			}

			// 모든 상어가 행동해야함
			for (int i = 1; i <= M; i++) {
				// remove 당한 친구면 continue;
				if (!hashmap.containsKey(i)) {
					continue;
				}

				Shark shark = hashmap.get(i); // 1번 상어부터 순서대로!
				int x = shark.x;
				int y = shark.y;

				// 상어가 지금 있는 곳 마킹
				map[x][y] = i; // 이동 전에 뿌려야 상어가 만나지 않는 경우가 없어진다.
				// 상어의 냄새 좌표 업데이트
				arr[x][y] = k;

				// 상어의 지금 보는 방향 = Shark_Current_Direction

				// 자신의 냄새가 있는 칸의 방향으로 잡는다. 특정한 우선 순위
				// 4방향 탐색
				// 4방향에 아무 냄새가 없는 곳이 있으면
				if (isCheck(x, y)) {

					for (int j = 0; j < 4; j++) {
						// 4방향을 현재 보는방향 기준의 우선 순위에 따른 방향
						int rdx = x + dx[(Shark_Priority[i][Shark_Current_Direction[i] - 1][j]) - 1];
						int rdy = y + dy[(Shark_Priority[i][Shark_Current_Direction[i] - 1][j]) - 1];

						// 맵 크기를 벗어난 곳 + 다른 상어 냄새가 나는 곳 예외 처리
						if (rdx < 0 || rdy < 0 || rdx >= N || rdy >= N || map[rdx][rdy] != 0) {
							continue;
						}

						// 상어의 현재위치 업데이트

						hashmap.put(i, new Shark(rdx, rdy));

						// 바라보는 방향 업데이트
						Shark_Current_Direction[i] = Shark_Priority[i][Shark_Current_Direction[i] - 1][j];
						break;
						// 상어 한마리 움직임 끝
					}
				}
				// 없으면
				else {
					for (int j = 0; j < 4; j++) {
						// 4방향을 현재 보는방향 기준의 우선 순위에 따른 방향
						int rdx = x + dx[(Shark_Priority[i][Shark_Current_Direction[i] - 1][j]) - 1];
						int rdy = y + dy[(Shark_Priority[i][Shark_Current_Direction[i] - 1][j]) - 1];

						// 맵 크기를 벗어난 곳 + 다른 상어 냄새가 나는 곳 예외 처리
						if (rdx < 0 || rdy < 0 || rdx >= N || rdy >= N || map[rdx][rdy] != i) {
							continue;
						}

						// 상어의 현재위치 업데이트

						hashmap.put(i, new Shark(rdx, rdy));

						// 바라보는 방향 업데이트
						Shark_Current_Direction[i] = Shark_Priority[i][Shark_Current_Direction[i] - 1][j];
						break;
						// 상어 한마리 움직임 끝
					}
				}
			}
			// M마리의 상어 움직임 끝

			// 상어들끼리 겹쳤는지 확인 하는 solve - 상어의 x,y위치가 같다.
			for (int i = 1; i < M; i++) {
				if (!hashmap.containsKey(i)) {
					continue;
				}
				Shark sha1 = hashmap.get(i);
				for (int j = i + 1; j <= M; j++) {
					if (!hashmap.containsKey(j)) {
						continue;
					}
					Shark sha2 = hashmap.get(j);

					if (sha1.x == sha2.x && sha1.y == sha2.y) {
						hashmap.remove(j);
					}
				}
			}

			// 상어의 냄새 시간 체크
			// k만큼 시간이 지났을때

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] != 0) {
						arr[i][j] -= 1;
					}
					if (arr[i][j] == 0) {
						map[i][j] = 0;
					}
				}
			}

			Time++;
		}
		
		// output
		if (Time == 1001) {
			System.out.println("-1");
		} else {
			System.out.println(Time);
		}

	}

	static boolean isCheck(int x, int y) {
		for (int i = 0; i < 4; i++) {
			int rdx = x + dx[i];
			int rdy = y + dy[i];

			if (rdx < 0 || rdy < 0 || rdx >= N || rdy >= N) {
				continue;
			}
			if (map[rdx][rdy] == 0) {
				return true;
			}
		}
		return false;

	}
}
