package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2217 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		Arrays.parallelSort(arr);
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=0;
			sum+=(n-i)*arr[i];
			
			if(sum>max) {
				max=sum;
			}
		}
		System.out.println(max);
		
	}

}
