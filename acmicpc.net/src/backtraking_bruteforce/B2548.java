package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2548 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int[] arr=new int[N];
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		
		int[] rep=new int[N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i==j) {
					continue;
				}
				rep[i]+=Math.abs(arr[i]-arr[j]);
			}
		}
		
		int min=rep[0];
		
		for(int i=0;i<N;i++) {
			if(min>=rep[i]) {
				min=rep[i];
			}
		}
		int answer=20000;
		
		for(int i=0;i<N;i++) {
			if(rep[i]==min) {
				answer=Math.min(answer, arr[i]);
			}
		}
		System.out.println(answer);
	}

}
