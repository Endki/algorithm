package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10610 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String n=br.readLine();
		int[] arr=new int[10];
		int sum=0;
		
		for(int i=0;i<n.length();i++) {
			int m=Integer.parseInt(n.substring(i, i+1));
			arr[m]++;
			sum+=m;
		}
		
		if(!n.contains("0")|| sum%3!=0) {
			System.out.println("-1");
			return;
		}
		
		for(int i=9;i>-1;i--) {
			while(arr[i]>0) {
				bw.write(i+"");
				arr[i]--;
			}
		}
		
		
		bw.flush();
	}

}
