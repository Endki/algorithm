package implement;
import java.util.Scanner;

public class B3034 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int w=input.nextInt();
		int h=input.nextInt();
		
		for(int i=0;i<n;i++) {
			int k=input.nextInt();
			
			if(k<=w || k<=h || k*k<=((w*w)+(h*h))) {
				System.out.println("DA");
			}else {
				System.out.println("NE");
			}
		}

	}

}
