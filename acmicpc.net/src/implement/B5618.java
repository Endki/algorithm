package implement;
import java.util.Scanner;

public class B5618 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		int n=input.nextInt();
		
		int[] arr=new int[n];
		
		if(n==2) {
			arr[0]=input.nextInt();
			arr[1]=input.nextInt();
			
			int min=Math.min(arr[0],arr[1]);
			
			for(int i=1;i<=min;i++) {
				if(arr[0]%i==0 && arr[1]%i==0) {
					System.out.println(i);
				}
			}
			
			
		}
		
		
		if(n==3) {
			arr[0]=input.nextInt();
			arr[1]=input.nextInt();
			arr[2]=input.nextInt();
			
			int min=Math.min(arr[0], Math.min(arr[1], arr[2]));
			
			for(int i=1;i<=min;i++) {
				
				if(arr[0]%i==0 && arr[1]%i==0 && arr[2]%i==0) {
					System.out.println(i);
				}
			}
			
			
		}

		
		
	}

}
