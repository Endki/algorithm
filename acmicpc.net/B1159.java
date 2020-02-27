import java.util.Arrays;
import java.util.Scanner;

public class B1159 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		char[] arr=new char[n+1];
		arr[n]='Z';
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=input.next().charAt(0);
		}
		Arrays.parallelSort(arr);
		
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
			
		}
		

	}

}
