package implement;
import java.util.Scanner;

public class B5565 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int k=input.nextInt();
		
		int sum=0;
		
		for(int i=0;i<9;i++) {
			sum+=input.nextInt();
		}
		
		System.out.println(k-sum);
		
	}

}
