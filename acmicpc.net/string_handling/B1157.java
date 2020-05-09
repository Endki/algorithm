package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		input = input.toUpperCase();

		int n = input.length();

		char[] arr = new char[n];
		int[] count = new int[n];
		Arrays.fill(count, 0);
		Arrays.fill(arr, ' ');

		int[] maxCount = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
//				if (input.charAt(i) != arr[j] && arr[j] == ' ') {
//
//					arr[j] = input.charAt(i);
//					count[j]++;
//					maxCount[j]++;
//				} else if (input.charAt(i) == arr[j]) {
//					count[j]++;
//					maxCount[j]++;
//					continue;
//
//				}

				if (input.charAt(i) == arr[j]) {
					count[j]++;
					maxCount[j]++;
					break;

				} else if (input.charAt(i) != arr[j] && arr[j] == ' ') {

					arr[j] = input.charAt(i);
					count[j]++;
					maxCount[j]++;
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(count));
		Arrays.parallelSort(maxCount);
		int max = 0;
		int pivot = 0;
		for (int i = 0; i < n; i++) {
			if (count[i] == maxCount[n - 1]) {
				pivot = i;
				max++;
			}
		}
		if (max > 1) {
			System.out.println("?");
		} else {

			System.out.println(arr[pivot]);
		}
	}

}
