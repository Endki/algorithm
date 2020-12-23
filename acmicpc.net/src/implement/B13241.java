package implement;
import java.util.Scanner;

public class B13241 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		long a=input.nextLong();
		long b=input.nextLong();
		
		
		long gcd=fucGCD(Math.max(a, b),Math.min(a, b));
		
		System.out.println((a*b)/gcd);
		
		
	}
	
	public static long fucGCD(long a, long b) {
		while(b>0) {
			long tmp=a;
			a=b;
			b=tmp%b;
		}
		return a;
	}

}
