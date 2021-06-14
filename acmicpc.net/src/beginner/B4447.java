package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4447 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		while(N-->0) {
			String input=br.readLine();
			
			int good=0;
			int bad=0;
			
			
			for(int i=0;i<input.length();i++) {
				char k=input.charAt(i);
				
				if(k=='g' || k=='G') {
					good++;
				}
				if(k=='b' || k=='B') {
					bad++;
				}
			}
			
			
			if(good==bad) {
				System.out.println(input+" is NEUTRAL");
			}else if(good>bad) {
				System.out.println(input+" is GOOD");
			}else {
				System.out.println(input+" is A BADDY");
			}
			
			
			
		}
	}

}
