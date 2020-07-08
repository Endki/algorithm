package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2442 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		String k="";
		
		
		for(int i=1;i<=n;i++) {
			k="";
			for(int j=i;j<n;j++) {
				k+=" ";
			}
			System.out.print(k);
			for(int j=0;j<(2*i)-1;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
			
		}
	}

}
