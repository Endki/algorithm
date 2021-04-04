package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2386 {

	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] input=br.readLine().split(" ");
			int count=0;
			
			
			if(input.length==1) {
				return;
			}
			for(int i=1;i<input.length;i++) {
				input[i]=input[i].toLowerCase();
				for(int j=0;j<input[i].length();j++){
					if(input[i].charAt(j)==input[0].charAt(0)) {
						count++;
					}
				}
			}
			
			
			System.out.println(input[0]+" "+count);
		}
		
		
		
		
	}

}
