package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2522 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int k=n-1;
		boolean swt=true;
		
		
		for (int i = 1; i <= (2 * n) - 1; i++) {

			for(int j=0;j<n;j++) {
				
				if(j<k) {
				System.out.print(" ");
				
				}else {
				System.out.print("*");
				}
				
			}
			if(i<n) {
				k--;
			}else {
				k++;
			}
			System.out.println();
		}
	}

}
