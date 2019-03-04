package jaja;

import java.util.Arrays;
import java.util.Scanner;

public class B3460 {

	public void serching(int N) {
		
	}
	
	public static void main(String[] args) {

		
		Scanner input=new Scanner(System.in);
		
		
		
		int T=0,NN=0;

		int N[]=new int[10];
		T=input.nextInt();

		for(int i=0;i<T;i++) {
		NN=input.nextInt();
		int converter[]=new int[99];
		
		for(int j=0;;) {
			converter[j]=NN%2;
			j+=1;
			NN=NN/2;
			if(NN==0) {
				break;
			}else {
				converter[j]=1;
			}
		}
		for(int j=0;j<99;j++) {
		if(converter[j]==1) {
		System.out.println(j);
		}
		}
	}
	}
}
