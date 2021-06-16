package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10214 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int Yonsei=0;
			int Korea=0;
			
			for(int i=0;i<9;i++) {
				StringTokenizer stz=new StringTokenizer(br.readLine());
				
				Yonsei+=Integer.parseInt(stz.nextToken());
				Korea+=Integer.parseInt(stz.nextToken());
				
			}
			
			
			
			if(Yonsei>Korea) {
				System.out.println("Yonsei");
			}else if(Yonsei<Korea) {
				System.out.println("Korea");
			}else {
				System.out.println("Draw");
			}
		}
	}

}
