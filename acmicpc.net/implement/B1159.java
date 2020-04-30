package implement;
import java.util.Arrays;
import java.util.Scanner;

public class B1159 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		char[] arr = new char[n];
		char[] arr2 = new char[26];
		int[] arr3 = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.next().charAt(0);
		}

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (char) (97 + i);
		}

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr2[i] == arr[j]) {
					arr3[i] += 1;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] >= 5) {
				count += 1;
				System.out.print(arr2[i]);
			}
		}
		if (count == 0) {
			System.out.println("PREDAJA");

		}
	}
}
