package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B16435 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(stz.nextToken());
		int L=Integer.parseInt(stz.nextToken());
		
		int[] arr=new int[N];
		
		
		stz=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		
		Arrays.parallelSort(arr);
		
		for(int i=0;i<N;i++) {
			if(arr[i]<=L) {
				L++;
			}
		}
		
		System.out.println(L);
		

	}

}
