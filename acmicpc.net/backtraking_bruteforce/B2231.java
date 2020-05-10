package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2231 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String k = br.readLine();
		
		int a = Integer.parseInt(k);
		int abc=a;
		int sum = 0;
		int length = k.length();
		boolean swt=false;
		
		for (int j = 1; j <= a; j++) {
			sum=0;
			abc=j;
			for (int i = 0; i < length; i++) {
				sum += abc % 10;
				abc/=10;
			}
			sum+=j;
			if(sum==a) {
				System.out.println(j);
				swt=true;
				break;
			}
		}
		if(swt==false) {
			System.out.println("0");
		}
	}

}
