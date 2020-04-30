package print;
import java.util.Scanner;

public class B11720 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		String k=input.next();
		
		int[] arr=new int[n];
		
		
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(k.substring(i, i+1));
			sum+=arr[i];
		}
		System.out.println(sum);
		
	}
	
	
}
