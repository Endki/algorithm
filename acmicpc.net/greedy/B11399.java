package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11399 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int[] arr=new int[n];
		StringTokenizer stz=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		
		Arrays.parallelSort(arr);
		int sum=0;
		int grv=0;
		for(int i=0;i<n;i++) {
			if(i>0) {
			grv+=arr[i-1];
			}
			sum+=arr[i];
			sum+=grv;
			
		}
	System.out.println(sum);	
	}

}
