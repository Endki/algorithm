package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11004 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		
		
		int n=Integer.parseInt(stz.nextToken());
		int k=Integer.parseInt(stz.nextToken());
		String[] arr=new String[n];
		stz=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=stz.nextToken();
			
		}
		
		Arrays.parallelSort(arr);
		
		System.out.println(arr[k-1]);
		
		
	}

}
