package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2857 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=5;i++) {
			String k=br.readLine().toString();
			
			if(k.contains("FBI")) {
				sb.append(i).append(" ");
			}
		}
		
		if(sb.toString().length()>0) {
			System.out.println(sb.toString());
		}else {
			System.out.println("HE GOT AWAY!");
		}

	}

}
