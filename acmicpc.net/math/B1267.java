package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1267 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int zero = 0;
		int min = 0;

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];

		String[] input = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
			zero+=zeroSik(arr[i]);
			min+=minSik(arr[i]);
		}
		
		if(zero>min) {
			System.out.println("M "+min);
		}else if(zero<min) {
			System.out.println("Y "+zero);
		}else {
			System.out.println("Y M "+zero);
		}

	}

	public static int zeroSik(int a) {
		int sum=0;
		int cost=10;
		if(a<30) {
			return 10;
		}else {
			sum+=1;
			a-=29;
			sum+=a/30;
			if(a%30>0) {
				sum+=1;
			}	
		}
		cost*=sum;
	
		
		return cost;
	}

	public static int minSik(int a) {
		int sum=0;
		int cost=15;
		if(a<60) {
			return 15;
		}else {
			sum+=1;
			a-=59;
			sum+=a/60;
			if(a%60>0) {
				sum+=1;
			}	
		}
		cost*=sum;
	
		
		return cost;
	}
}
