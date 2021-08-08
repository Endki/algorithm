package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14582 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int[] zeminis=new int[9];
		int[] gullivers=new int[9];
		
		boolean wining=false;
		boolean reverse=false;
		
		
		for(int i=0;i<9;i++) {
			zeminis[i]=Integer.parseInt(stz.nextToken());
		}
		
		stz=new StringTokenizer(br.readLine());
		
		for(int i=0;i<9;i++) {
			gullivers[i]=Integer.parseInt(stz.nextToken());
		}
		
		int zeSum=0;
		int guSum=0;
		
		for(int i=0;i<9;i++) {
			zeSum+=zeminis[i];
			
			if(zeSum>guSum) {
				wining=true;
			}
			
			if(wining) {
				if(zeSum<guSum) {
					reverse=true;
				}
			}
			guSum+=gullivers[i];
			
			
		}
		
		if(zeSum>guSum) {
			wining=true;
		}
		
		if(wining) {
			if(zeSum<guSum) {
				reverse=true;
			}
		}
		
		if(reverse) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
