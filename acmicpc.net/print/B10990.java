package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10990 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k=n-1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i+n; j++) {
				if((j==(i+n)-1)||(j==k) ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
				
				
			}
			k--;
			System.out.println();
		}
	}

}
