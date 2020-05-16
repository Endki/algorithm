package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11586 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		char[][] arr=new char[n][n];
		
		
		for(int i=0;i<n;i++) {
			arr[i]=br.readLine().toCharArray();
		}
		int sim=Integer.parseInt(br.readLine());
		if(sim==1) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			
			
		}else if(sim==2) {
			for(int i=0;i<n;i++) {
				for(int j=n-1;j>-1;j--) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}else {
			for(int i=n-1;i>-1;i--) {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}
		
		
		
		
	}

}
