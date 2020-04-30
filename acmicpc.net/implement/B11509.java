package implement;
import java.util.Scanner;

public class B11509 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		int n=input.nextInt();		
		int count=0;
		int arr[]=new int[1000001];
		int height=0;
		for(int i=0;i<n;i++) {
			height=input.nextInt();
			
			
			if(arr[height+1]==0) {
				count++;
				arr[height]++;
			}else {
				arr[height+1]--;
				arr[height]++;
			}
		}
		
		
		System.out.println(count);

	}
}
