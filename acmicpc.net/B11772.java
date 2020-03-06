import java.util.Scanner;

public class B11772 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		long n=input.nextLong();
		
		long sum=0;
		long temp=0;
		for(long i=0;i<n;i++) {
			long a=input.nextInt();
			temp=a/10;
			long b=a%10;
			

			sum+=Math.pow(temp, b);
			
		}
		
		System.out.println(sum);

	}

}
