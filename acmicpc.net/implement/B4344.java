package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4344 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;
		int c=Integer.parseInt(br.readLine());
		double sum=0;
		double[] arr;
		
		while(c-->0) {
			sum=0;
			stz=new StringTokenizer(br.readLine());
			
			int n=Integer.parseInt(stz.nextToken());
			arr=new double[n];
			
			
			for(int i=0;i<n;i++) {
				arr[i]=Double.parseDouble(stz.nextToken());
				sum+=arr[i];
			}
			sum=sum/n;
			double count=0;
			for(int i=0;i<n;i++) {
				if(arr[i]>sum) {
					count++;
				}
			}
			
			double N=(count/n)*100;
			System.out.println(String.format("%.3f", N)+"%");
			
			
			
		}
		
	}

}
