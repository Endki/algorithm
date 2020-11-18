package ready.IM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10157 {
	static int[] dx= {1,0,-1,0};
	static int[] dy= {0,1,0,-1};
	static int[][] map;
	static int R,C;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		C=Integer.parseInt(stz.nextToken());
		R=Integer.parseInt(stz.nextToken())+1;
		int limit=Integer.parseInt(br.readLine());
		
		int count=0;
		int flag=-1;
		
		int x=0;
		int y=1;
		int leng=1;
		while(leng>0) {
			flag=(flag+1)%4;
			
			if(flag%2==0) {
				R--;
			}else {
				C--;
			}
			
			
			leng=(flag%2==0)? R:C;
			for(int i=0;i<leng;i++) {
				count++;
				
				x+=dx[flag];
				y+=dy[flag];
				
				if(count==limit) {
					
					System.out.println(y+" "+x);
					return;
				}
			}
			
			
		}
		System.out.println("0");

		
	}
	

}
