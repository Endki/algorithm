package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B11656 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		String k=br.readLine();
		
		String[] arr=new String[k.length()];
		
		for(int i=0;i<k.length();i++) {
			arr[i]=k.substring(i);
		}
		
		Arrays.parallelSort(arr);
		
		for(int i=0;i<k.length();i++) {
			System.out.println(arr[i]);
		}
	}

}
