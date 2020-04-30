package implement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B2501 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int k=input.nextInt();
		int count=0;
		
		
		int[] arr=new int[n];
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				arr[i-1]=i;
			}
		}
		Arrays.parallelSort(arr);

//			for(int j=0;j<arr.length-1;j++) {
//				{
//					arr[j]=arr[j+1];
//				}
//			}
		
		
		
		
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				count++;
			}
		}
		int[] newArr=new int[count];
		for(int i=0;i<count;i++) {
			newArr[i]=arr[arr.length-count+i];
		}
		
		if(newArr.length<k) {
			System.out.println("0");
		}else {
		
		System.out.println(newArr[k-1]);
		}
		
		
		
		

		

	}

}
