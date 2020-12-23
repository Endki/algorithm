package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10952 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] k;
		while(true) {
			
			
			k=br.readLine().split(" ");
			int a=Integer.parseInt(k[0]);
			int b=Integer.parseInt(k[1]);
			
			if(a==0 && b==0) {
				break;
			}
			
			System.out.println(a+b);
			
			
			
		}
	}

}
