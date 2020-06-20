package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10953 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
		StringTokenizer stz;
		while(t-->0) {
			stz=new StringTokenizer(br.readLine(),",");
			int a=Integer.parseInt(stz.nextToken());
			int b=Integer.parseInt(stz.nextToken());
			System.out.println(a+b);
		}
	}

}
