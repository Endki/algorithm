package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B17069 {
	static int N;
	static int[][] map;
	// 대각선 체크 배열
	static int count;
	static long[][][] dp;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		map = new int[N+1][N+1];
		count = 0;
		dp=new long[N+1][N+1][3];

		for (int i = 0; i < N; i++) {
			StringTokenizer stz = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(stz.nextToken());
			}
		}
		
		
		dp[0][1][0]=1;
		
		for(int i=0;i<N;i++) {
			for(int j=1;j<N;j++) {
				
				if(map[i][j+1]==0) {
					dp[i][j+1][0]+=dp[i][j][0]+dp[i][j][2];
				}
				
				if(map[i+1][j]==0) {
					dp[i+1][j][1]+=dp[i][j][1]+dp[i][j][2];
				}
				
				if(map[i+1][j+1]==0 && map[i+1][j]==0 && map[i][j+1]==0) {
					dp[i+1][j+1][2]+=dp[i][j][1]+dp[i][j][2]+dp[i][j][0];
				}
			}
		}
		
		long answer=dp[N-1][N-1][0]+dp[N-1][N-1][1]+dp[N-1][N-1][2];
		System.out.println(answer);
	}

}
