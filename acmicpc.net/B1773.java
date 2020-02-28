import java.util.Scanner;

public class B1773 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int c=input.nextInt();
		
		int[] arr=new int[c+1];
		
		for(int i=0;i<n;i++) {
			int k=input.nextInt();
			for(int j=1;k*j<=c;j++) {
				arr[k*j]+=1;
			}
		}

		int count=0;
		for(int i=0;i<=c;i++) {
			if(arr[i]>0) {
				count+=1;
			}
		}
		
		System.out.println(count);
		
	}

}
