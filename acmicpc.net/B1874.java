import java.util.Scanner;
import java.util.Stack;

public class B1874 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Stack<Integer> stack=new Stack<>();
		
		int t=input.nextInt();
		int[] arr=new int[t];
		boolean swt=true;
		int num=1;
		String k="";
		
		for(int i=0;i<t;i++) {
			arr[i]=input.nextInt();
			
			
				if(swt) {
					if(num<=arr[i]) {
						while(num<=arr[i]) {
							stack.push(num++);
							k+="+";
						}
					}
					if(stack.isEmpty()) {
						swt=false;
					}else {
						while(stack.peek()>=arr[i]) {
							stack.pop();
							k+="-";
							if(stack.isEmpty()) {
								break;
							}
						}
					}
				}
			
			
		}
		if(swt) {
			for(int i=0;i<k.length();i++) {
				System.out.println(k.charAt(i));
			}
		}else {
			System.out.println("NO");
		}

	}

}
