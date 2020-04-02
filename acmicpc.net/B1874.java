import java.util.Scanner;
import java.util.Stack;

public class B1874 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Stack<Integer> stack=new Stack<>();
		
		
		int t=input.nextInt();
		
		for(int i=1;i<=t;i++) {
			int m=input.nextInt();
			
			
				if(stack.size()<m) {
					while(stack.size()!=m) {
						stack.push(i);
						System.out.println("+");	
					}
				}else {
					if(stack.pop().equals(m)) {
						System.out.println("NO");
						return;
					}
					
					System.out.println("-");
				}
			
			
		}

	}

}
