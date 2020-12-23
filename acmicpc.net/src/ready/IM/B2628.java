package ready.IM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2628 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(stz.nextToken());
		int M=Integer.parseInt(stz.nextToken());
		
		
		boolean[][] paper=new boolean[N][M];
		int order=Integer.parseInt(br.readLine());
		
		for(int i=0;i<order;i++) {
			stz=new StringTokenizer(br.readLine());
			int type=Integer.parseInt(stz.nextToken());
			int count=Integer.parseInt(stz.nextToken());
			
			
			
			if(type==0) {
				for(int j=0;j<count;j++) {
					for(int k=0;k<M;k++) {
						paper[j][k]=true;
					}
				}
			}else {
				
				
			}
			
			
			
		}
		
		
		
		
	}

}
