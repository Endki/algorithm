import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10211 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int max = -100000;
			int count = n;
			int count2=0;
			while (count > 0) {
				
				for (int i = 0; i < n-count2; i++) {
					int sum = 0;

					for (int j = n - count; j < n - i; j++) {
						sum += arr[j];
					}
					if (max < sum) {
						max = sum;
					}
					
				}
				count2++;
				count--;
			}

			t--;
			System.out.println(max);

		}

		br.close();
	}

}
