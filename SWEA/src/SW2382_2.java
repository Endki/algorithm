import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SW2382_2 {
	//상하 12  / 좌우 34 
	static int[] dx= {99,-1,1,0,0};
	static int[] dy= {99,0,0,-1,1};
		
	
	
	public static class virus {
		int x;
		int y;
		int count;
		int direction;
		public virus(int x, int y, int count, int direction) {
			this.x = x;
			this.y = y;
			this.count = count;
			this.direction = direction;
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
			StringTokenizer stz=new StringTokenizer(br.readLine());
			
			int N=Integer.parseInt(stz.nextToken());
			int M=Integer.parseInt(stz.nextToken());
			int K=Integer.parseInt(stz.nextToken());
			
			
			int[][] arr=new int[N+2][N+2];
			//빨간줄 init
			for(int i=0;i<N+2;i++) {
				arr[i][0]=10001;
				arr[0][i]=10001;
				arr[N+1][i]=10001;
				arr[i][N+1]=10001;
			}
			virus[] virusArr=new virus[K];
//			Queue<virus> qu=new LinkedList<virus>();
			for(int i=0;i<K;i++) {
				stz=new StringTokenizer(br.readLine());
				int X=Integer.parseInt(stz.nextToken());
				int Y=Integer.parseInt(stz.nextToken());
				int C=Integer.parseInt(stz.nextToken());
				int D=Integer.parseInt(stz.nextToken());
				
				arr[X][Y]=C;
				
				virusArr[i]=new virus(X, Y, C, D);
//				qu.add(new virus(X, Y, C, D));
			}
			//막힌 부분 합쳐지고 방향 전환하는 부분
			
			while(M-->0) {
				
				for(int i=0;i<K;i++) {
					virus vi=virusArr[i];
					
					
					if(vi.count==0) {
						continue;
					}
					//기본진행
					int x=vi.x;
					int y=vi.y;
					int c=vi.count;
					int d=vi.direction;
					
					//이동 좌표
					int rdx=x+dx[d];
					int rdy=y+dy[d];
					
					virusArr[i]=new virus(rdx, rdy, c, d);
				}
				
				
			
			
			
			
			
			
			
			
			}
		}
	}
	public static void StoOut(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
