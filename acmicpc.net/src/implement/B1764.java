package implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B1764 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String[] input=br.readLine().split(" ");
		
		int n=Integer.parseInt(input[0]);
		int m=Integer.parseInt(input[1]);
		
		String[] arr=new String[n];
		ArrayList<String> output=new ArrayList<String>();
		
		for(int i=0;i<n;i++) {
			arr[i]=br.readLine();
		}
		Arrays.parallelSort(arr);
		int count=0;
		for(int i=0;i<m;i++) {
			String k=br.readLine();
			int pivot=Arrays.binarySearch(arr, k);
			if(pivot>=0) {
				count++;
				output.add(k);
			}
		}
		Collections.sort(output);
		
		System.out.println(count);
		for(String k:output) {
			System.out.println(k);
		}
		
	}

}
