package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1427 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input=br.readLine();
		char[] arr=input.toCharArray();
		
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1;i>-1;i--) {
			
			System.out.print(arr[i]);
		}
	}

}
