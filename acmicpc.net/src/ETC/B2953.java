package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2953 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] arr=new int[5];
		
		
		int max=Integer.MIN_VALUE;
		int index=0;
		for(int i=0;i<5;i++) {
			String[] input=br.readLine().split(" ");
			for(int j=0;j<4;j++) {
				arr[i]+=Integer.parseInt(input[j]);
			}
			if(max<arr[i]) {
				max=arr[i];
				index=i;
			}
		}
		
		System.out.println(index+1+" "+arr[index]);
		
		
		

	}

}
