package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9933 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}

		String[] mirror = new String[n];

		for (int i = 0; i < n; i++) {
			String m = "";
			for (int j = arr[i].length() - 1; j > -1; j--) {
				m += arr[i].charAt(j);
			}
			mirror[i] = m;
		}
		int pivot=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					if (arr[i].equals(mirror[j])) {
						
						pivot=i;
						break;
					}
				}
			}

		}
		System.out.println(arr[pivot].length() + " " + arr[pivot].charAt(arr[pivot].length() / 2));
	}

}
