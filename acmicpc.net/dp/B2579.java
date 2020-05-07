package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2579 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(br.readLine());

		
		int[] arr=new int[a];
		int cache[]= new int[a];
		
		
		
		
		for(int i=0;i<a;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		if(a==0) {
			System.out.println(0);
			return;
		}
		
		if(a==1) {
			System.out.println(arr[0]);
			return ;
		}
		if(a==2) {
			System.out.println(arr[0]+arr[1]);
			return;
		}
		
		cache[0]=arr[0];
		cache[1]=arr[0]+arr[1];
		cache[2]=Math.max(arr[0]+arr[2], arr[1]+arr[2]);
		
		for(int i=3;i<a;i++) {
			cache[i]=Math.max(cache[i-3]+arr[i]+arr[i-1], cache[i-2]+arr[i]);
		}
		System.out.println(cache[a-1]);
	}

}
