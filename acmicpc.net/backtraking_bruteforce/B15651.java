package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B15651 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input=br.readLine().split(" ");
		
		int n=Integer.parseInt(input[0]);
		int m=Integer.parseInt(input[1]);
		
		int[] arr=new int[m+1];
		boolean[] visit=new boolean[n+1];
		backTraking(0, n, m, arr, visit,bw);
		
		
		bw.flush();
	}

	public static void backTraking(int count,int N,int M,int[] arr,boolean[] visit,BufferedWriter bw) throws IOException {
		
		if(count==M) {
			for(int i=0;i<M;i++) {
//				System.out.print(arr[i]+" ");
				
				
				bw.append(Integer.toString(arr[i]));
				bw.append(' ');
			}
			bw.newLine();
			
			return;
		}
		
		for(int i=1;i<=N;i++) {
			if(!visit[i]) {
//				visit[i]=true;
				arr[count]=i;
				backTraking(count+1, N, M, arr, visit,bw);
				visit[i]=false;
			}
		}
		
		
	}
}
