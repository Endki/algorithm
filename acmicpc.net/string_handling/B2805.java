package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2805 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(stz.nextToken());
		int m=Integer.parseInt(stz.nextToken());
		
		int[] arr=new int[n];
		stz=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		Arrays.parallelSort(arr);
		
		
		
		int max=arr[n-1];
		int min=0;
		
		while(max>=min) {
			int middle=(max+min)/2;
			long sum=0;
			for(int i=0;i<n;i++) {
				int modT=arr[i]-middle;
				
				if(modT<0) {
					modT=0;
				}
				sum+=modT;
			}
			
			if(sum>=m) {
				min=middle+1;
			}else if(sum<m) {
				max=middle-1;
			}
			
		}
		System.out.println(max);
	}

}
