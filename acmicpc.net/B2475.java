import java.util.Scanner;

public class B2475 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int sum=0;
		for(int i=0;i<5;i++) {
			int k=input.nextInt();
			sum+=k*k;
		}
		System.out.println(sum%10);

	}

}
