package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10817 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().split(" ");
		
		int[] arr=new int[3];
		
		for(int i=0;i<3;i++) {
			arr[i]=Integer.parseInt(input[i]);
		}
		
		Arrays.parallelSort(arr);
		System.out.println(arr[1]);

	}

}
