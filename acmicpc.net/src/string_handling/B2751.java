package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2751 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		int n=Integer.parseInt(br.readLine());
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		quicksort(arr, 0, n-1);
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	static void quicksort(int[] arr,int left,int right) {
		if(left>=right) {
			return;
		}
		
		int pivot=partition(arr,left,right);
		
		quicksort(arr, left, pivot-1);
		quicksort(arr, pivot+1, right);
	}
	private static int partition(int[] arr,int left,int right) {
		int mid=(left+right)/2;
		swap(arr,left,mid);
		
		int pivot=arr[left];
		int i=left;
		int j=right;
		
		while(i<j) {
			while(pivot<arr[j]) {
				j--;
			}
			
			while(pivot>=arr[i] && i<j) {
				i++;
			}
			
			swap(arr,i,j);
		}
		arr[left]=arr[i];
		arr[i]=pivot;
		return i;
	}
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}
