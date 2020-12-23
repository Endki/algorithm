package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9546 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int k=Integer.parseInt(br.readLine());
		
		while(k>0) {
			int n=Integer.parseInt(br.readLine());
			double sum=1;
			for(int i=1;i<n;i++) {
				sum+=0.5;
				sum*=2;
				
			}
			
			System.out.println((int)sum);
			
			
			
			k--;
		}
	}

}
