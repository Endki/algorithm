package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10833 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int sum=0;
		
		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			
			int a=Integer.parseInt(stz.nextToken());
			int b=Integer.parseInt(stz.nextToken());
			
			sum+=b%a;
			
		}
		System.out.println(sum);
	}

}
