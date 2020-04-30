package implement;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class B10709 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int h = input.nextInt();
		int w = input.nextInt();

		int[][] arr = new int[h][w];

		
		String z;
		char k;

		for (int i = 0; i < h; i++) {
			z = input.next();
			for (int j = 0; j < w; j++) {
				arr[i][j]=-1;
				k = z.charAt(j);
				if (k == 'c') {
					arr[i][j] = 0;
				}
				if (j > 0 && arr[i][j-1] > -1) {
					if(arr[i][j]==0) {
						continue;
					}
					arr[i][j] = arr[i][j-1] + 1;
				}

			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
