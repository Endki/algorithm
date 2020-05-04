package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1712 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		long[] arr=new long[3];
		for(int i=0;i<3;i++) {
			arr[i]=Long.parseLong(input[i]);
		}
		
		long count=arr[2]-arr[1];
		
		if(count<=0) {
			System.out.println(-1);
		}else {
		
		
		System.out.println((arr[0]/count)+1);
		}
		
		
	}

}
