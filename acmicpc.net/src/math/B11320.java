package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11320 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		while(N-->0) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			
			int A=Integer.parseInt(stz.nextToken());
			int B=Integer.parseInt(stz.nextToken());
			
			int gap = A-B;
			
			if(gap % B==0) {
				int temp= gap/B;
				
				System.out.println((int)Math.pow(temp+1, 2));
			}else {
				int temp=gap/B+1;
				System.out.println((int)Math.pow(temp+1, 2));
			}
		}

	}

}
