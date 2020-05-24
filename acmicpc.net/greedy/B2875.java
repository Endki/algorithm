package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2875 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int women=Integer.parseInt(stz.nextToken());
		int men=Integer.parseInt(stz.nextToken());
		int intern=Integer.parseInt(stz.nextToken());
		
		int max=Math.min(women/2, men);
		intern-=(women+men)-(max*3);
		
		
		int count=0;
		while(intern>0) {
			intern-=3;
			max--;
			
			
			
			
		}
		System.out.println(max);
	}

}
