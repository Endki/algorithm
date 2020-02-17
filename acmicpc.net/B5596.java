import java.util.Scanner;

public class B5596 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = 0, b = 0;

		for (int i = 0; i < 4; i++) {
			a += input.nextInt();
		}
		for (int i = 0; i < 4; i++) {

			b += input.nextInt();

		}

		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}

}
