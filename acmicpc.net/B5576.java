import java.util.*;

public class B5576 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[]=new int[10];
		int arr2[]=new int[10];
		
		for (int i = 0; i < 10; i++) {
			arr[i]=input.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			arr2[i]=input.nextInt();
		}
		
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		int sum=0,sum2=0;
		for(int i=9;i>6;i--) {
			sum+=arr[i];
			sum2+=arr2[i];
		}
		
		
		System.out.println(sum+" "+sum2);
	}

}
