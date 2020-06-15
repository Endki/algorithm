package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1436 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int num=0;
		while(n>0) {
			num++;
			String str=Integer.toString(num);
			
			if(str.contains("666")){
				n--;
			}
				
		}
		System.out.println(num);
	}

}
