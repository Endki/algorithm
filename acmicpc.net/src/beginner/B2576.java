package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		int min = 101;
		for (int i = 0; i < 7; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input % 2 == 0) {
				input = 0;
			} else {
				sum += input;
				min = Math.min(min, input);
			}
		}

		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
