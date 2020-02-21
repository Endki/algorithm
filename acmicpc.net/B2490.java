import java.util.Scanner;

public class B2490 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] arr = new int[4];

		for (int i = 0; i < 3; i++) {
			int count = 0;
			for (int j = 0; j < 4; j++) {
				arr[j] = input.nextInt();

				if (arr[j] == 1) {
					count++;
				}

			}

			switch (count) {
			case 0:
				System.out.println("D");
				break;
			case 1:
				System.out.println("C");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("A");
				break;
			case 4:
				System.out.println("E");
				break;
			}
		}

	}

}
