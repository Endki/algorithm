import java.io.IOException;
import java.util.Scanner;

public class B1212 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String[] eight = { "000", "001", "010", "011", "100", "101", "110", "111" };
		String s = scan.nextLine();
		boolean start = true;
		if (s.length() == 1 && s.substring(0, 1).equals("0")) { // 입력받은 수가 0인 경우
			System.out.print(0);
		}
		for (int i = 0; i < s.length(); i++) {
			int n = Integer.parseInt(s.substring(i, i + 1));
			if (start == true && n < 4) { // 첫번째 자리수 && 3자리가 아닌 2진수 일때
				if (n == 0) {
					continue;
				} else if (n == 1) {
					System.out.print("1");
				} else if (n == 2) {
					System.out.print("10");
				} else if (n == 3) {
					System.out.print("11");
				}
				start = false;
			} else {
				System.out.print(eight[n]);
				start = false;
			}
		}
	}

}
