package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B18513 {
	static int[] dx = { 1, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(stz.nextToken());
		int K = Integer.parseInt(stz.nextToken());

		HashSet<Integer> set = new HashSet<Integer>();
		Queue<Integer> qu = new LinkedList<Integer>();
		stz = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			int k = Integer.parseInt(stz.nextToken());
			qu.offer(k);
			set.add(k); // boolean 대신 사용 치킨집 위치 지정
		}

		int result = 0;

		while (!qu.isEmpty()) {

			int x = qu.poll();

			for (int i = 0; i < 2; i++) {
				int rdx = x + dx[i];

				if (rdx > 10000000 || rdx < -100000000 || set.contains(rdx)) {
					continue;
				}

				result += Math.abs(rdx - x);
				K--;
				if (K == 0) {
					break;
				}
				set.add(rdx);
			}

			if (K == 0) {
				break;
			}
		}

		System.out.println(result);

	}

}
