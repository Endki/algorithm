package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10815 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		String[] inputN=br.readLine().split(" ");
		int[] arrN=new int[n];
		for(int i=0;i<n;i++) {
			arrN[i]=Integer.parseInt(inputN[i]);
		}
		Arrays.parallelSort(arrN);
		
		int m=Integer.parseInt(br.readLine());
		String[] inputM=br.readLine().split(" ");
		int[] arrM=new int[m];
		for(int i=0;i<m;i++) {
			arrM[i]=Integer.parseInt(inputM[i]);
		}
		
		int[] arr=new int[m];
		
		for(int i=0;i<m;i++) {
			int mid;
			int left=0;
			int right=n;
			int swt=0;
			
			while(right-left>1) {
				
				mid=(right+left)/2;
				
				if(arrM[i]==arrN[0]) {
					swt=1;
					break;
				}
				
				if(arrM[i]==arrN[mid]) {
					swt=1;
					break;
				}
				
				if(arrM[i]>arrN[mid]) {
					left=mid;
				}else if(arrM[i]<arrN[mid]) { 
					right=mid;
				}
				
			}
			System.out.print(swt+" ");
			
		}

	}

}
