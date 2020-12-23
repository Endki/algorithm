package implement;
import java.util.Arrays;
import java.util.Scanner;

public class B2822 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		int[] arr=new int[8];
		int[] arr2=new int[8];
		int[] arr3=new int[5];
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
			arr2[i]=arr[i];
		}
		Arrays.sort(arr);
		
		for(int i=0;i<5;i++) {
			arr3[i]=arr[i+3];
			sum+=arr3[i];
		}
		
		
		
		System.out.println(sum);
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<5;j++) {
				if(arr2[i]==arr3[j]) {
					System.out.print(i+1+" ");
					
				}
			}
		}
		
	}

}
