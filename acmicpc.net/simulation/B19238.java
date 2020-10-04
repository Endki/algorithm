package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B19238 {

	static class Taxi {
		int x;
		int y;
		int fuel;

		public Taxi(int x, int y, int fuel) {
			super();
			this.x = x;
			this.y = y;
			this.fuel = fuel;
		}

	}

	static class Human {
		int x;
		int y;
		int fx;
		int fy;

		public Human(int x, int y, int fx, int fy) {

			this.x = x;
			this.y = y;
			this.fx = fx;
			this.fy = fy;
		}

	}

	static class Node {
		int x;
		int y;
		int distance;

		public Node(int x, int y, int distance) {
			super();
			this.x = x;
			this.y = y;
			this.distance = distance;
		}

	}

	static int N, M;
	static int[][] map;
	static boolean[] visited;
	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(br.readLine());
		N = Integer.parseInt(stz.nextToken());
		M = Integer.parseInt(stz.nextToken());
		int F = Integer.parseInt(stz.nextToken());

		map = new int[N + 1][N + 1];
		visited = new boolean[M + 1];

		HashMap<Integer, Human> hashmap = new HashMap<Integer, Human>();

		for (int i = 0; i < N; i++) {
			stz = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(stz.nextToken());
			}
		}

		stz = new StringTokenizer(br.readLine());
		Taxi taxi = new Taxi(Integer.parseInt(stz.nextToken()), Integer.parseInt(stz.nextToken()), F);

		for (int i = 1; i <= M; i++) {
			stz = new StringTokenizer(br.readLine());
			hashmap.put(i, new Human(Integer.parseInt(stz.nextToken()), Integer.parseInt(stz.nextToken()),
					Integer.parseInt(stz.nextToken()), Integer.parseInt(stz.nextToken())));
		}

		boolean flag = false;

		loop: while (true) {
			int min_index = Integer.MAX_VALUE;
			int min = Integer.MAX_VALUE - 1;

			for (int i = 1; i <= M; i++) {
				
				if (!visited[i]) {
					int leng = bfs(taxi.x, taxi.y, hashmap.get(i).x, hashmap.get(i).y);
					if (leng == Integer.MAX_VALUE) {
						break loop;
					}
					
					if(min>=leng) {
						if(min==leng) {
							if(hashmap.get(min_index).x>hashmap.get(i).x) {
								min=leng;
								min_index=i;
							}
							
							else if(hashmap.get(min_index).x==hashmap.get(i).x) {
								if(hashmap.get(min_index).y>hashmap.get(i).y) {
									min=leng;
									min_index=i;
								}
							}
						}
						else {
							min=leng;
							min_index=i;
						}
					}
				}
			}
			if(min==Integer.MAX_VALUE-1) {
				flag=true;
				break;
			}
			visited[min_index]=true;
			int useF=min+bfs(hashmap.get(min_index).x,hashmap.get(min_index).y,hashmap.get(min_index).fx,hashmap.get(min_index).fy);
			
			if(useF>taxi.fuel) {
				System.out.println(-1);
				return;
			}
			
			taxi=new Taxi(hashmap.get(min_index).fx,hashmap.get(min_index).fy,taxi.fuel-useF+2*(useF-min));
			
		}
		
		if(!flag) {
			System.out.println(-1);
		}else {
			System.out.println(taxi.fuel);
		}
	}

	
	
	private static int bfs(int x, int y, int finish_x, int finish_y) {
		Queue<Node> qu = new LinkedList<Node>();
		boolean[][] visit = new boolean[N + 1][N + 1];

		qu.add(new Node(x, y, 0));
		visit[x][y] = true;

		while (!qu.isEmpty()) {
			Node node = qu.poll();
			int nodex = node.x;
			int nodey = node.y;
			int nodeD = node.distance;

			// 도착하면
			if (node.x == finish_x && node.y == finish_y) {
				return node.distance;
			}

			for (int i = 0; i < 4; i++) {
				int rdx = nodex + dx[i];
				int rdy = nodey + dy[i];

				if (rdx <= 0 || rdy <= 0 || rdx > N || rdy > N || map[rdx][rdy]==1 || visit[rdx][rdy]) {
					continue;
				}

				visit[rdx][rdy] = true;
				qu.add(new Node(rdx, rdy, nodeD + 1));

			}

		}

		return Integer.MAX_VALUE;
	}

}
