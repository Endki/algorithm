package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1032 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = new String[n];
		for (int i = 0; i < n; i++) {
			input[i] = br.readLine();
		}

		int tCase = input[0].length();
		
		if(n==1) {
			System.out.println(input[0]);
			return;
		}
		
		
		char[] solve=new char[tCase];
		
		
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				for (int k = 0; k < tCase; k++) {
					if (i != j) {
						if (solve[k] != '?') {
							if(input[i].charAt(k)==input[j].charAt(k)) {
								solve[k]=input[i].charAt(k);
							}else {
								solve[k]='?';
							}

						}
					}

				}
			}
		}
		String m=String.copyValueOf(solve);
		System.out.println(m);
		

	}

}
