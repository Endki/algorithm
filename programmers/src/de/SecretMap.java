package de;

import java.util.Arrays;

public class SecretMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				Arrays.toString(solution(5, new int[] { 9, 20, 28, 18, 11 }, new int[] { 30, 1, 21, 17, 28 })));
		System.out.println(Arrays
				.toString(solution(6, new int[] { 46, 33, 33, 22, 31, 50 }, new int[] { 27, 56, 19, 14, 14, 10 })));
		System.out.println(Arrays
				.toString(solution(20, new int[] { 9, 20, 28, 18, 11 , 9, 20, 28, 18, 11 ,9, 20, 28, 18, 11 , 9, 20, 28, 18, 11}, new int[] {  30, 1, 21, 17, 28, 30, 1, 21, 17, 28 ,9, 20, 28, 18, 11 , 9, 20, 28, 18, 11})));

	}

	static public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String flag;
		if (n < 10) {
			flag = "%0" + n + "d";
		} else {
			flag = "%" + n + "d";
		}

		String m = "";
		for (int i = 0; i < n; i++) {
			// 2진수 변환
			String k = Integer.toBinaryString(arr1[i]);
			String k2 = Integer.toBinaryString(arr2[i]);

			// 2진수를 n자리로 변환
			String in = String.format(flag, Integer.parseInt(k)).toString();
			String in2 = String.format(flag, Integer.parseInt(k2)).toString();
			m = "";
			for (int j = 0; j < n; j++) {
				// 이진수 각 자리 수 체크

				// 만약 자리가 '1'이면
				if (in.charAt(j) == '1' || in2.charAt(j) == '1') {
					m += "#";
				} else {
					m += " ";
				}
			}
			answer[i] = m;
		}
		return answer;
	}
}
