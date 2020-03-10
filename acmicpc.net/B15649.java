import java.util.Scanner;

public class B15649 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int m=input.nextInt();
		int[] arr=new int[n+1];
		
		int count=0;
	
		for(int i=1;i<=n;i++) {
			arr[i]=i;
		}
		solve(arr,m);
		
		
		
		
	}

	public static void solve(int[] arr,int m) {
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				System.out.print(arr[j]);
				for(int k=1;k<arr.length;k++) {
					
					
					
					
				}
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
}
