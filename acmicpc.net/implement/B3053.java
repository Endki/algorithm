package implement;
import java.util.Scanner;

public class B3053 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int r=input.nextInt();
		
		double ucle=Math.PI*(r*r);
		double taxi=2*(r*r);
		
		System.out.println(String.format("%.6f", ucle));
		System.out.println(String.format("%.6f", taxi));

	}

}
