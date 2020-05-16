package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://mygumi.tistory.com/308 Ȱ�� �����մϴ�.
public class B11004 {
	static int k;

	public static void swap(Long[] arr, int left, int right) {
		long temp = arr[right];
		arr[right] = arr[left];
		arr[left] = temp;
	}

	public static int partition(Long[] arr, int left, int right) {

		int mid = (left + right) / 2;
		swap(arr, left, mid);

		long pivot = arr[left];

		int i = left, j = right;
		while (i < j) {
			while (pivot < arr[j]) {
				j--;
			} // �������ΰ��鼭 ������ ã��
			while (i < j && pivot >= arr[i]) {
				i++;
			} // ���������� ���鼭 ū�� ã��
			swap(arr, i, j); // �������� ū�� ã�� �ڸ��� ��ȯ
		}
		arr[left] = arr[i]; // ���ٸ� ���� �ǹ��� ��ȯ
		arr[i] = pivot;

		return i;
	}

	public static void quicksort(Long[] arr, int left, int right) {
		if (left >= right) {
			return;
		} // ���� ũ�Ⱑ �����ʰ� �������� ����

		int pivot = partition(arr, left, right);
		if (pivot + 1 == k) {
			return;
		} else if (pivot + 1 >= k) {
			quicksort(arr, left, pivot - 1); // ��������
		} else {
			quicksort(arr, pivot + 1, right); // ����������
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(stz.nextToken());
		k = Integer.parseInt(stz.nextToken());
		Long[] arr = new Long[n];
		stz = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(stz.nextToken());
		}

		quicksort(arr, 0, n - 1);

		System.out.println(arr[k - 1]);

	}

}
