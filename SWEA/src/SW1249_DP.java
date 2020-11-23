import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SW1249_DP {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		
		
		//BFS 문제
		//DP로 풀수있을꺼같은데?
		
		int T=Integer.parseInt(br.readLine());
		
		for(int TC=1;TC<=T;TC++) {
			int N=Integer.parseInt(br.readLine());
			
			//계산해야하기 때문에 무조건 int배열로 해야함 char해면 머리 과부화걸림 
			int[][] map=new int[N+2][N+2];
			
			for(int i=1;i<=N;i++) {
				String k=br.readLine();
				for(int j=1;j<=N;j++) {
					map[i][j]=k.charAt(j-1)-'0';
				}
			}

			//테두리는 INF로 한다.
			
			for(int i=0;i<=N+1;i++) {
				map[0][i]=Integer.MAX_VALUE;
				map[i][0]=Integer.MAX_VALUE;
				map[N+1][i]=Integer.MAX_VALUE;
				map[i][N+1]=Integer.MAX_VALUE;
			}
			
			
			System.out.println(Arrays.deepToString(map));
			
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					//시작점은 할 필요없다.
					if(i==1 && j==1) {
						continue;
					}

					
					map[i][j]+=Math.min(Math.min(map[i-1][j], map[i][j-1]), Math.min(map[i+1][j], map[i][j+1]));
				}
			}

			StringBuilder sb=new StringBuilder();
			
			sb.append("#").append(TC).append(" ").append(map[N][N]);
			
			System.out.println(sb.toString());
			
		}
		
	}

}
