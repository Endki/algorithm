import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10163 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[][] arr = new int[1002][1002];
		for (int i = 1; i <= N; i++) {
			StringTokenizer stz = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(stz.nextToken());
			int y = Integer.parseInt(stz.nextToken());
			int xPlus = Integer.parseInt(stz.nextToken());
			int yPlus = Integer.parseInt(stz.nextToken());

			arr = drawArr(x, y, xPlus, yPlus, arr, i);
		}

		int[] countArr = new int[101];
		for (int i = 0; i < 1002; i++) {
			for (int j = 0; j < 1002; j++) {
				if (arr[i][j] != 0) {
					countArr[arr[i][j]]++;
				}
			}
		}

		for (int i = 1; i <= N; i++) {

			System.out.println(countArr[i]);

		}
	}

	public static int[][] drawArr(int x, int y, int xPlus, int yPlus, int[][] arr, int index) {

		for (int i = x; i < x + xPlus; i++) {
			for (int j = y; j < y + yPlus; j++) {
				arr[i][j] = index;
			}
		}
		return arr;
	}
}
