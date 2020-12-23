package implement;
import java.util.Scanner;

public class B10984 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int hackgi = input.nextInt();
		
		
		double tmp=0;
		double point=0; 
		double a=0,b=0;
		
		for(int i=0;i<hackgi;i++) {
			int inform= input.nextInt();
			tmp=0;
			point=0;
			for(int j=0;j<inform;j++) {
				
				a=input.nextDouble();
				b=input.nextDouble();
				tmp+=a*b;
				point+=a;
			}
			System.out.println((int)point+" "+String.format("%.1f",tmp/point));
			
		}
		
		
		
		

	}

}
