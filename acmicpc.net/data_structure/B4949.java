package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B4949 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input_len, i;
		Stack<Character> stack = new Stack<Character>();
		char t;
		String input = br.readLine();
		while (!input.equals(".")) {
			stack.clear();
			input_len = input.length();
			for (i = 0; i < input_len; i++) {
				t = input.charAt(i);
				if (t == '(' || t == '[') {
					stack.push(t);
				} else if (t == ')' || t == ']') {
					if (stack.isEmpty() || (t == ')' && stack.peek() != '(') || (t == ']' && stack.peek() != '[')) {
						stack.push(t);
						break;
					}
					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			input = br.readLine();
		}
	}

}
