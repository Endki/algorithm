package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10102 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		String k=br.readLine();
		
		int A=0;
		int B=0;
		
		for(int i=0;i<k.length();i++) {
			if(k.charAt(i)=='A') {
				A++;
			}else {
				B++;
			}
		}

		
		if(A==B) {
			System.out.println("Tie");
		}
		
		if(A<B) {
			System.out.println("B");
		}
		
		if(B<A) {
			System.out.println("A");
		}
	}

}
