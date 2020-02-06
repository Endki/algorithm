import java.util.Scanner;

public class B10797 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		int num=input.nextInt();
		int count=0;
		for(int i=0;i<5;i++) {
			int k=input.nextInt();
			if(num==k) {
				count++;
			}
		}
		System.out.println(count);

	}

}
