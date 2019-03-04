package jaja;

import java.util.Scanner;

public class B2845 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int arr[]=new int[5];
		
		
		int L=0,P=0;
		int S=0;
		int sum=0;
		L=input.nextInt();
		P=input.nextInt();
		
		sum=L*P;
		for(int i=0;i<5;i++) {
		S=input.nextInt();
		arr[i]=S-sum;
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
