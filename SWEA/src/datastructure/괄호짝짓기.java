package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호짝짓기 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack=new Stack<Character>();
		
		for(int tc=1;tc<=10;tc++) {
			
			int n=Integer.parseInt(br.readLine());
			
			String input=br.readLine();
			
			for(int i=0;i<n;i++) {
				
				char k=input.charAt(i);
				
				
				if(k=='[' || k=='(' || k=='<' || k=='{') {
					
					stack.push(k);
					
				}else if(k==')') {
					
					if(stack.peek()=='(') {
						stack.pop();
					}else {
						stack.push(')');
					}
					
				}else if(k==']') {
					if(stack.peek()=='[') {
						stack.pop();
					}else {
						stack.push(']');
					}
					
					
				}else if(k=='}') {
					if(stack.peek()=='{') {
						stack.pop();
					}else {
						stack.push('}');
					}
					
					
				}else if(k=='>') {
					if(stack.peek()=='<') {
						stack.pop();
					}else {
						stack.push('>');
					}
					
					
				}

			}
			
			System.out.print("#"+tc);
			if(stack.empty()) {
				System.out.println(" "+1);
			}else {
				System.out.println(" "+0);
			}
			
			stack.clear();
		}
	}

}
