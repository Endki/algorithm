import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1788 {
	static long cache[]=new long[1000001];
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		if(Math.abs(n)<=1) {
			System.out.println(Math.abs(n));
			System.out.println(Math.abs(n));
			return;
		}
		
		int a=0;
		int b=0;
		int c=1;
		
		boolean minus=false;
		if(n<0) {
			minus=true;
		}
		n=Math.abs(n);
		
		for(int i=2;i<=n;i++) {
			a=b;
			b=c;
			c=(a+b)%1000000000;
		}
		if(minus && n%2==0) {
			System.out.println(-1);
		}else {
			System.out.println(1);
		}
		System.out.println(c);
	}
}
