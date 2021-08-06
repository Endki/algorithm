package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2485 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int[] map=new int[N];
		int[] gap=new int[N-1];
		
	
		
		
		for(int i=0;i<N;i++) {
			map[i]=Integer.parseInt(br.readLine());
			if(i>0) {
				gap[i-1]=map[i]-map[i-1];
			}
		}
		
		for(int i=0;i<N-2;i++) {
			gap[i+1]=gcd(gap[i],gap[i+1]);
		}
		
		int resultGap=gap[N-2];
		
		
		System.out.println((map[N-1]-map[0])/resultGap-(N-1));
		
	}
	
	public static int gcd(int a,int b) {
		while(b>0) {
			int temp=a;
			
			a=b;
			b=temp%b;
			
		}
		
		return a;
	}

}
