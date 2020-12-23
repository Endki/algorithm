package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10870 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int solve=pibo(Integer.parseInt(br.readLine()));
		System.out.println(solve);
		
	}

	public static int pibo(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
		return (pibo(n-1)+pibo(n-2));
	}
}
