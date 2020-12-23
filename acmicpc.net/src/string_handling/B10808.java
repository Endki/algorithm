package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10808 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr=new int[26];
		
		String k=br.readLine();
		
		for(int i=0;i<k.length();i++) {
			arr[k.charAt(i)-97]++;
		}
	
		for(int i=0;i<26;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
