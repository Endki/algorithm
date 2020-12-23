package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2669 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		boolean[][] arr=new boolean[101][101];
		
		for(int i=0;i<4;i++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(stz.nextToken());
			int y1=Integer.parseInt(stz.nextToken());
			int x2=Integer.parseInt(stz.nextToken());
			int y2=Integer.parseInt(stz.nextToken());
			
			for(int j=Math.min(x1, x2);j<Math.max(x1,x2);j++) {
				
				for(int k=Math.min(y1, y2);k<Math.max(y1, y2);k++) {
					arr[j][k]=true;
					
				}	
			}
		}
		int count=0;
		for(int i=0;i<101;i++) {
			for(int j=0;j<101;j++) {
				if(arr[i][j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
