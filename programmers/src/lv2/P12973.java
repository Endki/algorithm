package lv2;

import java.util.Stack;

public class P12973 {

	public static void main(String[] args) {
		System.out.println(solution("baabaa"));

	}
    public static int solution(String s)
    {
        int answer = -1;

        
        Stack<Character> stack=new Stack<Character>();
        
        
        
        for(int i=0;i<s.length();i++) {
        	if(stack.isEmpty()) {
        		stack.add(s.charAt(i));
        		continue;
        	}
        	if(stack.peek()==s.charAt(i)) {
        		stack.pop();
        	}else {
        		stack.add(s.charAt(i));
        	}
        }
        
        if(stack.isEmpty()) {
        	answer=1;
        }else {
        	answer=0;
        }
        
        return answer;
    }
}
