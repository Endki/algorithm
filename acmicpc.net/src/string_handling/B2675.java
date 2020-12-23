package string_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2675 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t=Integer.parseInt(br.readLine());
		
		StringTokenizer stz;
		char[] arr;
		
		while(t>0) {
			stz=new StringTokenizer(br.readLine());
			int r=Integer.parseInt(stz.nextToken());
			arr=stz.nextToken().toCharArray();
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<r;j++) {
					bw.append(arr[i]);
				}
			}
			
			
			bw.newLine();
			t--;
		}
		bw.flush();

	}

}
