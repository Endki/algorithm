package beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1934 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		
		while(N-->0) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			
			int a=Integer.parseInt(stz.nextToken());
			int b=Integer.parseInt(stz.nextToken());
			
			int gcd=getGcd(Math.max(a, b), Math.min(a, b));
			
			System.out.println((a*b)/gcd);
			
		}
		

	}
	
	
	public static int getGcd(int a,int b) {
		int N=0;
		
		while(b!=0) {
			N=a%b;
			a=b;
			b=N;
		}
		
		return a;
	}

}
