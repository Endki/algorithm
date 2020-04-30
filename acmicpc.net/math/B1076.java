package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1076 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] reg = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };

		String sum="";
		int two = 2;

		while (two > 0) {
			String input=br.readLine();
			for (int i = 0; i < 10; i++) {
				if (reg[i].equals(input)) {
					sum += i;
				}
			}
		two--;
		}
		
		String input=br.readLine();
		for(int i=0;i<10;i++) {
			if(reg[i].equals(input)) {
				for(int j=0;j<i;j++) {
					sum+="0";
				}
			}
		}
		long answer=Long.parseLong(sum);
		System.out.println(answer);
	}

}
