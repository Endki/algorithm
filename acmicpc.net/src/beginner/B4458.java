package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4458 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		while(N-->0) {
			String k=br.readLine();
			
			String first=k.substring(0,1);
			first=first.toUpperCase();
			StringBuilder sb=new StringBuilder();
			sb.append(first).append(k.substring(1));
			
			System.out.println(sb.toString());
			
		}
		

	}

}
