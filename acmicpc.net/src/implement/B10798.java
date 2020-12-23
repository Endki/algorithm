package implement;
import java.util.Scanner;

public class B10798 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char[][] sero = new char[16][16];
		String garo;

		for (int i = 0; i < 5; i++) {
			garo = input.next();
			for (int j = 0; j < garo.length(); j++) {
				sero[i][j] = garo.charAt(j);
			}
		}

		// 출력 부분

		for (int i = 0; i < sero.length; i++) {

			for (int j = 0; j < sero.length - 1; j++) {
				if (sero[j][i] != 0) {
					System.out.print(sero[j][i]);
				}
			}

		}
	}

}
