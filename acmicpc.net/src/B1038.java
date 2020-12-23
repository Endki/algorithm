import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B1038 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<Integer>();

		int number = 10;

		if (N < 10) {
			System.out.println(N);
			return;
		}

		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}

		while (stack.size() < N + 1) {
			String numToS = Integer.toString(number);
			Stack<Integer> mirror = new Stack<Integer>();
			boolean swt=false;
			for (int i = 0; i < numToS.length(); i++) {
				
				int one=numToS.charAt(i) - '0';
				
				if (mirror.isEmpty()) {
					mirror.push(one);
					continue;
				}
				
				if(mirror.peek()>one) {
					mirror.push(one);
				}else {
					swt=true;
					break;
				}
			}
			
			if(!swt) {
				stack.push(number);
			}
			number++;
		}

		System.out.println(stack.peek());
	}

}
