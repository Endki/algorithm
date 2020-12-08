import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW2115 {
	static int N,M,C;
	static boolean[][] visited;
	static int[][] map,maxMap;
	static int max;
	static int secondMax;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		for(int TC=1;TC<=T;TC++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			N=Integer.parseInt(stz.nextToken());
			M=Integer.parseInt(stz.nextToken());
			C=Integer.parseInt(stz.nextToken());
			max=Integer.MIN_VALUE;
			secondMax=Integer.MIN_VALUE;
			
			map=new int[N][N];
			maxMap=new int[N][N];
			
			for(int i=0;i<N;i++) {
				stz=new StringTokenizer(br.readLine());
				for(int j=0;j<N;j++) {
					map[i][j]=Integer.parseInt(stz.nextToken());
				}
			}
			System.out.println("#"+TC+" "+getMaxBenefit());
		}
	}
	
	public static int getMaxBenefit() {
		
		makeMaxMap();
		return processCombination();
	}

	private static int processCombination() {
		int max=0,aBenefit=0,bBenefit=0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<=N-M;j++) {
				aBenefit=maxMap[i][j];
				//일꾼B선택
				//같은 행
				bBenefit=0;
				for(int j2=j+M;j2<map.length;j2++) {
					if(bBenefit<maxMap[i][j2]) {
						bBenefit=maxMap[i][j2];
					}
				}
				//다른 행
				for(int i2=i+1;i2<N;i2++) {
					for(int j2=0;j2<=N-M;j2++) {
						if(bBenefit<maxMap[i2][j2]) {
							bBenefit=maxMap[i2][j2];
						}
					}
				}
				
				if(max<aBenefit+bBenefit) {
					max=aBenefit+bBenefit;
				}
			}
		}
		
		return max;
	}

	private static void makeMaxMap() {
		for(int i=0;i<N;i++) {
			for(int j=0;j<=N-M;j++) {
				makeMaxSubset(i, j, 0, 0, 0);
			}
		}
		
	}

	private static void makeMaxSubset(int i,int j,int cnt,int sum,int powSum) {
		if(sum>C) {
			return;
		}
		if(cnt==M) {
			if(maxMap[i][j-M]<powSum) {
				maxMap[i][j-M]=powSum;
			}
			return;
		}
		

		//선택
		makeMaxSubset(i, j+1, cnt+1, sum+map[i][j], powSum+(map[i][j]*map[i][j]));
		
		//비선택
		makeMaxSubset(i, j+1, cnt+1, sum, powSum);
	}
	

}
