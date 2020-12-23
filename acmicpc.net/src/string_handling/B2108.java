package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] mini = new int[8001];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());

			sum += arr[i];
		}
		// ����
		double san = Math.round(((double) sum / n));
		System.out.println((int) san);

		Arrays.sort(arr);
		// �߾�
		System.out.println(arr[(n / 2)]);

		// �ֺ�
		int max = Integer.MIN_VALUE;// Ƚ��
		int xy = 0;// ��ǥ
		int count = 0;// �ߺ�üũ

		// Ƚ�� ���� ����
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				mini[Math.abs(arr[i]) + 4000]++;
			} else {
				mini[arr[i]]++;
			}
		}

		// �ֺ� ����
		for (int i = 0; i < 8001; i++) {
			if (mini[i] > max) {
				max = mini[i];
				xy = i;
			}
		}
		for (int i = 0; i < 8001; i++) {
			if (mini[i] == max) {
				count++;
			}
		}
		if (count != 1) {
			count = 0;
			// �ߺ� üũ
			for (int i = 8000; i > 4000; i--) {

				if (mini[i] == max) {
					count++;
				}
				if (count > 1) {
					xy = i;
					break;
				}

			}

			if (count < 2) {
				for (int i = 0; i < 4001; i++) {
					if (mini[i] == max) {
						count++;
					}
					if (count > 1) {
						xy = i;
						break;
					}
				}
			}
		}
		if (xy > 4000) {
			xy -= 4000;
			xy *= -1;
		}
		System.out.println(xy);

		// ����
		System.out.println(Math.abs(arr[0] - arr[n - 1]));

	}

}
