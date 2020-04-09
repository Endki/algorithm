

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1547 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		int t=Integer.parseInt(br.readLine());
		
		
		String[] input;
		boolean[] arr=new boolean[4];
		Arrays.fill(arr, false);
		
		arr[1]=true;
		
		while(t>0) {
			input=br.readLine().split(" ");
			int a=Integer.parseInt(input[0]);
			int b=Integer.parseInt(input[1]);
			if(arr[a]==true) {
				arr[b]=true;
				arr[a]=false;
			}else if(arr[b]==true) {
				arr[a]=true;
				arr[b]=false;
			}
			
			
			t--;
		}
		
		for(int i=1;i<4;i++) {
			if(arr[i]==true) {
				System.out.println(i);
			}
		}
	}

}
