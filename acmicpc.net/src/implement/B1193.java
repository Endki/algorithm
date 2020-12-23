package implement;
import java.util.Scanner;

public class B1193 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int n=0,count=0;
		
		n=input.nextInt();
		
		while(n>0) {
			count++;
			n-=count;
		}
		
		if(count%2==0) {
			System.out.println((count+n)+"/"+(1+(-n)));
		}else {
			System.out.println((1+(-n))+"/"+(count+n));
		}
		
	}

}
