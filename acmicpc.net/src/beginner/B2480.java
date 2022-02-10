package beginner;

import java.io.IOException;
import java.util.Scanner;

public class B2480 {

	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a==b && b==c) {
			System.out.println(10000+(1000*a));
			return;
		}
		
		if(a==b || b==c || a==c) {
			if(a==b) {
				System.out.println(1000+(a*100));
			}else if(b==c) {
				System.out.println(1000+(b*100));
			}else {
				System.out.println(1000+(a*100));
			}
			return;
		}

		
		System.out.println(100*Math.max(a, Math.max(b, c)));
	}

}
