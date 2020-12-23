package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4504 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int m=-1;
		while(true) {
			m=Integer.parseInt(br.readLine());
			if(m==0) {
				break;
			}
			if(m%n==0) {
				System.out.println(m+" is a multiple of "+n+".");
			}else {
				System.out.println(m+" is NOT a multiple of "+n+".");
			}
			
			
			
		}
	}

}
