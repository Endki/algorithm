package implement;
import java.util.Scanner;

public class B10039 {

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		int sum=0;
		int num=0;
		for(int i=0;i<5;i++) {
			
			num=input.nextInt();
			if(num<40) {
				num=40;
			}
			
			sum+=num;
			
			
		}
		System.out.println(sum/5);
	}

}
