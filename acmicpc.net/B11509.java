import java.util.Scanner;

public class B11509 {

	static int count=0;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		int n=input.nextInt();
		
		
		int count=0,temp=0;
		int a=-1;
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=input.nextInt();			
			
			
		}
		temp=solve(arr,0);
		System.out.println(temp);

	}
	
	
	public static int solve(int[] arr,int i) {
		
		if(arr[i]-arr[i+1]==1) {
			solve(arr,i+1);
			
			return count+1;
		}else {
			solve(arr,i+1);
		}
		return count+1;
	}

}
