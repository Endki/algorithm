package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5032 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int e=Integer.parseInt(stz.nextToken());
		int f=Integer.parseInt(stz.nextToken());
		int c=Integer.parseInt(stz.nextToken());
		
		
		int answer=0;
		
		e+=f;
		
		while(!(e<c)) {
			answer+=e/c;
			
			int temp=0;
			temp=e/c;
			e%=c;
			e+=temp;
		}
		System.out.println(answer);

	}

}
