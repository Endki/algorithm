package data_structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class B2493 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer stz = new StringTokenizer(br.readLine());

		Stack<Integer> height = new Stack<Integer>();
		Stack<Integer> index = new Stack<Integer>();
		int[] arr = new int[n+1];

		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(stz.nextToken());
		}
		height.push(arr[1]);
		index.push(1);
		bw.write(0 + " ");

		for (int i = 2; i <= n; i++) {
			while (true) {
				if (!height.isEmpty()) {
					int top = height.peek();
					if (top > arr[i]) {
						bw.write(index.peek() + " ");
						height.push(arr[i]);
						index.push(i);
						break;
					} else {
						height.pop();
						index.pop();
					}

				} else {
					bw.write(0 + " ");
					height.push(arr[i]);
					index.push(i);
					break;
				}
			}

		}

		bw.flush();
	}

}
