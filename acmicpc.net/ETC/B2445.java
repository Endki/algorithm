package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2445 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int m=0;
		boolean swt=false;
		
		
		for(int i=0;i<(2*n)-1;i++) {
			
			for(int j=0;j<2*n;j++) {
				
				
				if(j<=m || j>=(2*n)-m-1) {
					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
				
			}
			
			
			if(i>=n-1) {
				m--;
			}else {
				m++;
			}
			System.out.println();
		}
	}

}
