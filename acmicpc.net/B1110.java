import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		int save = k;
		int count = 0;
		if (k < 10) {
			k = (k * 10) + k;
			count++;
		}
		do {

			int temp = k / 10;
			int temp2 = k % 10;
			int save2 = temp + temp2;
			k = (temp2 * 10) + (save2 % 10);

			count++;
		} while (k != save);
		if(save==0) {
			count=1;
		}
		
		System.out.println(count);
	}

}
