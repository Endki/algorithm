package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1264 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		while (true) {
			String k = br.readLine();
			
			if(k.equals("#")) {
				break;
			}
			int count = 0;

			k = k.toLowerCase();
			for (int i = 0; i < k.length(); i++) {
				char m = k.charAt(i);

				if (m == 'a' || m == 'e' || m == 'i' || m == 'o' || m == 'u') {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
