package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B23795 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long sum=0;
		while(true) {
			long input=Long.parseLong(br.readLine());
			if(input==-1) {
				break;
			}
			
			sum+=input;
		}
		System.out.println(sum);
	}

}
