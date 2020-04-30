package math;
import java.util.Scanner;

public class B9550 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int t=input.nextInt();
		
		int sum=0;
		for(int i=0;i<t;i++) {
			sum=0;
			int n=input.nextInt();
			int k=input.nextInt();
			
			
			for(int j=0;j<n;j++) {
				int candy=input.nextInt();
				sum+=candy/k;
			}
			System.out.println(sum);
		}
		
	}

}
