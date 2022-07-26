package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class B2870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<BigInteger> pq = new PriorityQueue<BigInteger>();

		while (N-- > 0) {
			Queue<Character> qu = new LinkedList<Character>();
			String input = br.readLine();
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < input.length(); i++) { // 문자열 길이만큼 포문을 돌린다.

				if (input.charAt(i) - '0' >= 0 && input.charAt(i) - '0' < 10) { // 만약 0~9 사이 숫자면 add한다.
					qu.add(input.charAt(i));
				} else { // 아니면
					while (!qu.isEmpty()) { // qu에 있는거 빼고 sb에 넣는다.
						sb.append(qu.poll());
					}

					if (sb.length() != 0) { // sb의 길이가 0이 아니면
						
						pq.add(new BigInteger(sb.toString())); // pq에 다 넣음
						sb.setLength(0);
					}
				}

			}
			while (!qu.isEmpty()) { // qu에 있는거 빼고 sb에 넣는다.
				sb.append(qu.poll());
			}
			if (sb.length() != 0) { // sb의 길이가 0이 아니면
				pq.add(new BigInteger(sb.toString())); // pq에 다 넣음
			}


		}
			while (!pq.isEmpty()) {
				System.out.println(pq.poll());
			}
	}

}
