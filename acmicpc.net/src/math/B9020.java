package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B9020 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
		
		int[] arr=new int[10001];
		
		for(int i=0;i<10001;i++) {
			arr[i]=i;
		}
		for(int i=2;i<10001;i++) {
			for(int j=2;j*i<10001;j++) {
				arr[i*j]=0;
			}
		}
		
		

		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			
			int a=0;
			int b=0;
			int count=0;
			for(int i=(n/2);i<=n;i++) {
				count++;
				if(arr[i]!=0) {
					
					b=arr[i];
					a=arr[(n/2)-count+1];
				}
				if(n==a+b) {
					break;
				}
				
			}
			
			
			
			
			System.out.println(a+" "+b);
		}
	}

}
