package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14889 {
	static int min=Integer.MAX_VALUE;
	static boolean[] visit;
	static int[][] arr;
	static int n;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;

		n = Integer.parseInt(br.readLine());

		arr = new int[n + 1][n + 1];
		visit=new boolean[n+1];
		for (int i = 1; i <= n; i++) {
			stz = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				arr[i][j] = Integer.parseInt(stz.nextToken());
			}
		}
		teamSerching(1,0);
		System.out.println(min);
			
	}

	public static void teamSerching(int count,int depth) {
		if (depth == n/2) {
			min=Math.min(min, getStat());
			return;
		}

		for (int i = count; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				teamSerching(i+1,depth+1);
				visit[i] = false;
			}
		}

	}
	static int getStat() {
		int start=0;
		int link=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(visit[i] && visit[j]) {
					start+=arr[i][j];
				}
				
				
				if(!visit[i] && !visit[j]) {
					link+=arr[i][j];
				}
			}
		}
		
		
		
		return Math.abs(start-link);
		
	}
}
