package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10448 {
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		 
		int t=Integer.parseInt(br.readLine());
		
		int[] arr=new int[1001];
		
		for(int i=1;i<=1000;i++) {
			arr[i]=(i*(i+1))/2;
		}
		
		boolean swt=false;
		while(t-->0) {
			int k=Integer.parseInt(br.readLine());
			swt=false;
			
			for(int i=1;i<46;i++) {
				for(int j=1;j<46;j++) {
					for(int z=1;z<46;z++) {
						if((arr[i]+arr[j]+arr[z]) == k) {
							swt=true;
						}
					}
					
				}
			}
			if(swt) {
				bw.append('1');
				bw.newLine();
			}else {
				bw.append('0');
				bw.newLine();
			}
		}
		bw.flush();
	}
	
}
