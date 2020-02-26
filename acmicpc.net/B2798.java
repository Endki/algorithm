import java.util.Scanner;

public class B2798 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int n=input.nextInt();
		int m=input.nextInt();
	
		
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;i<n;j++) {
				for(int k=0;k<n;k++) {
					if(i==j || j==k || i==k) {
						continue;
					}
					sum=arr[i]+arr[j]+arr[k];
				}
			}
		}
	}

}
