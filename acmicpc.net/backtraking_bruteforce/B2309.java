package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2309 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr=new int[9];
		int sum=0;
		for(int i=0;i<9;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		int cost=0;
		
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(i==j) {
					continue;
				}
				cost=(sum-arr[i])-arr[j];
				if(cost==100) {
					arr[i]=101;
					arr[j]=101;
					break;
				}
			}
			if(cost==100) {
				break;
			}
		}
		Arrays.parallelSort(arr);
		for(int i=0;i<7;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
