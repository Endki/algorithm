package ready.IM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14696 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine());

		while (TC-- > 0) {
			int[] A = new int[4];
			int[] B = new int[4];

			StringTokenizer stz = new StringTokenizer(br.readLine());
			int leng = Integer.parseInt(stz.nextToken());

			for (int i = 0; i < leng; i++) {
				A[Integer.parseInt(stz.nextToken()) - 1]++;
			}

			stz = new StringTokenizer(br.readLine());
			leng = Integer.parseInt(stz.nextToken());
			for (int i = 0; i < leng; i++) {
				B[Integer.parseInt(stz.nextToken()) - 1]++;
			}

			int swt = 2;
			for (int i = 3; i > -1; i--) {
				if (A[i] > B[i]) {
					swt = 0;
					break;
				} else if (A[i] < B[i]) {
					swt = 1;
					break;
				}
			}

			if (swt == 0) {
				System.out.println("A");
			} else if (swt == 1) {
				System.out.println("B");
			} else {
				System.out.println("D");
			}
		}

	}

}
