package implement;
import java.util.Scanner;

public class B2292 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		long k=input.nextLong();
		int rangeMax=1;
		
		
		
		for(int i=0;i<k;i++) {
			rangeMax+=6*i;
		
			if(rangeMax>=k) {
				System.out.println(i+1);
				break;
			}
		}
			
			
			
			
			
			
			
			
			
			
		
		
		
		
	}

}
