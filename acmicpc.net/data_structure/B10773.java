package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10773 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack=new Stack<Integer>();
		
		int k=Integer.parseInt(br.readLine());
		
		while(k-->0) {
			int m=Integer.parseInt(br.readLine());
			
			if(m==0) {
				stack.pop();
			}else {
				stack.push(m);
			}
			
		}
		int sum=0;
		while(!stack.empty()) {
			sum+=stack.pop();
		}
		System.out.println(sum);
	}

}
