package BFS.DFS;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1260 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int n = input.nextInt();
		int m = input.nextInt();
		int v = input.nextInt();
		int x = 0, y = 0;

		int[][] arr = new int[n + 1][n + 1];
		boolean[] visit = new boolean[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i][i] = 1;
		}

		for (int i = 0; i < m; i++) {
			x = input.nextInt();
			y = input.nextInt();
			arr[x][y] = 1;
			arr[y][x] = 1;
		}

		DFS(arr, visit, v);
		System.out.println();
		Arrays.fill(visit, false);
		BFS(arr, visit, v, queue);
	}

	public static void DFS(int arr[][], boolean[] visit, int v) {
		if (visit[v] == true) {
			return;
		} else {
			System.out.print(v + " ");
			visit[v] = true;
			for (int i = 1; i < visit.length; i++) {
				if (arr[v][i] == 1 && visit[i] == false) {

					DFS(arr, visit, i);
				}
			}
			return;
		}
	}

	public static void BFS(int arr[][], boolean[] visit, int v, Queue queue) {
		if (visit[v] == true) {
			return;
		} else {
			System.out.print(v + " ");
			visit[v] = true;
			for (int i = 1; i < visit.length; i++) {
				if (arr[v][i] == 1 && visit[i] == false) {
					queue.offer(i);
				}
			}
			while (!queue.isEmpty()) {
				BFS(arr, visit, (int) queue.poll(), queue);
			}

		}
		return;
	}
}
