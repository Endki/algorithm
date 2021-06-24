package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B13225 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		while(N-->0) {
			int k=Integer.parseInt(br.readLine());
			
			int count=0;
			
			for(int i=1;i<=k;i++) {
				if(k%i==0) {
					count++;
				}
			}
			StringBuilder sb=new StringBuilder();
			
			sb.append(k).append(" ").append(count);
			
			System.out.println(sb.toString());
		}

	}

}
