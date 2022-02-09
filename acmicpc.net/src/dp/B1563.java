package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1563 {

	static int n;
	static int dp[][][];
	static int DIV = 1_000_000;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		dp = new int[n+1][3][4];
		
		
		//dp map을 -1 로 초기화
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<3; j++) {
				Arrays.fill(dp[i][j], -1);
			}
		}
		
		System.out.println(solve(0, 0, 0));
	}
	
	//출석, 지각횟수, 결석횟수
	static int solve(int len, int late, int absent) {
		
		//-1이 아니면 = 초기상태가 아니면
		if(dp[len][late][absent] != -1) {
			
			//다시 돌림
			return dp[len][late][absent];
		}
		
		//지각이 2회연속, 결석이 3회연속이면
		if(late > 1 || absent == 3) {
			return 0;
		}
	
		if(len > n-1) {
			return 1;
		}
		
		//초기화 
		dp[len][late][absent] = 0;
		
		
		dp[len][late][absent] = solve(len+1, late, 0) //기본 출석 +1
				+ solve(len+1, late, absent+1) // 결석+1
				+ solve(len+1, late+1, 0); // 지각 +1
		
		return dp[len][late][absent] % DIV;
		
	}
}
