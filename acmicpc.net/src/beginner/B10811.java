package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10811 {
		static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(stz.nextToken());
		int M=Integer.parseInt(stz.nextToken());
		
		arr=new int[N+1];
		
		initArr();
		for(int i=0;i<M;i++) {
			stz=new StringTokenizer(br.readLine());
			int start=Integer.parseInt(stz.nextToken());
			int end=Integer.parseInt(stz.nextToken());
			
			reverse(start,end);
		}

		
		for(int i=1;i<=N;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void initArr() {
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		
	}
	public static void reverse(int start, int end) {
		
		int[] mirror=new int[(end-start)+1];
		
		for(int i=0;i<mirror.length;i++) {
			mirror[i]=arr[start+i];
		}
		
		for(int i=mirror.length-1;i>=0;i--) {
			arr[end-i]=mirror[i];
		}
		
		
	}

}
