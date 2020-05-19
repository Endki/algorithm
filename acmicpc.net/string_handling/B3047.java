package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B3047 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().split(" ");
		int[] arr=new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=Integer.parseInt(input[i]);
			}
		
		Arrays.parallelSort(arr);
		int a=arr[0];
		int b=arr[1];
		int c=arr[2];
		
		char[] susoon=br.readLine().toCharArray();
		
		
		for(int i=0;i<3;i++) {
			switch(susoon[i]) {
			case 'A':
				System.out.print(a+" ");
				break;
			case 'B':
				System.out.print(b+" ");
				break;
			case 'C':
				System.out.print(c+" ");
				break;
			}
		}
	}

}
