package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2869 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int a=Integer.parseInt(stz.nextToken());
		int b=Integer.parseInt(stz.nextToken());
		int v=Integer.parseInt(stz.nextToken());
		
	
		int solve=(v-b-1)/(a-b)+1;
		
	
		System.out.println(solve);
	}

}
