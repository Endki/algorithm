package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B13224 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		String input=br.readLine();
		
		boolean[] arr=new boolean[4];
		
		
		char[] logic=input.toCharArray();
		
		arr[1]=true;
		boolean temp=false;
		for(int i=0;i<logic.length;i++) {
			
			if(logic[i]=='A') {
				temp=arr[1];
				arr[1]=arr[2];
				arr[2]=temp;
				
				
			}else if(logic[i]=='B') {
				temp=arr[2];
				arr[2]=arr[3];
				arr[3]=temp;
				
			}else if(logic[i]=='C') {
				temp=arr[1];
				arr[1]=arr[3];
				arr[3]=temp;
			}
		}
		
		
		for(int i=1;i<4;i++) {
			if(arr[i]) {
				System.out.println(i);
			}
		}
		
		
	}

}
