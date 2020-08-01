package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1873 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;
		int tc = Integer.parseInt(br.readLine());

		for (int t = 1; t <= tc; t++) {
			stz = new StringTokenizer(br.readLine());

			int h = Integer.parseInt(stz.nextToken());
			int w = Integer.parseInt(stz.nextToken());

			char[][] arr = new char[h][w];

			for (int i = 0; i < h; i++) {
				arr[i] = br.readLine().toCharArray();
			}

			int c = Integer.parseInt(br.readLine());

			char[] control = br.readLine().toCharArray();

			int indexX = 0;
			int indexY = 0;
			for (int m = 0; m < c; m++) {

				for (int j = 0; j < h; j++) {
					for (int k = 0; k < w; k++) {
						if (arr[j][k] == '>' || arr[j][k] == 'v' || arr[j][k] == '^' || arr[j][k] == '<') {
							indexX = j;
							indexY = k;
						}
					}
				}

				switch (control[m]) {

				case 'U':

					arr[indexX][indexY] = '^';
					if (indexX > 0 && arr[indexX - 1][indexY] == '.') {

						arr[indexX - 1][indexY] = '^';
						arr[indexX][indexY] = '.';
					}

					break;

				case 'D':

					arr[indexX][indexY] = 'v';
					if (indexX < h - 1 && arr[indexX + 1][indexY] == '.') {
						arr[indexX + 1][indexY] = 'v';
						arr[indexX][indexY] = '.';
					}
					break;

				case 'L':

					arr[indexX][indexY] = '<';

					if (indexY > 0 && arr[indexX][indexY - 1] == '.') {
						arr[indexX][indexY - 1] = '<';
						arr[indexX][indexY] = '.';
					}
					break;

				case 'R':

					arr[indexX][indexY] = '>';

					if (indexY < w - 1 && arr[indexX][indexY + 1] == '.') {
						arr[indexX][indexY + 1] = '>';
						arr[indexX][indexY] = '.';
					}
					break;

				case 'S':

					if (arr[indexX][indexY] == '<') {
						for (int z = indexY; z > -1; z--) {
							if (arr[indexX][z] == '#') {
								break;
							}
							if (arr[indexX][z] == '*') {
								arr[indexX][z] = '.';
								break;
							}
						}
					} else if (arr[indexX][indexY] == '^') {
						for (int z = indexX; z > -1; z--) {
							if (arr[z][indexY] == '#') {
								break;
							}

							if (arr[z][indexY] == '*') {
								arr[z][indexY] = '.';
								break;
							}
						}
					} else if (arr[indexX][indexY] == 'v') {

						for (int z = indexX; z < h; z++) {

							if (arr[z][indexY] == '#') {
								break;
							}
							if (arr[z][indexY] == '*') {
								arr[z][indexY] = '.';
								break;
							}

						}
					} else if (arr[indexX][indexY] == '>') {
						for (int z = indexY; z < w; z++) {

							if (arr[indexX][z] == '#') {
								break;
							}
							if (arr[indexX][z] == '*') {
								arr[indexX][z] = '.';
								break;
							}
						}
					}
					break;
				}
			}
			System.out.print("#" + t + " ");
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}

		}
	}

}
