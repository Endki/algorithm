package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10809 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String k = br.readLine();
		int n = k.length();

		char[] arr = new char[26];
		int[] solve = new int[26];
		for (int i = 0; i < 26; i++) {
			arr[i] = (char) (i + 97);
		}

		Arrays.fill(solve, -1);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 26; j++) {
				if (solve[j] == -1) {
					if (k.charAt(i) == arr[j]) {
						solve[j] = i;
					}
				}
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(solve[i] + " ");
		}
	}

}
