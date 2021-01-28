package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B12865 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(stz.nextToken());
		int K=Integer.parseInt(stz.nextToken());
		int[][] arr=new int[N+1][K+1];
		
		
		int[] weight=new int[N+1];
		int[] value=new int[N+1];
		
		for(int i=1;i<=N;i++) {
			stz=new StringTokenizer(br.readLine());
			weight[i]=Integer.parseInt(stz.nextToken());
			value[i]=Integer.parseInt(stz.nextToken());
			
		}
		
		for(int i=1;i<=N;i++){
			for(int j=1;j<=K;j++) {
				arr[i][j]=arr[i-1][j];  // 이전 물건의 가치를 저장
				
				
				//만약 무게에서 자신의 무게를 뺏는데 남는 무게가 존재하면
				if(j-weight[i]>=0) { 
					//이전 물건에서 구한 가치와 (남은 무게의 가치 + 자신의 가치)중에 큰 값을 저장
					arr[i][j]=Math.max(arr[i-1][j], arr[i-1][j-weight[i]]+value[i]);
				}
			}
		}
		System.out.println(arr[N][K]);
		
	}

}
