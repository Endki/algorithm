package data_structure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B1439 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input=br.readLine();
		
		int oneCount=0;
		int zeroCount=0;
		
		Stack<Character> stack=new Stack<Character>();
		stack.add(input.charAt(0));
		
		for(int i=1;i<input.length();i++) {
			if(stack.peek()!=input.charAt(i)) {
				stack.add(input.charAt(i));
			}
		}
		while(!stack.isEmpty()) {
			if(stack.pop()=='1') {
				oneCount++;
			}else {
				zeroCount++;
			}
		}
		
		System.out.println(Math.min(oneCount, zeroCount));
		
	}

}
