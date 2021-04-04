package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2420 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		long N=Long.parseLong(stz.nextToken());
		long M=Long.parseLong(stz.nextToken());
		
		long result=Math.abs(N-M);

		System.out.println(result);
	}

}
