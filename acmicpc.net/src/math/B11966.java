package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11966 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long k=Long.parseLong(br.readLine());
		
		long[] arr=new long[31];
		
		for(int i=0;i<31;i++) {
			arr[i]=(long) Math.pow(2, i);
		}
		
		boolean swt=false;
		for(int i=0;i<31;i++) {
			if(k==arr[i]) {
				swt=true;
			}
		}
		
		if(swt) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
