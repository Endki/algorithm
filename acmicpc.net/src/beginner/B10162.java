package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10162 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int k=Integer.parseInt(br.readLine());
		
		int a=0;
		int b=0;
		int c=0;
		
		if(k>=300) {
			a=k/300;
			k%=300;
		}
		if(k>=60) {
			b=k/60;
			k%=60;
		}
		if(k>=10) {
			c=k/10;
			k%=10;
		}
		if(k>0) {
			System.out.println(-1);
		}else {
			System.out.println(a+" "+b+" "+c);
		}

	}

}
