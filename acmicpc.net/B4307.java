import java.util.Arrays;
import java.util.Scanner;

public class B4307 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		
		for(int i=0;i<t;i++) {
			int stick=input.nextInt();
			int antNum=input.nextInt();
			
			
			int min=0,max=0;
			for(int j=0;j<antNum;j++ ) {
				int antWitch=input.nextInt();
				
				int antMin=Math.min(antWitch,stick-antWitch);
				int antMax=Math.max(antWitch, stick-antWitch);
				
				min=Math.max(min, antMin);
				max=Math.max(max, antMax);
			}
			System.out.println(min+" "+max);
			
			
		}
		
		
		

	}

}
