package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10818 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int k=Integer.parseInt(br.readLine());
		
		
		int[] arr=new int[k];
		
		String[] input=br.readLine().split(" ");
		for(int i=0;i<k;i++) {
			arr[i]=Integer.parseInt(input[i]);
		}
		Arrays.parallelSort(arr);
		System.out.println(arr[0]+" "+arr[k-1]);

	}

}
