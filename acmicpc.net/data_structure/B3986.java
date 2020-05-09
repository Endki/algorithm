package data_structure;
import java.util.Scanner;
import java.util.Stack;

public class B3986 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Stack<Character> stack=new Stack<>();
		
		
		int t=input.nextInt();
		int count=0;
		for(int i=0;i<t;i++) {
			String k=input.next();
			stack.clear();
			for(int j=0;j<k.length();j++) {
				
				if(!stack.isEmpty() && stack.peek()==k.charAt(j)) {
					stack.pop();
				}else {
					stack.push(k.charAt(j));
				}
			}
			
			if(stack.isEmpty()) {
				count++;
			}
			
			
		}
		System.out.println(count);

	}

}
