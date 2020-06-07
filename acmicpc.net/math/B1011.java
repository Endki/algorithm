package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1011 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long t=Long.parseLong(br.readLine());
		
		StringTokenizer stz;
		while(t-->0) {
			stz=new StringTokenizer(br.readLine());
			long x=Long.parseLong(stz.nextToken());
			long y=Long.parseLong(stz.nextToken());
			
			long length=y-x;
			long solve=1;
			long distance=0;
			
			while(length>distance) {
				solve++;
				distance+=solve/2;
			}
			
			System.out.println(solve-1);
			
			
		}
	}

}
