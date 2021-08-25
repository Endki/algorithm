package lv2;

import java.util.Stack;

public class P12909 {

	public static void main(String[] args) {
		System.out.println(solution("()()"));

	}
    public static boolean solution(String s) {

        Stack<Character> stack=new Stack<Character>();
        
        
        if(s.charAt(0)==')') {
        	return false;
        }
        
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)=='(') {
        		stack.push(s.charAt(i));
        	}
        	if(!stack.isEmpty() && stack.peek()=='(' && s.charAt(i)==')') {
        		stack.pop();
        	}
        	
        	
        }

        if(stack.isEmpty()) {
        	return true;
        }else {
        	return false;
        }
        
        
    }
}
