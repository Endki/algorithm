import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW5656 {
	static int W,N,H;
	static int[][] map;
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int TC=Integer.parseInt(br.readLine());
		
		for(int T=1;T<=TC;T++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			
			N=Integer.parseInt(stz.nextToken());
			W=Integer.parseInt(stz.nextToken());
			H=Integer.parseInt(stz.nextToken());
			
			map=new int[H][W];
			
			
			for(int i=0;i<H;i++) {
				stz=new StringTokenizer(br.readLine());
				for(int j=0;j<W;j++) {
					map[i][j]=Integer.parseInt(stz.nextToken());
				}
			}
			
			
			
			
		}

	}
	public static void dropTball(int N,int depth) {
		int[][] mirror=map.clone();
		if(N==depth) {
			int count=0;
			for(int i=0;i<H;i++) {
				for(int j=0;j<W;j++) {
					if(map[i][j]!=0) {
						count++;
					}
				}
			}
			if(min>count) {
				min=count;
			}
			return;
		}
		
		
		for(int i=0;i<W;i++) {
			int x=0,y=i;
			
			
		}
		
	}
	
	public static void sync() {
		
	}
}
