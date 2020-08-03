package tree;

import java.io.IOException;
import java.util.Scanner;

public class SW1233 {

	public static char[] tree = new char[201];
	public static int n;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			n = sc.nextInt();

			// 초기화
			for (int i = 0; i < n; i++) {
				tree[i] = 0;
			}

			String input = sc.nextLine();

			for (int i = 1; i <= n; i++) {
				input = sc.nextLine();
				String[] value = input.split(" ");
				tree[i] = value[1].charAt(0);
			}
			int answer;

			if (solve(1)) {
				answer = 1;
			} else {
				answer = 0;
			}

			System.out.println("#" + tc + " " + answer);
		}

	}

	public static boolean judge(int index) {

		if (1 <= index && index <= n && tree[index] == 0) {
			return true;
		}

		return false;
	}

	public static boolean solve(int index) {

		if (index > n) {
			return false;
		}

		char c = tree[index];

		// 숫자인애들의 자식이 없어야함
		if ('0' <= c && c <= '9') {
			// 자식 판단 왼쪽자식 0 , 오른쪽 자식 0 
			if ((judge(index * 2) && judge(index * 2 + 1)) || (index * 2 > n) && (index * 2 + 1 > n)) {
				return true;
			}
			return false;
		}
		// 리프 노드가 아니면
		else {
			// 왼쪽 오른쪽 재귀
			return (solve(index * 2) & solve(index * 2 + 1));
		}
	}

}
