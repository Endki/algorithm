import java.util.Scanner;

public class B1065 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int k, s, j;
		int count = 0;

		if (n < 100) {
			System.out.println(n);
		} else {
			count+=99;
			for (int i = 100; i <= n; i++) {
				
				k = i / 100;
				s = (i % 100) / 10;
				j = i % 10;

				if (k - s == s - j) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
