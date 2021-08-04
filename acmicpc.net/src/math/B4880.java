package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4880 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(stz.nextToken());
		int b=Integer.parseInt(stz.nextToken());
		int c=Integer.parseInt(stz.nextToken());
		
		
		while(!(a==0 && b==0 && c==0)) {
			if(b-a == c-b) {
				System.out.println("AP "+(c+(b-a)));
			}
			
			else if(b%a==c%b) {
				System.out.println("GP "+(c*(b/a)));
			}
			
			
			
			
			
			
			
			stz=new StringTokenizer(br.readLine());
			a=Integer.parseInt(stz.nextToken());
			b=Integer.parseInt(stz.nextToken());
			c=Integer.parseInt(stz.nextToken());
		}

	}

}
