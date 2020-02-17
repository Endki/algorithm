import java.util.Arrays;
import java.util.Scanner;

public class B2960 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int n=input.nextInt();
		int k=input.nextInt();
		
		int count=0;
		
		int[] arr=new int[n+2];
		
		for(int i=2;i<n+1;i++) {
			arr[i]=i;	
		
		}
		
		for(int i=2;i<n+1;i++) {
			for(int j=1;i*j<=n;j++) {
			
			
			if(arr[i*j]==9999) {
				continue;
			}else {
				arr[i*j]=9999;

				count++;
			}
			if(count==k) {
				System.out.println(i*j);
			}
			
			}
		
		}
		
	}

}
