package data_structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class B1918 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String k = br.readLine();
		char[] arr = k.toCharArray();

		int la = arr.length;
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < la; i++) {
			int p = priority(arr[i]);
			char ch = arr[i];

			switch (ch) {
			case '+':
			case '-':
			case '*':
			case '/':
				while (!stack.isEmpty() && priority(stack.peek()) >= p) {
					bw.append(stack.pop());
				}
				stack.push(ch);
				break;

			case '(':
				stack.push(ch);
				break;

			case ')':
				while (!stack.isEmpty() && stack.peek() != '(') {
					bw.append(stack.pop());
				}
				stack.pop();
				break;
			default:
				bw.append(ch);
				
			}

		}
		while (!stack.isEmpty()) {
			bw.append(stack.pop());
		}
		bw.flush();
	}

	public static int priority(char ch) {
		switch (ch) {
		case '*':
		case '/':
			return 2;
		case '+':
		case '-':
			return 1;
		case '(':
		case ')':
			return 0;
		}
		return -1;
	}
}
