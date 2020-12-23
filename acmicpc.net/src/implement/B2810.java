package implement;
import java.util.Scanner;

public class B2810 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n =input.nextInt();
		
		String k=input.next();
		int count=1;
		for(int i=0;i<k.length();i++) {
			if(k.charAt(i)=='S') {
				count+=1;
			}else {
				count+=1;
				i+=1;
			}
		}
		
		if(count>n) {
			System.out.println(n);
		}else {
			System.out.println(count);
		}
		
	}
}
