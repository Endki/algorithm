package implement;
import java.util.Scanner;

public class B5597 {

	public static void main(String[] args) {
		int arr[]=new int[31];
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<28;i++) {
			int k=input.nextInt();
			arr[k]=1;
		}
		
		
		for(int i=1;i<31;i++) {
			if(arr[i]!=1) {
				System.out.println(i);
			}
		}

	}

}
