package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2139 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;

		int d = 1;
		int m = 1;
		int y = 1;
		boolean swt = false;
		int sum = d + m + y;
		while (true) {
			swt=false;
			sum=0;
			stz = new StringTokenizer(br.readLine());
			d = Integer.parseInt(stz.nextToken());
			m = Integer.parseInt(stz.nextToken());
			y = Integer.parseInt(stz.nextToken());
			if((d+m+y)==0) {
				break;
			}
			
			if (y % 4 == 0) {
				swt = true;
			}

			if (y % 100 == 0) {
				swt = false;
			}

			if (y % 400 == 0) {
				swt = true;
			}

			for (int i = 1; i < m; i++) {
				if (i == 4 || i == 6 || i == 9 || i == 11) {
					sum += 30;
				} else if (i == 2 && swt == false) {
					sum += 28;
				} else if (i == 2 && swt == true) {

					sum += 29;

				} else {
					sum += 31;
				}
			}
			sum+=d;
			System.out.println(sum);
			
		}

	}

}
