package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B3055 {
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static int count;
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Queue<int[]> FireQ = new LinkedList<int[]>();
		Queue<int[]> heroXY = new LinkedList<int[]>();

		StringTokenizer stz = new StringTokenizer(br.readLine());

		int R = Integer.parseInt(stz.nextToken());
		int C = Integer.parseInt(stz.nextToken());

		char[][] arr = new char[R][C];
		int[] home = new int[2];
		
		for (int i = 0; i < R; i++) {
			arr[i] = br.readLine().toCharArray();
		}

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (arr[i][j] == 'D') {
					home[0] = i;
					home[1] = j;
				}
				if (arr[i][j] == 'S') {
					heroXY.offer(new int[] {i, j, 0});
				}
				if (arr[i][j] == '*') {
					FireQ.offer(new int[] {i, j});
					
				}
			}
		}

		boolean firehome=false;
		while (!heroXY.isEmpty()) {

			firehome=false;
			count = 0;
			// 불가능 체크
			for (int i = 0; i < 4; i++) {
				int rdx = home[0]+dx[i];
				int rdy = home[1]+dy[i];
				
				
				
				
				if (rdx < 0 || rdy < 0 || rdx >= R || rdy >= C) {
					continue;
				}
				
				if(arr[rdx][rdy]!='*') {
					firehome=true;
				}
				
			}

			int len = FireQ.size();
			// 불 번짐

			for (int i = 0; i < len; i++) {
				int[] fi = FireQ.poll();
				for (int fire = 0; fire < 4; fire++) {
					int rdx = fi[0] + dx[fire];
					int rdy = fi[1] + dy[fire];

					if (rdx < 0 || rdy < 0 || rdx >= R || rdy >= C || arr[rdx][rdy] == 'X' || arr[rdx][rdy] == 'D'
							|| arr[rdx][rdy] == 'S' || arr[rdx][rdy]=='*') {
						continue;
					}

					arr[rdx][rdy] = '*';
					FireQ.offer(new int[] {rdx, rdy});
				}
			}
			// 용사 이동

			int siz = heroXY.size();
			boolean swt=false;
			for (int i = 0; i < siz; i++) {
				int[] hr = heroXY.poll();
				count = hr[2] + 1;
				for (int j = 0; j < 4; j++) {
					int rdx = hr[0] + dx[j];
					int rdy = hr[1] + dy[j];

					if (rdx < 0 || rdy < 0 || rdx >= R || rdy >= C || arr[rdx][rdy] == '*' || arr[rdx][rdy] == 'X'|| arr[rdx][rdy]=='S') {
						continue;
					}
					
					
					if (arr[rdx][rdy] == 'D' ) {
						System.out.println(count);
						return;
					}
					swt=true;
					arr[rdx][rdy] = 'S';
					heroXY.offer(new int[] {rdx, rdy, count});
					
				}
			}
			if(!firehome || !swt) {
				System.out.println("KAKTUS");
				return;
			}
		}
		

	}

}
