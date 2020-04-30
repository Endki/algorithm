package math;
import java.util.Scanner;

public class B2863 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] arr = new double[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = input.nextDouble();
			}
		}

		int count = 0;
		double sum = 0;
		double max = (arr[0][0] / arr[1][0]) + (arr[0][1] / arr[1][1]);
		int solve = 0;
		boolean check=true;
		
		for (int i = 0; i < 3; i++) {
			double tmp = arr[0][0];
			arr[0][0] = arr[1][0];
			arr[1][0] = arr[1][1];
			arr[1][1] = arr[0][1];
			arr[0][1] = tmp;
			
			sum = (arr[0][0] / arr[1][0]) + (arr[0][1] / arr[1][1]);
			
			count++;
			if(max<sum) {
				max=sum;
				solve=i+1;
				check=false;
			}
		}
		if(check==true) {
			System.out.println("0");
		}else {
			System.out.println(solve);
		}

		

	}

}
