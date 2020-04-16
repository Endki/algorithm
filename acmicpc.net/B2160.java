import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2160 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		char[][][] arr = new char[n][5][7];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = br.readLine().toCharArray();
			}

		}
		int count = 0;
		int min = Integer.MAX_VALUE;
		int a = 0;
		int b = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				count=0;
				for (int k = 0; k < 5; k++) {
					for (int z = 0; z < 7; z++) {
						if (arr[i][k][z] != arr[j][k][z]) {
							count++;
						}
					}
				}
				if(count<min) {
					min=count;
					a=i+1;
					b=j+1;
				}
			}

		}
		System.out.println(a+" "+b);
	}

}
