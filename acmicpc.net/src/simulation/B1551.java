package simulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1551 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		int temp = k;
		int[] arr = new int[n];

		input = br.readLine().split(",");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		while (temp > 0) {

			for (int i = 0; i < n - 1; i++) {
				arr[i] = arr[i + 1] - arr[i];
			}

			temp--;
		}

		for (int i = 0; i < n - k; i++) {
			if (i == (n - k) - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ",");
			}
		}

	}

}
