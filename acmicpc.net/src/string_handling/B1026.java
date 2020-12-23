package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1026 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		int[] a=new int[n];
		int[] b=new int[n];
		
		
		String[] k=br.readLine().split(" ");
		
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(k[i]);
		}
		k=br.readLine().split(" ");
		for(int i=0;i<n;i++) {
			b[i]=Integer.parseInt(k[i]);
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i]*b[(n-1)-i];
		}
		System.out.println(sum);
		
	}

}
