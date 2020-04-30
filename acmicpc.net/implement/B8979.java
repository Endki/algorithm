package implement;
import java.util.Arrays;
import java.util.Scanner;

public class B8979 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int k = input.nextInt();

		double[] arr = new double[1001];

		//입력
		for (int i = 1; i <= n; ++i) {
				int z = input.nextInt();	
				
				arr[z] = input.nextDouble();
				arr[z] += input.nextDouble()*0.0000001;
				arr[z] += input.nextDouble()*0.0000000000001;	
		}
		
		
		int winner=1;
		
		for (int i=1;i<=n;++i) {
			if(arr[i]>arr[k]) {
				winner++;
			}
		}
		
		
		
		//출력
		System.out.println(winner);
		
		
		
		
	}

}
