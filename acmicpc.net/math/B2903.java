package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2903 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		int basic=2;
		
		for(int i=0;i<n;i++) {
			basic=(basic*2)-1;
		}
		
		System.out.println(basic*basic);
		
	}

}
