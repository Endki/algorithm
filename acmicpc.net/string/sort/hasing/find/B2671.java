package string.sort.hasing.find;
import java.util.Scanner;

public class B2671 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		String s = input.next();
		char state = 'A';

		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);

			switch (state) {
			case 'A':
				if (cur == '1') {
					state = 'B';
				} else {
					state = 'G';
				}

				break;

			case 'G':
				if (cur == '1') {
					state = 'A';
				} else {
					System.out.println("NOISE");
					return;
				}

				break;

			case 'B':
				if (cur == '1') {
					System.out.println("NOISE");
					return;
				} else {
					state = 'C';
				}

				break;

			case 'C':
				if (cur == '1') {
					System.out.println("NOISE");
					return;
				} else {
					state = 'D';
				}
				break;

			case 'D':
				if (cur == '1') {
					state = 'E';
				}
				break;

			case 'E':
				if (cur == '1') {
					state = 'F';
				} else {
					state = 'G';
				}
				break;
			case 'F':
				if (cur == '0') {
					state = 'W';
				}
				break;

			case 'W':
				if (cur == '1') {
					state = 'A';
				} else {
					state = 'D';
				}
				break;
			}
		}
		if (state == 'A' || state == 'E' || state == 'F')
			System.out.println("SUBMARINE");
		else
			System.out.println("NOISE");

	}

}
