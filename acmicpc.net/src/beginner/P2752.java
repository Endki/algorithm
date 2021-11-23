package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2752 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int a=Integer.parseInt(stz.nextToken());
		int b=Integer.parseInt(stz.nextToken());
		int c=Integer.parseInt(stz.nextToken());
		
		if(a>b && a>c) {
			if(b>c) {
				System.out.println(c+" "+b+" "+a);
			}else {
				System.out.println(b+" "+c+" "+a);
			}
		}
		
		if(b>a && b>c) {
			if(a>c) {
				System.out.println(c+" "+a+" "+b);
			}else {
				System.out.println(a+" "+c+" "+b);
			}
		}
		
		if(c>a && c>b) {
			if(a>b) {
				System.out.println(b+" "+a+" "+c);
			}else {
				System.out.println(a+" "+b+" "+c);
			}
		}
		

	}
	
}
