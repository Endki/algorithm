package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B1935 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		String input = br.readLine();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Stack<Double> operand = new Stack<>();

		for (int i = 0; i < input.length(); i++) {

			char k = input.charAt(i);
			if ('A' <= k && k <= 'Z') { // operand
				double d = arr[k - 'A'];
				operand.push(d);
			} else { // operator
				double d1 = operand.pop();
				double d2 = operand.pop();
				double d3 = 0;
				
				
				switch (k) {
				case '+':
					d3 = d2 + d1;
					break;
				case '-':
					d3 = d2 - d1;
					break;
				case '*':
					d3 = d2 * d1;
					break;
				case '/':
					d3 = d2 / d1;
					break;
				}
				operand.push(d3);
			}
		}
		System.out.printf("%.2f", operand.pop());
	}

}
