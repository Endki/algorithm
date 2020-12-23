package thinking_programing_contest_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B20001 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String k=br.readLine();
		
		Stack<String> stack=new Stack<String>();
		while(!k.equals("고무오리 디버깅 끝")) {
			k=br.readLine();
			
			if(k.equals("문제")) {
				stack.add(k);
			}else if(k.equals("고무오리")){
				if(stack.isEmpty()) {
					stack.add("문제");
					stack.add("문제");
				}else {
					stack.pop();
				}
			}
		
		}
		
		
		if(stack.size()==0) {
			System.out.println("고무오리야 사랑해");
		}else {
			System.out.println("힝구");
		}
		

	}

}
