import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1986 {
	static int N,M;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(stz.nextToken());
		M=Integer.parseInt(stz.nextToken());
		
		
		int[][] map=new int[N+1][M+1];
		
		// 1 = Q , 2 = K , 3 = P
		for(int i=1;i<=3;i++) {
			stz=new StringTokenizer(br.readLine());
			int KQP=Integer.parseInt(stz.nextToken());
			
			for(int j=0;j<KQP;j++) {
				int x=Integer.parseInt(stz.nextToken());
				int y=Integer.parseInt(stz.nextToken());
				
				map[x][y]=i;
			}
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				if(map[i][j]==1) {
					checkQueen(map, i, j);
				}
				if(map[i][j]==2) {
					checkKnight(map, i, j);
				}
			}
		}
		
		int count=0;
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				if(map[i][j]==0) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
	
	public static int[][] checkQueen(int[][] map,int x,int y){
		int rdx=x;
		int rdy=y;	
		//가로
		rdx=x;
		rdy=y;		
		//왼쪽
		while(true) {
			rdy-=1;
			if(rdy<0 ||(map[rdx][rdy]==1) || (map[rdx][rdy]==2)|| (map[rdx][rdy]==3)) {
				break;
			}
			map[x][rdy]=4;
		}
		
		//오른쪽
		rdx=x;
		rdy=y;	
		while(true) {
			rdy+=1;
			if(rdy>=M+1 ||(map[rdx][rdy]==1) || (map[rdx][rdy]==2)|| (map[rdx][rdy]==3)) {
				break;
			}
			map[x][rdy]=4;
		}
		//세로
		//위
		rdx=x;
		rdy=y;	
		while(true) {
			rdx-=1;
			if(rdx<0 ||(map[rdx][rdy]==1) || (map[rdx][rdy]==2)|| (map[rdx][rdy]==3)) {
				break;
			}
			map[rdx][y]=4;
		}
		//아래
		rdx=x;
		rdy=y;	
		while(true) {
			rdx+=1;
			if(rdx>=N+1 ||(map[rdx][rdy]==1) || (map[rdx][rdy]==2)|| (map[rdx][rdy]==3)) {
				break;
			}
			map[rdx][y]=4;
		}
		
		
		//대각
		rdx=x;
		rdy=y;		
		//왼대각
		//4사분면
		while(true) {
			rdx-=1;
			rdy-=1;
			if(rdx<0 || rdy<0 ||(map[rdx][rdy]==1) || (map[rdx][rdy]==2)|| (map[rdx][rdy]==3)) {
				break;
			}
			
			map[rdx][rdy]=4;
		}
		
		rdx=x;
		rdy=y;
		//2사분면
		while(true) {
			rdx+=1;
			rdy+=1;
			if(rdx>=N+1 || rdy>=M+1 ||(map[rdx][rdy]==1) || (map[rdx][rdy]==2)|| (map[rdx][rdy]==3)) {
				break;
			}
			
			map[rdx][rdy]=4;
		}
		
		
		//우대각
		//1사분면
		rdx=x;
		rdy=y;
		while(true) {
			rdx-=1;
			rdy+=1;
			if(rdx<0 || rdy>=M+1 ||(map[rdx][rdy]==1) || (map[rdx][rdy]==2)|| (map[rdx][rdy]==3)) {
				break;
			}
			
			map[rdx][rdy]=4;
		}
		
		
		//3사분면
		rdx=x;
		rdy=y;
		while(true) {
			rdx+=1;
			rdy-=1;
			if(rdx>=N+1 || rdy<0 ||(map[rdx][rdy]==1) || (map[rdx][rdy]==2)|| (map[rdx][rdy]==3)) {
				break;
			}
			
			map[rdx][rdy]=4;
		}
		
		
		
		return map;
	}
	public static int[][] checkKnight(int[][] map,int x,int y){
		int[] dx={2,2,1,1,-1,-1,-2,-2};
		int[] dy= {-1,1,-2,2,-2,2,-1,1};
		
		for(int i=0;i<8;i++) {
			int rdx=x+dx[i];
			int rdy=y+dy[i];
			if(rdx<1 || rdy<1 || rdx>=N+1 || rdy>=M+1 || map[rdx][rdy]!=0) {
				continue;
			}
			
			map[rdx][rdy]=4;
		}
		return map;
	}

}
