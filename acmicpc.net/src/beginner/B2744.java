package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2744 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input=br.readLine();
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<input.length();i++) {
			if(65<= input.charAt(i) && input.charAt(i)<=90) {
				sb.append((char)(input.charAt(i)+32));	
				continue;
			}
			
			if(97<= input.charAt(i) && input.charAt(i)<=122) {
				sb.append((char)(input.charAt(i)-32));
				continue;
			}
		}

		System.out.println(sb.toString());
	}

}
