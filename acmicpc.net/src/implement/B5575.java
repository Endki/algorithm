package implement;
import java.util.Scanner;

public class B5575 {

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int hour=0;
		int minute=0;
		int second=0;
		
		int hourT=0,minuteT=0,secondT=0;
		
		
		for(int i=0;i<3;i++) {
			hour=input.nextInt();
			minute=input.nextInt();
			second=input.nextInt();
			
			hourT=input.nextInt();
			minuteT=input.nextInt();
			secondT=input.nextInt();
			
			int Asum,Bsum,sum;
			
			Asum=(hour*3600)+(minute*60)+second;
			Bsum=(hourT*3600)+(minuteT*60)+secondT;
			
			sum=Bsum-Asum;
			
			hour=sum/3600;
			minute=(sum%3600)/60;
			second=(sum%3600)%60;
			System.out.println(hour+" "+minute+" "+second);
			
			
			
			
		}
		
	}
}
