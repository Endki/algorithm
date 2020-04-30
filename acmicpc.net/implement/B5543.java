package implement;
import java.util.Scanner;

public class B5543 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int k=0;
		int min=2001;
		for(int i=0;i<3;i++) {
			k=input.nextInt();
			if(k<min) {
				min=k;
			}
		}
		
		int min2=2001;
		
		for(int i=0;i<2;i++) {
			k=input.nextInt();
			if(k<min2) {
				min2=k;
			}
		}

		
		System.out.println(min+min2-50);
	}

}
