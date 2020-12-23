package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1546 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		StringTokenizer stz=new StringTokenizer(br.readLine());
		double[] arr=new double[n];
		
		
		for(int i=0;i<n;i++) {
			arr[i]=Double.parseDouble(stz.nextToken());
		}
		
		Arrays.parallelSort(arr);
		double max=arr[n-1];
		double sum=0;
		
		for(int i=0;i<n;i++) {
			sum+=(arr[i]/max)*100;
		}
		
		System.out.println(sum/n);
	}

}
