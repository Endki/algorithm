import java.util.Arrays;
import java.util.Scanner;

public class B2847 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int count=0;
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		
		int temp=0;
		
		for (int i = n-1; i > 0; i--) {
			
			while(arr[i-1]>=arr[i]) {
				arr[i-1]-=1;
				count++;
			}
			
			
		// �� Ʋ���� �𸣰ڴ�. 100%���� Ʋ�Ƚ��ϴ�. �߻�	
//			if(arr[i-1]>arr[i]) {
//				temp=arr[i-1]-arr[i]+1;
//				arr[i-1]-=temp;
//				count+=temp;
//			}

		}
		System.out.println(count);

	}

	

}
