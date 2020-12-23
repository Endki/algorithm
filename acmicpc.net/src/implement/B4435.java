package implement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4435 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		int[] gandalf = new int[6];
		int[] sauron = new int[7];
		String[] k;
		int count = 1;
		int sum = 0;
		while (t > 0) {
			sum=0;
			k = br.readLine().split(" ");
			for (int i = 0; i < 6; i++) {
				gandalf[i] = Integer.parseInt(k[i]);

				switch (i) {
				case 0:
					sum += gandalf[i];
					break;
				case 1:
					sum += (gandalf[i] * 2);
					break;
				case 4:
					sum += (gandalf[i] * 4);
					break;
				case 5:
					sum += (gandalf[i] * 10);
					break;
				default:
					sum += (gandalf[i] * 3);
					break;
				}

			}
			k = br.readLine().split(" ");
			for (int i = 0; i < 7; i++) {
				sauron[i] = Integer.parseInt(k[i]);
				switch (i) {
				case 0:
					sum -= sauron[i];
					break;
				case 4:
					sum -= (sauron[i] * 3);
					break;
				case 5:
					sum -= (sauron[i] * 5);
					break;
				case 6:
					sum -= (sauron[i] * 10);
					break;
				default:
					sum -= (sauron[i] * 2);
					break;
				}

			}
			System.out.print("Battle " + count + ": ");
			count++;
			if (sum == 0) {
				System.out.println("No victor on this battle field");
			} else if (sum > 0) {
				System.out.println("Good triumphs over Evil");
			} else {
				System.out.println("Evil eradicates all trace of Good");
			}

			t--;
		}
	}

}
