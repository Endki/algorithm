package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import sun.swing.BakedArrayList;

public class B10448 {
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
		
		int[] arr=new int[1001];
		boolean visit=false;
		for(int i=1;i<=1000;i++) {
			arr[i]=i*(i+1)/2;
		}
		
		
		while(t>0) {
			int k=Integer.parseInt(br.readLine());
			int sum=0;
			int count=0;
			for(int i=1;i<=k;i++) {
				for(int j=1;j<=k;j++) {
					count++;
					if(sum==k && count==3) {
						visit=true;
					}
				}
			}
			
			
			t--;
		}
	}
	
}
