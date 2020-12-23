package implement;
import java.util.Arrays;
import java.util.Scanner;

public class B3052 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt()%42;
		}
		Arrays.parallelSort(arr);
		
		int count=1;
		for(int i=1;i<10;i++) {
			if(arr[i-1]!=arr[i]) {
				
				count++;
			}
		}
		
		System.out.println(count);
		

	}

}
