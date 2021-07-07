package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5613 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String k=br.readLine();
		
		int sum=Integer.parseInt(k);
		while(true) {
			
			int a=0;
			k=br.readLine();
			
			if(k.equals("=")) {
				break;
			}
			
			a=Integer.parseInt(br.readLine());
			if(k.equals("+")) {
				
				sum+=a;
				
			}else if(k.equals("-")) {
				
				sum-=a;
				
			}else if(k.equals("*")) {
				
				sum*=a;
				
			}else if(k.equals("/")) {
				
				sum/=a;
			
			}
			
			
			
		}
		
		System.out.println(sum);

	}

}
