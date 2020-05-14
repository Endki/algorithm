package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B14888 {
	static int max=Integer.MIN_VALUE;
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		String[] input = br.readLine().split(" ");

		int[] arr = new int[a];
		boolean[] visit=new boolean[a];
		
		int[] oper=new int[4];
		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		input=br.readLine().split(" ");
		for(int i=0;i<4;i++) {
			oper[i]=Integer.parseInt(input[i]);
		}
		
		
		dfs(0, arr, visit, oper, arr[0], 0);
		System.out.println(max);
		System.out.println(min);
		
		
		
	}
	static void dfs(int depth,int[] arr,boolean[] visit,int[] oper,int sum,int count) {
		if(depth==arr.length-1) {
			if(max<sum) {
				max=sum;
			}
			if(min>sum) {
				min=sum;
			}
			return;
		}
		for(int i=0;i<4;i++) {
			if(oper[i]>0) {
				if(i==0) {
					oper[i]--;
					dfs(depth+1, arr, visit, oper,sum+arr[count+1],count+1);
					oper[i]++;
				}
				else if(i==1) {
					oper[i]--;
					dfs(depth+1, arr, visit, oper,sum-arr[count+1],count+1);
					oper[i]++;
				}
				else if(i==2) {
					oper[i]--;
					dfs(depth+1, arr, visit, oper,sum*arr[count+1],count+1);
					oper[i]++;
				}
				else if(i==3) {
					oper[i]--;
					dfs(depth+1, arr, visit, oper,sum/arr[count+1],count+1);
					oper[i]++;
				}	
			}
		}
	}

}
