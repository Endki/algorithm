package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2605 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int[] arr=new int[N];
		StringTokenizer stz=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=i+1;
			int count=Integer.parseInt(stz.nextToken());
			
			for(int j=i;j>i-count;j--) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
			
			
		}
		
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
