package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B1931 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[n][2];
		StringTokenizer stz;
		for (int i = 0; i < n; i++) {
			stz = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(stz.nextToken()); // StartTime
			arr[i][1] = Integer.parseInt(stz.nextToken()); // EndTime
		}
		int count = 0;

		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] start, int[] end) {

				if (start[1] == end[1]) {  // ������ �ð��� ������

					return Integer.compare(start[0], end[0]);  // ���۽ð����� ��  
				} else {								// �ƴϸ�

					return Integer.compare(start[1], end[1]); // ������ �ð����� ��
				}
			}

		});
		int end=-1; //���� �ð� ����� �ʱ�ȭ�� 0�� �����̱⶧���� -1
		for(int i=0;i<n;i++) {
			if(arr[i][0]>=end) { //���۽ð��� �� ����ð� ���� �����̸� 
				end=arr[i][1]; // ���� ����ð��� ���� ���� �ð� ������ ���� ����ð� ����
				count++;
			}
		}
		System.out.println(count);
	}

}
