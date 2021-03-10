package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B17413 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		int len = input.length();
		Stack<Character> reverse = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		// 한 문장씩 검사

		int index = 0;
		while (index<len) {
			
			
			char kkk=input.charAt(index);
			
			// 지금 문자가 <면 
			if(kkk=='<') {
				while(!reverse.isEmpty()) {
					sb.append(reverse.pop());
				}
				while(input.charAt(index)!='>') {
					sb.append(input.charAt(index++));
				}
				sb.append(input.charAt(index++));
			}else if(kkk==' '){
				while(!reverse.isEmpty()) {
					sb.append(reverse.pop());
				}
				sb.append(' ');
				index++;
			}else {
				reverse.add(kkk);
				index++;
			}
		}
		while(!reverse.isEmpty()) {
			sb.append(reverse.pop());
		}
		
		System.out.println(sb.toString());

	}

}
