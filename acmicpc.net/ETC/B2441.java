package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2441 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		String s="";
		
		for(int i=0;i<n;i++) {
			System.out.print(s);
			s+=" ";
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
