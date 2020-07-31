package sort;

import java.util.Arrays;

public class K번째수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] comm = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		
		System.out.println(Arrays.toString(solution(arr, comm)));
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int a, b, c;

		for (int i = 0; i < commands.length; i++) {

			a = commands[i][0];
			b = commands[i][1];
			c = commands[i][2];

			
			
			int[] arr=new int[b-a+1];
			
			int index=0;
			for(int j=a-1;j<b;j++) {
				arr[index++]=array[j];
			}
			Arrays.sort(arr);
			answer[i]=arr[c-1];
		}

		return answer;
	}

}
