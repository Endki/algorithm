import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SW2382 {
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
			
			
			int[][][] arr=new int[N][N][3];
			//빨간줄 init

			
			Queue<virus> qu=new LinkedList<virus>();
			for(int i=0;i<K;i++) {
				stz=new StringTokenizer(br.readLine());
				int X=Integer.parseInt(stz.nextToken());
				int Y=Integer.parseInt(stz.nextToken());
				int C=Integer.parseInt(stz.nextToken());
				int D=Integer.parseInt(stz.nextToken());
				
				qu.add(new virus(X, Y, C, D));
			}
			
			while(M-->0) {
				int size=qu.size();
				for(int i=0;i<size;i++) {
					virus vi=qu.poll();
					
					//기본진행
					int x=vi.x;
					int y=vi.y;
					int c=vi.count;
					int d=vi.direction;
					
					int rdx=x+dx[d];
					int rdy=y+dy[d];
					
					
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
