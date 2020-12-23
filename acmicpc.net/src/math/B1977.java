package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1977 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		boolean swit = false;
		int min = Integer.MAX_VALUE, sum = 0;

		for (int i = 0; i * i <= n; i++) {
			if (i * i >= m && i * i <= n) {
				sum += i * i;
				if (min > i * i) {
					min = i * i;
				}
				swit = true;
			}
		}

		if (swit) {
			System.out.println(sum);
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
	}

}
