package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B15654 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().split(" ");
		
		
		int a=Integer.parseInt(input[0]);
		int b=Integer.parseInt(input[1]);
		boolean[] visit=new boolean[a];
		int[] arr=new int[a];
		int[] mirror=new int[a];
		
		input=br.readLine().split(" ");
		for(int i=0;i<a;i++) {
			arr[i]=Integer.parseInt(input[i]);
		}
		Arrays.parallelSort(arr);
	
		backTraking(0, a, b, arr, visit,mirror);
		
	}

	static void backTraking(int count,int a,int b,int[] arr,boolean[] visit ,int[] arr2) {
		
		if(count==b) {
			for(int i=0;i<b;i++) {
				System.out.print(arr2[i]+" ");
			}
			System.out.println();
		
			return ;
		}	
		
		for(int i=0;i<a;i++) {
			if(!visit[i]) {
				visit[i]=true;
				arr2[count]=arr[i];
				backTraking(count+1, a, b, arr, visit,arr2);
				visit[i]=false;
			}
		}
	}
}
