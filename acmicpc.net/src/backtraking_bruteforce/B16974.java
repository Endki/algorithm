package backtraking_bruteforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B16974 {
	static long[] h, p;
	static int N;
	static long X;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().split(" ");
		N=Integer.parseInt(input[0]);
		X=Long.parseLong(input[1]);

		h = new long[N + 1];
		p = new long[N + 1];
		
		h[0] = 1;
		p[0] = 1;
		
		for(int i = 1 ; i <= N ; ++i) {
			h[i] = 1 + h[i - 1] + 1 + h[i - 1] + 1;
			p[i] = p[i - 1] + 1 + p[i - 1];
		}
		
		System.out.println(recursive(N, X));
		
	}
	public static long recursive(int n, long x) {
		
		if (n == 0) {
			if (x == 0) return 0;
			else if (x == 1) return 1;
		}
		
		if(x == 1) {
			return 0;
		} else if(x <= 1 + h[n - 1]) {
			return recursive(n - 1, x - 1);
		} else if(x == 1 + h[n - 1] + 1) {
			return p[n - 1] + 1;
		} else if(x <= 1 + h[n - 1] + 1 + h[n - 1]) {
			return p[n - 1] + 1 + recursive(n - 1, x - (1 + h[n - 1] + 1));
		} else {
			return p[n - 1] + 1 + p[n - 1];
		}
	}
}
