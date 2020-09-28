package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2309 {

	static int[] arr;
	static boolean[] visit;
	static int[] output;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		
		arr=new int[9];
		visit=new boolean[9];
		
		for(int i=0;i<9;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		
		int cost=0;
		
		loop:for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(i==j) {
					continue;
				}
				
				cost=(sum-arr[i])-arr[j];
				if(cost==100) {
					arr[i]=999;
					arr[j]=999;
					break loop;
				}
			}
		}
		
		Arrays.sort(arr);
		for(int i=0;i<7;i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
