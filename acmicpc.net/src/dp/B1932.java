package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1932 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine());
		int[][] triangle = new int[N][N];;
		
		for(int i=0;i<N;i++) {
			
			StringTokenizer stz=new StringTokenizer(br.readLine());
			
			for(int j=0;j<=i;j++) {
				triangle[i][j]=Integer.parseInt(stz.nextToken());
			}
		}
		
		System.out.println(solution(triangle));
	}
    static int[] dx=new int[]{1,1};
    static int[] dy=new int[]{1,0};
    public static int solution(int[][] triangle) {

        for(int i=triangle.length-2;i>-1;i--){
            for(int j=0;j<i+1;j++){

                
                int rdx=i+dx[0];
                int rdy=j+dy[0];
                    
                int rdx2=i+dx[1];
                int rdy2=j+dy[1];
                    
                triangle[i][j]+=Math.max(triangle[rdx][rdy],triangle[rdx2][rdy2]);
            }
        }
        
        return triangle[0][0];
    }
}
