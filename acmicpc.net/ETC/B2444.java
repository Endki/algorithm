package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2444 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k=3;
		String tmp=" ";
		
		
		for (int i = 1; i <= (2 * n) - 1; i++) {
			
			if (i <= (((2 * n) - 1) + 1) / 2) {
				for(int j=i;j<n;j++) {
				System.out.print(tmp);
				}
				
				for (int j = 1; j <= (2 * i) - 1; j++) {
					System.out.print("*");
				}
				
				System.out.println();
			} else {
				for(int j=0;j<i-n;j++) {
				System.out.print(tmp);
				}
				
				for (int j = (2*n)-k; j >0; j--) {
					System.out.print("*");
				}
				k+=2;
				System.out.println();
			}
		}
	}

}
