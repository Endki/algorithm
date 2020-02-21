import java.util.Arrays;
import java.util.Scanner;

public class B4153 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] arr=new int[3];
		
		while(true) {
			 arr[0]=input.nextInt();
			 arr[1]=input.nextInt();
			 arr[2]=input.nextInt();
			
			
			Arrays.sort(arr);
			
			
			
			if(arr[0]==0 && arr[1]==0 && arr[2]==0) {
				break;
			}else if(arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2]) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}

	}

}
