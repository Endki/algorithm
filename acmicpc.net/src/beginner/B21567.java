package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B21567 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		long a=Long.parseLong(br.readLine());
		long b=Long.parseLong(br.readLine());
		long c=Long.parseLong(br.readLine());
		
		
		long sum=a*b*c;
		
		
		String k=String.valueOf(sum);
		
		
		int[] arr=new int[10];
		
		for(int i=0;i<k.length();i++) {
			arr[k.charAt(i)-'0']++;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}

		
	}
}
