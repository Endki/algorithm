package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B8958 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		int t=Integer.parseInt(br.readLine());
		char[] arr;
		while(t>0) {
			arr=br.readLine().toCharArray();
			int count=0;
			int sum=0;
			
			for(int i=0;i<arr.length;i++) {
				
				
				if(arr[i]=='O') {
					count++;
					sum+=count;
				}else {
					count=0;
				}
				
			}
			
			
			
			System.out.println(sum);
			t--;
		}
	}

}
