package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B14490 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(":");
		
		int a=Integer.parseInt(input[0]);
		int b=Integer.parseInt(input[1]);
		
		int gcdA=Math.max(a, b);
		int gcdB=Math.min(a, b);
		
		int gcd=gcd(gcdA,gcdB);
		
		System.out.println(a/gcd+":"+b/gcd);
		
		
		
	
		
	}
	public static int gcd(int a, int b) {
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
}
