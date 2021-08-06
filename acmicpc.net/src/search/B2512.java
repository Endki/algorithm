package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2512 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		int N=Integer.parseInt(br.readLine());
		
		int sum=0;
		int max=0;
		int[] arr=new int[N];
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		long M=Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
			sum+=arr[i];
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		
		int answer=0;
		
		if(sum<=M) {
			System.out.println(max);
		}else {
			Arrays.sort(arr);
			
			int left=0;
			int right=arr[N-1];
			
			while(left<=right) {
				int midValue=(left+right)/2;
				sum=0;
				
				for(int money:arr) {
					if(money>=midValue) {
						sum+=midValue;
					}else {
						sum+=money;
					}
				}
				
				if(sum>M) {
					right =midValue-1;
				}else {
					left=midValue+1;
					answer= Math.max(answer, midValue);
				}	
			}
			System.out.println(answer);
		}
		
	}

}
