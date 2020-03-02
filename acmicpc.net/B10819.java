import java.util.Arrays;
import java.util.Scanner;

public class B10819 {
	static int max=0;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		perm(arr,0,n);
		
		System.out.println(max);
	}

	public static void sum(int[] arr) {
		int sum=0;
		
		for(int i=1;i<arr.length;i++) {
			sum+=Math.abs(arr[i-1]-arr[i]);
			
			if(sum>max) {
				max=sum;
			}
		}
	}
	
	public static void perm(int[] arr, int d, int n) {
		if (d == n) {
			return;
		}
		for (int i = d; i < n; i++) {
			swap(arr, d, i);
			perm(arr, d + 1, n);
			sum(arr);
			swap(arr, d, i);
		}
	}

	public static void swap(int[] arr, int A, int B) {
		int tmp = arr[A];
		arr[A] = arr[B];
		arr[B] = tmp;
	}
}
