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

				if (start[1] == end[1]) {  // 끝나는 시간이 같으면

					return Integer.compare(start[0], end[0]);  // 시작시간으로 비교  
				} else {								// 아니면

					return Integer.compare(start[1], end[1]); // 끝나는 시간으로 비교
				}
			}

		});
		int end=-1; //종료 시간 저장용 초기화는 0초 시작이기때문에 -1
		for(int i=0;i<n;i++) {
			if(arr[i][0]>=end) { //시작시간이 전 종료시간 보다 나중이면 
				end=arr[i][1]; // 지금 종료시간과 다음 시작 시간 비교위한 지금 종료시간 저장
				count++;
			}
		}
		System.out.println(count);
	}

}
