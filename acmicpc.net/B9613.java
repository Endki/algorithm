import java.util.Arrays;
import java.util.Scanner;

public class B9613 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int t=input.nextInt();
		
		for(int i=0;i<t;i++) {
			int z=input.nextInt();
			
			int[] arr=new int[z];
			
			for(int j=0;j<z;j++) {
				arr[j]=input.nextInt();
			}
			
			long sum=0;
			
			for(int j=0;j<z-1;j++) {
				for(int k=j+1;k<z;k++) {
					sum+=gcd(arr[j],arr[k]);
				}
			}
			
			System.out.println(sum);
			
			
			
		}

	}
	public static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
	
}
