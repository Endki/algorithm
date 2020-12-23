package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11047 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(stz.nextToken());
		int k=Integer.parseInt(stz.nextToken());
		
		int[] arr=new int[n];
		
		for(int i=n-1;i>-1;i--) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int count=0;
		for(int i=0;i<n;i++) {
			
			if(k/arr[i]>0) {
				count+=(k/arr[i]);
				k-=arr[i]*(k/arr[i]);
			}
		}
		System.out.println(count);
	}

}
