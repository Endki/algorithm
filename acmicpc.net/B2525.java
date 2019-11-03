import java.util.Scanner;

public class B2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		
		int d=b+c;
		
		int k=d/60;
		int j=d%60;
		
		
		
		
		System.out.print(((a+k)%24)+" ");
		System.out.println(j);
		
	}

}
