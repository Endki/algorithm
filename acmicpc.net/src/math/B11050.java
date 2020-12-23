package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11050 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		int n=Integer.parseInt(input[0]);
		int k=Integer.parseInt(input[1]);
		//°ø½Ä n!/((n-k)!k!)
		
		System.out.println(fac(n)/(fac(n-k)*fac(k)));
	}
	public static int fac(int n) {
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum*=i;
		}
		return sum;
	}

}
