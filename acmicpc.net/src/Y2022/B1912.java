package Y2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1912 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		int[] arr=new int[n];
		int[] D=new int[n];
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		
		
		int max=0;
		D[0]=max=arr[0];
		
		for(int i=1;i<n;i++) {
			D[i]=Math.max(D[i-1]+arr[i], arr[i]);
			max=Math.max(max, D[i]);
		}
		
		System.out.println(max);
	}

}
