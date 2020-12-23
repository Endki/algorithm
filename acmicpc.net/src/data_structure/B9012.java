package data_structure;
import java.util.Scanner;
import java.util.Stack;

public class B9012 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Stack<Character> stack=new Stack<>();
		
		boolean swt=true;
		int t=input.nextInt();
		
		for(int i=0;i<t;i++) {
			String k=input.next();
			swt=true;
			stack.clear();
			for(int j=0;j<k.length();j++) {
				
				if(k.charAt(j)=='(') {
					stack.push(k.charAt(j));
				}
				else {
					if(stack.size()==0) {
						swt=false;
					}else {
						stack.pop();
					}
				}
				
			}
			if(stack.size()!=0) {
				swt=false;
			}
			
			if(swt) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}

	}

}
