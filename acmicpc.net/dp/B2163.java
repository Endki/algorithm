package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2163 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		
		int n=Integer.parseInt(input[0]);
		int m=Integer.parseInt(input[1]);
		
		
		System.out.println((n*m)-1);
		
		
	}

}
