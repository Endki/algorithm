package implement;
import java.util.Scanner;

public class B10409 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int t=input.nextInt();
		int sum=0;
		int count=0;
		for(int i=0;i<n;i++) {
			sum+=input.nextInt();
			if(sum<=t) {
				count++;
			}
		}
		System.out.println(count);

	}

}
