package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2443 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int a=-1;
		String space="";
		
		for(int i=0;i<n;i++) {
			System.out.print(space);
			for(int j=(2*n)+a;j>0;j--) {
				System.out.print("*");
			}
			a-=2;
			System.out.println();
			space+=" ";
		}
	}

}
