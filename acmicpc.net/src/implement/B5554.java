package implement;
import java.util.Scanner;

public class B5554 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int A=input.nextInt();
		int B=input.nextInt();
		int C=input.nextInt();
		int D=input.nextInt();
		
		int sum=A+B+C+D;
		
		System.out.println(sum/60);
		System.out.println(sum%60);

	}

}
