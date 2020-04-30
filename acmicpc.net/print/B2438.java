package print;
import java.util.Scanner;

public class B2438 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		char k='*';
		
		for(int i=0;i<n;i++) {
			System.out.print(k);
			for(int j=0;j<i;j++) {
				System.out.print(k);
			}
			System.out.println();
			
		}

	}

}
