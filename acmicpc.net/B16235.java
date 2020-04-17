import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.StringTokenizer;

public class B16235 {
	static int n, m, k;
	static int map[][], sdmap[][];
	static int dx[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int dy[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static Deque<tree> treeArray = new ArrayDeque<tree>(), deadTree = new ArrayDeque<tree>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc, " ");
		n = Integer.parseInt(st.nextToken()); // 땅 크기
		m = Integer.parseInt(st.nextToken()); // 나무 갯수.
		k = Integer.parseInt(st.nextToken()); // 몇년이 지났는지?
		sdmap = new int[n + 2][n + 2]; // 로봇이 양분을 줄 수 있는 지도..
		map = new int[n + 2][n + 2]; // 실제 땅의 양분을 표시하는 지도.

		for (int i = 0; i < n + 2; i++) {
			Arrays.fill(sdmap[i], -1);
			Arrays.fill(map[i], -1);
		}
		for (int i = 1; i < n + 1; i++) {
			String ms = br.readLine();
			st = new StringTokenizer(ms, " ");
			for (int j = 1; j < n + 1; j++) {
				sdmap[i][j] = Integer.parseInt(st.nextToken());
				map[i][j] = 5; // 5로 고정.
			}
		} // 지도 양분 맵핑.
		for (int i = 0; i < m; i++) {
			String ts = br.readLine();
			st = new StringTokenizer(ts, " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			treeArray.add(new tree(x, y, z));
		} // 나무배열에 새로운 나무 객체넣어 두기.
		k *= 4; // 4계절이니까 1년을 4배해서 분기별(봄,여름,가을,겨울)로 루틴 돌리기.
		while (k > 0) {
			if (k % 4 == 0) { // 봄
				// System.out.println("Spring");
				Deque<tree> temptree = new ArrayDeque<tree>();

				while (!treeArray.isEmpty()) {
					tree temp = treeArray.poll();
					int x = temp.x;
					int y = temp.y;
					int year = temp.year;
					if (map[x][y] >= year) {
						// 실제 땅에 양분의 양이 자기 나이보다 많으면 양분빨아서 먹음.
						map[x][y] -= year;
						temp.year++;
						temptree.offer(temp);
					} else {
						// 못먹으면 죽음.
						deadTree.offer(temp);
					}
				}
				treeArray = temptree;
			} else if (k % 4 == 3) {
				// 여름.
				// System.out.println("summer");
				while (!deadTree.isEmpty()) { // 죽은 나무들 위치에서 양분 주기.
					tree temp = deadTree.poll();
					int addYear = temp.year / 2;
					map[temp.x][temp.y] += addYear;
				}
			} else if (k % 4 == 2) {
				// 가을.
				// System.out.println("fall");
				Deque<tree> temptree = new ArrayDeque<tree>();

				while (!treeArray.isEmpty()) {
					tree temp = treeArray.poll();
					int x = temp.x;
					int y = temp.y;
					int year = temp.year;
					if (year % 5 == 0) {
						for (int j = 0; j < 8; j++) {
							if (map[x + dx[j]][y + dy[j]] != -1) {
								temptree.offerFirst(new tree(x + dx[j], y + dy[j], 1));
							}
						}
					}
					temptree.offer(temp);
				}
				treeArray = temptree;

			} else {
				// 겨울.
				// System.out.println("winter");
				for (int i = 1; i < n + 1; i++) {
					// S2D2가 양분 뿌리고 다니는것.
					for (int j = 1; j < n + 1; j++) {
						map[i][j] += sdmap[i][j];
					}
				}
			}
			k--;
		}
		bw.write(String.valueOf(treeArray.size()));
		bw.flush();
		bw.close();
	}
}

class tree {
	int x, y, year;

	public tree(int x, int y, int year) {
		this.x = x;
		this.y = y;
		this.year = year;
	}

	public String toString() {
		return "tree's x: " + x + " y: " + y + " year: " + year;
	}
}