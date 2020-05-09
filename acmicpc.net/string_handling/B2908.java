package string_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = br.readLine().split(" ");

		char[] arr = input[0].toCharArray();
		char[] arr2 = input[1].toCharArray();

		char temp=arr[0];
		arr[0]=arr[2];
		arr[2]=temp;
		
		temp=arr2[0];
		arr2[0]=arr2[2];
		arr2[2]=temp;
		
		
		
		int a=Integer.parseInt(String.valueOf(arr));
		int b=Integer.parseInt(String.valueOf(arr2));
		
		
		
		
		System.out.println(Math.max(a, b));

	}

}
