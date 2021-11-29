package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4101 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(stz.nextToken());
			int b=Integer.parseInt(stz.nextToken());
			if(a==0 && b==0) {
				break;
			}
			
			
			if(b<a) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}
