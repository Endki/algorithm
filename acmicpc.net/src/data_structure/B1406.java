package data_structure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class B1406 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input=br.readLine();
		
		Stack<Character> stack=new Stack<Character>();
		Deque<Character> deque=new LinkedList<Character>();
		
		for(int i=0;i<input.length();i++) {
			deque.addLast(input.charAt(i));
		}
		
		int length=input.length();
		
		int N=Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			
			String k=stz.nextToken();
			
			switch (k) {
			case "P":
				String m=stz.nextToken();
				deque.addLast(m.charAt(0));
				length++;
				break;
			case "L":
				if(!deque.isEmpty()) {
					stack.push(deque.pollLast());
				}
				break;
			case "D":
				if(!stack.isEmpty()) {
					deque.addLast(stack.pop());
				}
				break;
			case "B":
				if(!deque.isEmpty()) {
					
					deque.pollLast();
				}
				break;
			}
		}
		StringBuilder sb=new StringBuilder();
		while(!deque.isEmpty()) {
			sb.append(deque.pollFirst());
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb.toString());
	}

}
