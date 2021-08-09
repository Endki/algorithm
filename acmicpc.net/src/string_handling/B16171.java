package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B16171 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String S=br.readLine();
		String K=br.readLine();
		
		String temp= S.replaceAll("[0-9]", "");
		
		if(temp.contains(K)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
