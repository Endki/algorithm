import java.util.Arrays;
import java.util.Scanner;

public class B10819 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		int sum = 0;
		int tmp = 0;
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			sum=0;
			for (int j = 1; j < arr.length; j++) {
				sum += arr[j - 1] + arr[j];
			}
			
			if (sum > max) {
				max = sum;
			}
			
			
			tmp = arr[0];
			if (i == n-1) {
				arr[i] = tmp;
				continue;
			}
			arr[i] = arr[i + 1];
			
		}
		System.out.println(max);
	}

}
