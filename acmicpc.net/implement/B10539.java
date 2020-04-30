package implement;
import java.util.Arrays;
import java.util.Scanner;

public class B10539 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int[] arrA=new int[n+1];
		int[] arrB=new int[n+1];
		
		for(int i=1;i<=n;i++) {
			arrB[i]=input.nextInt();
		}
		
		arrA[1]=arrB[1];
		
		System.out.print(arrA[1]);
		
		for(int i=2;i<=n;i++) {
			arrA[i]=arrB[i]*i-arrB[i-1]*(i-1);
			System.out.print(" "+arrA[i]);
		}

	}

}
