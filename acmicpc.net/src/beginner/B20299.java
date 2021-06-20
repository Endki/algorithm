package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B20299 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(stz.nextToken());
		int K=Integer.parseInt(stz.nextToken());
		int L=Integer.parseInt(stz.nextToken());
		
		StringBuilder sb=new StringBuilder();
		int count=0;
		for(int i=0;i<N;i++) {
			stz=new StringTokenizer(br.readLine());
			int sum=0;
			
			int num1=Integer.parseInt(stz.nextToken());
			int num2=Integer.parseInt(stz.nextToken());
			int num3=Integer.parseInt(stz.nextToken());
			
			sum+=num1+num2+num3;
			
			if(num1>=L && num2>=L  && num3>=L && sum>=K) {
				
				count++;
				sb.append(num1+ " "+ num2+" "+num3+" ");
			}
		}
		
		
		System.out.println(count);
		System.out.println(sb.toString());
	}
	


}
