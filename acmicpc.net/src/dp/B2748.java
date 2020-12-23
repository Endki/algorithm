package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2748 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		long[] arr=new long[n+1];
		arr[0]=0;
		arr[1]=1;
		
		
		for(int i=0;i<=n;i++) {
			if(i==0) {
				arr[i]=0;
			}else if(i==1) {
				arr[i]=1;
			}else {
				arr[i]=arr[i-1]+arr[i-2];
			}
		}
		
		System.out.println(arr[n]);
		
	}

}
