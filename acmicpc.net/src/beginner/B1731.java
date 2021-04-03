package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1731 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		long[] arr=new long[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Long.parseLong(br.readLine());
		}
		
		
		if(arr[1]-arr[0]==arr[2]-arr[1]) {
			System.out.println(arr[N-1] + arr[1]-arr[0]);
		}else {
			System.out.println(arr[N-1] * arr[1]/arr[0]);
		}
	}

}
