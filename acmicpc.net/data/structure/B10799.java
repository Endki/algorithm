package data.structure;
import java.util.Scanner;
import java.util.Stack;

public class B10799 {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		Scanner input = new Scanner(System.in);

		int sum = 0;

		String k = input.next();

		for (int i = 0; i < k.length(); i++) {

			if (k.charAt(i) == '(') {
				stack.push('(');
			} else {
				if (k.charAt(i-1) == '(') {
					stack.pop();

					sum += stack.size();
				}else {
					stack.pop();
					sum+=1;
				}
			}

		}

		System.out.println(sum);

	}

}
