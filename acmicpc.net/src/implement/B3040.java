package implement;
import java.util.Scanner;

public class B3040 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] arr= new int[9];
		
		int sum=0;
		int tmp=0;
		for(int i=0;i<9;i++) {
			arr[i]=input.nextInt();
			sum+=arr[i];
		}
		
		int num=0,num2=0;
		
		for(int i=0;i<8;i++) {
			for(int j=1;j<9;j++) {
				if(sum-arr[i]-arr[j]==100 && i!=j) {
					num=i;
					num2=j;
					
				}
			}
		}

		for(int i=0;i<9;i++) {
			if(i==num || i==num2) {
				continue;
			}else {
				System.out.println(arr[i]);
			}
		}
	}

}
