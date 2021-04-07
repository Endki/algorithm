package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2566 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		int[][] map=new int[9][9];
		int max=-1;
		int x=0,y=0;
		for(int i=0;i<9;i++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++) {
				int input=Integer.parseInt(stz.nextToken());
				if(max<input) {
					max=input;
					x=i+1;
					y=j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(x+" "+y);
		
		
		
		

	}

}
