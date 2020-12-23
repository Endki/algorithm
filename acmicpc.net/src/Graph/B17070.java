package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B17070 {
	static int N;
	static int[][] map;
	static boolean[][] visited;
	// 대각선 체크 배열
	static int[] dx = { 0, 1, 1 };
	static int[] dy = { 1, 1, 0 };
	static int count;

	static class Node {
		int x;
		int y;
		int direction;

		public Node(int x, int y, int direction) {
			super();
			this.x = x;
			this.y = y;
			this.direction = direction;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		map = new int[N][N];
		visited = new boolean[N][N];
		Queue<Node> qu = new LinkedList<Node>();
		count = 0;
//		map[0][0] = 2;
//		map[0][1] = 2;
		visited[0][0] = true;
		visited[0][1] = true;

		for (int i = 0; i < N; i++) {
			StringTokenizer stz = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(stz.nextToken());
			}
		}

		visited = new boolean[N][N];
		visited[0][0] = true;
		visited[0][1] = true;

		// direction 은 가로0 세로 1 대각선 2
		qu.add(new Node(0, 1, 0));
		boolean flag=false;
		while (!qu.isEmpty()) {
			Node node = qu.poll();
			int x = node.x;
			int y = node.y;
			int direction = node.direction;

			int rdx = 0;
			int rdy = 0;
			if (x == N - 1 && y == N - 1) {
				count++;
				flag=true;
			} else {

				switch (direction) {
				// 가로
				case 0:
					// 체크를 둘중 하나 할 수 있음 계속 가로로 하거나 대각선으로 하거나
					// 체크
					for (int i = 0; i < 3; i++) {
						rdx = x + dx[i];
						rdy = y + dy[i];

						if (isCheck(rdx, rdy) || map[rdx][rdy] != 0) {
							continue;
						}
						// 가로
						if (i == 0) {
							qu.offer(new Node(rdx, rdy, 0));
						} else if(i==1){
							if(crossCheck(x, y)) {
								qu.offer(new Node(rdx, rdy, 2));
							}
							
						}
					}

					break;
				// 세로
				case 1:
					// 체크를 둘중 하나 할 수 있음 계속 세로로 가거나 대각선으로 가거나
					// 세로체크

					// 킹각선
					for (int i = 0; i < 3; i++) {
						rdx = x + dx[i];
						rdy = y + dy[i];

						if (isCheck(rdx, rdy) || map[rdx][rdy] != 0) {
							continue;
						}
						// 세로
						if (i == 2) {
							qu.offer(new Node(rdx, rdy, 1));
						} else if(i==1){
							if(crossCheck(x, y)) {
								qu.offer(new Node(rdx, rdy, 2));
							}
						}
					}
					break;
				// 대각선
				case 2:
					// 체크를 셋중하나 할 수 있음 가로-세로-대각선
					for (int i = 0; i < 3; i++) {
						rdx = x + dx[i];
						rdy = y + dy[i];

						if (isCheck(rdx, rdy) || visited[rdx][rdy] || map[rdx][rdy] != 0) {
							continue;
						}
						
						if(i==0) {
							qu.offer(new Node(rdx, rdy, 0));
						}else if(i==2) {
							qu.offer(new Node(rdx, rdy, 1));
						}else {
							if(crossCheck(x, y)) {
								qu.offer(new Node(rdx, rdy, 2));
							}
						}
					}

					break;

				}
			}

		}
		if(flag) {
			System.out.println(count);
		}else {
			System.out.println("0");
		}
		
	}

	static boolean isCheck(int x, int y) {
		if (x < 0 || y < 0 || x >= N || y >= N) {
			return true;
		}

		return false;
	}
	
	static boolean crossCheck(int x,int y) {
		if(map[x+1][y+1] == 0 &&  map[x][y+1] == 0&&map[x+1][y] == 0) {
			return true;
		}
		return false;
	}
}
