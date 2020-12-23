package implement;
import java.util.Scanner;

public class B4948 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] arr = new int[246913];
		arr[0] = 0;
		arr[1] = 0;

		for (int i = 2; i < 246913; i++) {
			arr[i] = i;

		}
		
		for (int i = 2; i < 246913; i++) {
			for (int j = 1; i * j < 246913; j++) {
				if (arr[i * j] /i != 1) {
					arr[i * j] =0;
				}

			}

		}

		int count = 0;
		int tmp = 0;
		// 기본 입력
		while (true) {
			int n = input.nextInt();
			if (n == 0) {
				break;
			}
			
			for(int i=n+1;i<=2*n;i++) {
				if(arr[i]!=0) {
					count++;
				}
			}
			System.out.println(count);
			count=0;

		}
	}

}
