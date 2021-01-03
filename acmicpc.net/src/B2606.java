import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2606 {
	static int[] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());

		map = new int[N + 1];

		for (int i = 0; i <= N; i++) {
			map[i] = i;
		}

		for (int i = 0; i < B; i++) {
			StringTokenizer stz = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(stz.nextToken());
			int b = Integer.parseInt(stz.nextToken());

			union(a, b);
		}
		int count = -1;
		for (int i = 1; i <= N; i++) {
			if (find(i) == 1) {
				count++;
			}
		}

		System.out.println(count);

	}

	public static void union(int a, int b) {
		int x = find(a);
		int y = find(b);

		if (x > y) {
			map[x] = y;
		} else {
			map[y] = x;
		}
	}

	public static int find(int a) {
		if (map[a] == a) {
			return a;
		}

		return map[a] = find(map[a]);
	}

}
