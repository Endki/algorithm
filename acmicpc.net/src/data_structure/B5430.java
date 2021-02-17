package data_structure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B5430 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine());

		while (TC-- > 0) {
			String order = br.readLine();
			int N = Integer.parseInt(br.readLine());

			Deque<Integer> deq = new LinkedList<Integer>();

			String input = br.readLine();
			String calInput = input.substring(1, input.length() - 1);
			StringTokenizer stz = new StringTokenizer(calInput, ",");

			for (int i = 0; i < N; i++) {
				deq.add(Integer.parseInt(stz.nextToken()));
			}

			boolean flag = false;
			boolean isFront = true;
			for (int i = 0; i < order.length(); i++) {
				char k = order.charAt(i);

				if (k == 'R') {
					isFront = !isFront;
				} else {
					if (deq.isEmpty()) {
						flag = true;
						break;
					}

					if (isFront) {
						deq.pollFirst();
					} else {
						deq.pollLast();
					}
				}
			}

			if (flag) {
				System.out.println("error");
			} else {
				StringBuilder sb = new StringBuilder();
				sb.append("[");

				if (!deq.isEmpty()) {
					if (isFront) {
						while (deq.size() > 1) {
							sb.append(deq.pollFirst()).append(",");
						}
						sb.append(deq.pollFirst());

					} else {
						while (deq.size() > 1) {
							sb.append(deq.pollLast()).append(",");
						}
						sb.append(deq.pollLast());
					}
				}
				sb.append("]");
				System.out.println(sb.toString());
			}

		}

	}

}
