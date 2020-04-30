package implement;
import java.util.Scanner;

public class B1676 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int n=input.nextInt();
		
		System.out.println(count(n));
		
	}
	
	public static int count(int n) {
		int two=0;
		int five=0;
		
		for(int i=2;i<=n;i*=2) {
			two+=n/i;
		}
		for(int i=5;i<=n;i*=5) {
			five+=n/i;
		}
		return Math.min(two, five);
	}

}
