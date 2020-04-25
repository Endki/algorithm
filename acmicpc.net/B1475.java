import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String k = br.readLine();

		double[] set = new double[9];

		for (int i = 0; i < k.length(); i++) {
			int p = k.charAt(i)-'0';
			switch (p) {
			case 0:
				set[0]++;
				break;
			case 1:
				set[1]++;
				break;
			case 2:
				set[2]++;
				break;
			case 3:
				set[3]++;
				break;
			case 4:
				set[4]++;
				break;
			case 5:
				set[5]++;
				break;
			case 6:
				set[6]++;
				break;
			case 7:
				set[7]++;
				break;
			case 8:
				set[8]++;
				break;
			case 9:
				set[6]++;
				break;
			}
		}
		set[6]=(int) Math.ceil(set[6]/2);
		Arrays.parallelSort(set);
		
		System.out.println((int)set[8]);
	}

}
