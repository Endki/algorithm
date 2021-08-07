package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10769 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		String input=br.readLine();
			
		input=input.replace(":-)", "1").replace(":-(", "2");
		
		
		
		int a=0;
		int b=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='1') {
				a++;
			}else if(input.charAt(i)=='2') {
				b++;
			}
		}
		
		
		if(a==b && a==0) {
			System.out.println("none");
		}else if(a>b) {
			System.out.println("happy");
		}else if(a<b) {
			System.out.println("sad");
		}else {
			System.out.println("unsure");
		}
	}

}
