package lv2;

import java.util.Stack;

public class P60058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int position;
    public String solution(String p) {
    	//    	https://www.youtube.com/watch?v=Bc34h7xPTL8
    	
        
        if(p.isEmpty()) {
        	return "";
        }
        
        boolean check=isCheck(p);
        
        String u=p.substring(0,position);
        String v=p.substring(position,p.length());
        
        if(check) {
        	return u+solution(v); 
        }
        
        StringBuilder sb=new StringBuilder();
        sb.append("(").append(solution(v)).append(")");
        
        for(int i=1;i<u.length()-1;i++) {
        	if(u.charAt(i)=='(') {
        		
        		sb.append(")");
        	}else {
        		
        		sb.append("(");
        	}
        }
        
        return sb.toString();
    }

    public boolean isCheck(String input) {
    	boolean flag=true;
    	int left=0;
    	int right=0;
    	
    	Stack<Character> stack=new Stack<Character>();
    	
    	for(int i=0;i<input.length();i++) {
    		if(input.charAt(i)=='(') {
    			left++;
    			stack.add('(');
    		}else {
    			right++;
    			if(stack.isEmpty()) {
    				flag=false;
    			}else {
    				stack.pop();
    			}
    		}
    		
    		if(left==right) {
    			position=i+1;
    			return flag;
    		}
    	}
    	return true;
    }
}
