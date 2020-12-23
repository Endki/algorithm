package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1922 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//플로이드 와샬 가능?
		
		int N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		
		final int INF=1001;
		
		
		int[][] map=new int[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				map[i][j]=INF;
			}
		}
		
		for(int i=0;i<M;i++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			int start=Integer.parseInt(stz.nextToken())-1;
			int end=Integer.parseInt(stz.nextToken())-1;
			int cost=Integer.parseInt(stz.nextToken());
			
			map[start][end]=cost;
			map[end][start]=cost;
			
		}
		
		//거쳐가는 노드
		for(int k=0;k<N;k++) {
			//출발 노드
			for(int i=0;i<N;i++) {
				//도착 노드				
				for(int j=0;j<N;j++) {
					if(map[i][k]+map[k][j]<map[i][j]) {
						map[i][j]=map[i][k]+map[k][j];
					}
				}
			}
		}

		System.out.println(Arrays.deepToString(map));

		
	}

}
