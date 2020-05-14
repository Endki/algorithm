package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B14500 {
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };
	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		int[][] arr = new int[n][m];
		boolean[][] visit = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			input = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				dfs(arr, visit, i, j, 0, 0, n, m);
				check(i, j, arr, n, m);
			}
		}
		System.out.println(max);

	}

	static void dfs(int[][] arr, boolean[][] visit, int x, int y, int count, int sum,int n,int m) {
		if (count == 4) {
			max=Math.max(max, sum);
			return;
		}

		for (int i = 0; i < 4; i++) {
			int nX=x+dx[i];
			int nY=y+dy[i];
			
			if(nX<0||nY<0||nX>=n||nY>=m) {
				continue;
			}
			if(!visit[nX][nY]) {
				visit[nX][nY]=true;
				dfs(arr, visit, nX, nY, count+1, sum+arr[nX][nY], n, m);
				visit[nX][nY]=false;
			}
			
			
		}
	}
	static void check(int x,int y,int[][] arr,int n,int m) {
		int wing=4;
		int min=Integer.MAX_VALUE;
		int sum=arr[x][y];
		
		for(int i=0;i<4;i++) {
			int nX=x+dx[i];
			int nY=y+dy[i];
			
			if(wing<=2) {
				return;
			}
			if(nX<0||nY<0||nX>=n||nY>=m) {
				wing--;
				continue;
			}
			min=Math.min(min, arr[nX][nY]);
			sum+=arr[nX][nY];
		}
		if(wing==4) {
			sum-=min;
		}
		max=Math.max(max, sum);
	}
	

}
