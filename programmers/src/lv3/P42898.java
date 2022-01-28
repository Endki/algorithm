package lv3;

public class P42898 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   int[] dx=new int[]{-1,0};
	    int[] dy=new int[]{0,-1};
	    public int solution(int m, int n, int[][] puddles) {
	        int answer = 0;
	        int[][] dp=new int[n+1][m+1];
	        
	        for(int i=0;i<puddles.length;i++){
	            dp[puddles[i][1]][puddles[i][0]]=-1;
	        }
	        dp[1][1]=1;        
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=m;j++){
	                if(dp[i][j]==-1){
	                    continue;
	                }
	                
	                for(int z=0;z<2;z++){
	                    int rdx=i+dx[z];
	                    int rdy=j+dy[z];
	                    
	                    if(rdx<1 || rdy<1 || rdx>n || rdy>m || dp[rdx][rdy]==-1){
	                        continue;
	                    }
	                    
	                    dp[i][j]+=dp[rdx][rdy];
	                    dp[i][j]%=1000000007;
	                }
	                
	            }
	        }
	        return dp[n][m]%=1000000007;
	    }
}
