package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2581 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int[] arr=new int[10001];
		
		for(int i=2;i<10001;i++) {
			arr[i]=i;
		}
		for(int i=2;i<10001;i++) {
			for(int j=2;i*j<10001;j++) {
				if(arr[i]!=0) {
					arr[i*j]=0;
				}
			}
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		
		int sum=0;
		for(int i=n;i<m+1;i++) {
			if(arr[i]!=0) {
				sum+=arr[i];
				
			}
		}
		if(sum!=0) {
		System.out.println(sum);
		}else {
			System.out.println("-1");
		}
		
		for(int i=n;i<m+1;i++) {
			if(arr[i]!=0) {
				System.out.println(arr[i]);
				break;
			}
		}
		
		
	}

}
