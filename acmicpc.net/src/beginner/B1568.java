package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1568 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int time=1;
		int totalTime=0;
		while(N>0) {
			totalTime++;
			if(time>N) {
				time=1;
			}
			N-=time++;			
		}
		System.out.println(totalTime);
	}

}
