package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1629 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		
		long a=Long.parseLong(input[0]);
		long b=Long.parseLong(input[1]);
		long c=Long.parseLong(input[2]);
		
		System.out.println(solve(a%c,b,c));
	}
	public static long solve(long a, long b, long c) {
		if (b == 1) {
			return a%c;
		}

		
		long tmp=solve(a,b/2,c)%c;
		
		if (b % 2 == 0)	{
			return (tmp*tmp)%c;
		}
			
		else {
			return (((tmp*tmp)%c)*a)%c;
		}
			
	}

}
