package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B1753 {

	static class Vertex implements Comparable<Vertex> {
		int no, totalDistance;

		private Vertex(int no, int totalDistance) {
			this.no = no;
			this.totalDistance = totalDistance;
		}

		@Override
		public int compareTo(Vertex o) {
			return this.totalDistance - o.totalDistance;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(br.readLine());

		int V = Integer.parseInt(stz.nextToken());
		int E = Integer.parseInt(stz.nextToken());
		int StartNode = Integer.parseInt(br.readLine()) - 1;

		int INF = Integer.MAX_VALUE;

		int[] distance = new int[V];
		boolean[] visited = new boolean[V];
		
		Arrays.fill(distance, INF);
		distance[StartNode] = 0;
		ArrayList<Vertex>[] list = new ArrayList[V];
		
		for(int i=0;i<V;i++) {
			list[i]=new ArrayList<Vertex>();
		}
		for (int i = 0; i < E; i++) {
			stz = new StringTokenizer(br.readLine());

			int v1 = Integer.parseInt(stz.nextToken()) - 1; // from
			int v2 = Integer.parseInt(stz.nextToken()) - 1; // to
			int weight = Integer.parseInt(stz.nextToken());// distance

			// v1->v2
			list[v1].add(new Vertex(v2, weight));
		}

		PriorityQueue<Vertex> pQueue = new PriorityQueue<Vertex>();

		pQueue.offer(new Vertex(StartNode, distance[StartNode]));

		Vertex current = null;

		while (!pQueue.isEmpty()) {

			// 1단계: 방문하지 않은 정점들 중 출발지에서 자신까지 오는 비용이 최단인 정점을 고려할 경유지로 선택
			current = pQueue.poll();

			if (visited[current.no]) {
				continue;// PQ에 남아있던 totalDistance의 최소비용보다 더 큰 상태
			}

			visited[current.no] = true;
			for (Vertex node : list[current.no]) {
				if (distance[node.no] > distance[current.no] + node.totalDistance) {
					distance[node.no] = distance[current.no] + node.totalDistance;
					pQueue.add(new Vertex(node.no, distance[node.no]));
				}
			}
		}

		for (int i = 0; i < distance.length; i++) {
			if (distance[i] == INF) {
				System.out.println("INF");
			} else {
				System.out.println(distance[i]);
			}
		}

	}

}
