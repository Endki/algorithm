package lv2;

import java.util.Stack;

public class P76502 {

	public static void main(String[] args) {
		System.out.println(solution("[]{}()"));
		System.out.println(solution("}]()[{"));
		System.out.println(solution("[)(]"));
		System.out.println(solution("}}}"));
	}

	static public int solution(String s) {
		int answer = 0;

		String sb = s;
		for (int i = 0; i < s.length(); i++) {
			sb = sb.charAt(sb.length() - 1) + sb.substring(0, sb.length() - 1);
			Stack<Character> stack = new Stack<Character>();

			for (int j = 0; j < sb.length(); j++) {
				char c = sb.charAt(j);
				
				if (stack.isEmpty()) {
					stack.add(c);
				} else {
					
					switch (c) {
					case ')':
						if (!stack.isEmpty()) {
							if (stack.peek() == '(') {
								stack.pop();
							}
						}
						break;
					case ']':
						if (!stack.isEmpty()) {
							if (stack.peek() == '[') {
								stack.pop();
							}
						}
						break;
					case '}':
						if (!stack.isEmpty()) {
							if (stack.peek() == '{') {
								stack.pop();
							}
						}
						break;
					default:
						stack.add(c);
						break;
					}
				}
			}

			if (stack.isEmpty()) {
				answer++;
			}

		}

		return answer;
	}
}
