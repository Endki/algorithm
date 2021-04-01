package perM_comB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B18429 {
	static int[] kit, output;
	static int count, N, K;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(br.readLine());

		N = Integer.parseInt(stz.nextToken());
		// 하루 지날때마다 K만큼 감소
		K = Integer.parseInt(stz.nextToken());

		kit = new int[N];
		count = 0;
		stz = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			kit[i] = Integer.parseInt(stz.nextToken());
		}

		visited = new boolean[N];
		output = new int[N];

		comb(0);
		System.out.println(count);
	}

	public static void comb(int depth) {

		if (depth == N) {
			int weight = 500;

			for (int i = 0; i < N; i++) {
				weight -= K;
				weight += output[i];
				
				if (weight < 500) {

					return;
				}
			}
			count++;
			return;
		}

		for (int i = 0; i < N; i++) {
			if (visited[i]) {
				continue;
			}
			visited[i] = true;
			output[i] = kit[depth];
			comb(depth + 1);
			visited[i] = false;
		}

	}
}
