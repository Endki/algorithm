package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class B19236 {

	public static int answer, cnt; // 최대값, queue에 따른 정보를 저장하기 위한 변수
	public static Map<Integer, int[][]> SMap; // queue에 따른 map 정보 저장
	public static Map<Integer, Map<Integer, int[]>> fishMove; // queue에 따른 fish 정보 저장
	public static Queue<int[]> qu; // bfs 구현을 위한 queue
	public static int[][] dir = {
			{0,  0}, {-1,  0}, {-1, -1},
			{0, -1}, { 1, -1}, { 1,  0},
			{1,  1}, { 0,  1}, {-1,  1}
	};
	
	public static void recusive() {
		while (!qu.isEmpty()) {
			int[] s = qu.poll();
			int[][] map = SMap.get(s[4]); // cnt를 이용해 queue에 따른 map 정보 불러오기
			Map<Integer, int[]> f = fishMove.get(s[4]); // cnt를 이용해 queue에 따른 fish 정보 불러오기
			int sum = s[3] + map[s[0]][s[1]]; // 물고기 번호 섭취
			answer = answer < sum ? sum : answer; // 최대값 확인
			
			map[s[0]][s[1]] = -1; // 상어 위치 표시
			move(map, f); // 물고기의 이동
			map[s[0]][s[1]] = 0; // 상어가 물고기를 먹고 난 후 빈 자리 표시
			
            		// 상어의 이동
			int y = s[0] + dir[s[2]][0];
			int x = s[1] + dir[s[2]][1];
			
            		// 상어가 가진 방향에서 먹을 수 있는 물고기를 모두 queue에 대입
			while (0 <= y && y < 4 && 0 <= x && x < 4) {
				if (map[y][x] != 0) {
                			// map과 fish 정보는 주소값으로 저장되기 때문에 새로운 배열과 HashMap을 만들고 새로운 주소로 저장
					int[][] cMap = new int[4][4];
					Map<Integer, int[]> cFish = new HashMap<>();
					
					for (int i = 0; i < 4; ++i) {
						for (int j = 0; j < 4; ++j) {
							cMap[i][j] = map[i][j];
						}
					}
					
					cFish.putAll(f);
					
					SMap.put(cnt, cMap);
					fishMove.put(cnt, cFish);
					qu.offer(new int[] {y, x, f.get(map[y][x])[2], sum, cnt++});
				}
				
				y += dir[s[2]][0];
				x += dir[s[2]][1];
			}
		}
	}

	// 죽은 물고기인지 확인
	public static boolean dead(int[][] map, int num) {
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 4; ++j) {
				if (map[i][j] == num)
					return false;
			}
		}
		return true;
	}
	
	public static void move(int[][] map, Map<Integer, int[]> f) {
		for (int i = 1; i <= 16; ++i) {
			if (dead(map, i))
				continue;
			
			int[] l = new int[] {f.get(i)[0], f.get(i)[1]};
			int d = f.get(i)[2];
			int y = l[0] + dir[d][0];
			int x = l[1] + dir[d][1];
			
            		// 방향을 먼저 잡음
			while (y < 0 || 4 <= y || x < 0 || 4 <= x || map[y][x] == -1) {
				d = (d + 1) % 9;
				if (d == 0) d = 1;
				
				y = l[0] + dir[d][0];
				x = l[1] + dir[d][1];
			}
			
            		// 해당 방향으로 한 칸 이동
            		// 만약 해당 칸에 물고기가 없다면 0과 swap, 있다면 그 물고기와 swap
			if (map[y][x] == 0) {
				map[l[0]][l[1]] = 0;
			}
			else {
				f.put(map[y][x], new int[] {l[0], l[1], f.get(map[y][x])[2]});
				map[l[0]][l[1]] = map[y][x];
			}
			
			f.put(i, new int[] {y, x, d});
			map[y][x] = i;
		}
	}
	
	public static void main(String[] args) throws IOException {
		answer = 0;
		cnt = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] map = new int[4][4];
		Map<Integer, int[]> fish = new HashMap<>();
		SMap = new HashMap<>();
		fishMove = new HashMap<>();
		qu = new LinkedList<>();
		
		for (int i = 0; i < 4; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			
			for (int j = 0; j < 4; ++j) {
				map[i][j] = Integer.parseInt(st.nextToken());
				fish.put(map[i][j], new int[] {i, j, Integer.parseInt(st.nextToken())});
			}
		}
		
		SMap.put(cnt, map);
		fishMove.put(cnt, fish);
		qu.offer(new int[] {0, 0, fish.get(map[0][0])[2], 0, cnt++});
		recusive();
		
		System.out.println(answer);
	}


}
