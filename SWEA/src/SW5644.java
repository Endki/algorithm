import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW5644 {

	static int M,A;
	static int[] personA,personB;
	static int[] dx= {0,-1,0,1,0};
	static int[] dy= {0,0,1,0,-1};
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int TC=Integer.parseInt(br.readLine());
		for(int T=1;T<=TC;T++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			M=Integer.parseInt(stz.nextToken());
			A=Integer.parseInt(stz.nextToken());
			
			
			personA=new int[M];
			personB=new int[M];
			
			stz=new StringTokenizer(br.readLine());
			for(int i=0;i<M;i++) {
				personA[i]=Integer.parseInt(stz.nextToken());
			}
			stz=new StringTokenizer(br.readLine());
			
			for(int i=0;i<M;i++) {
				personB[i]=Integer.parseInt(stz.nextToken());
			}
			
			
			int[][] map=new int[11][11];
			int[][] ap=new int[A][4];
			for(int i=0;i<A;i++) {
				stz=new StringTokenizer(br.readLine());
				ap[i][0]=Integer.parseInt(stz.nextToken());
				ap[i][1]=Integer.parseInt(stz.nextToken());
				ap[i][2]=Integer.parseInt(stz.nextToken());
				ap[i][3]=Integer.parseInt(stz.nextToken());
				
				
			}
			//사용하고 있는지 확인
			boolean flag=false;
			boolean[] apF=new boolean[A];
			int aX=1,aY=1,bX=10,bY=10;
			int ACount=0,BCount=0;
			int index=0;
			for(int i=0;i<M;i++) {
				int raX=aX+dx[personA[i]];
				int raY=aY+dy[personA[i]];
				int rbX=bX+dx[personB[i]];
				int rbY=bY+dy[personB[i]];
				
				
				int max=0;
				for(int j=0;j<A;j++) {
					
					if(!apF[j] && calDist(raX,raY,ap[j][0],ap[j][1])<=ap[j][2]) {
						if(max<ap[j][3]) {
							max=ap[j][3];
							index=j;
						}
					}
				}
				if(max!=0) {
					apF[index]=true;
				}
				
				
			}
			
			
			
			
		}	
	}
	
	public static int calDist(int aX,int aY,int bX,int bY) {
		return Math.abs(aX-bX)+Math.abs(aY-bY);
	}
	static class AP{
		int x;
		int y;
		int c;
		int p;
		public AP(int x, int y, int c, int p) {
			this.x = x;
			this.y = y;
			this.c = c;
			this.p = p;
		}
		
	}

}
