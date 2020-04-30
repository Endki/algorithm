package implement;
import java.util.Scanner;

public class B2935 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String a, b;
		String oper;

		a = input.next();
		oper = input.next();
		b = input.next();

		if(a.length()<b.length()) {
			String temp=a;
			a=b;
			b=temp;
		}
		
		
		System.out.println(solve(a,oper,b));
	}

	
	private static String solve(String a,String oper,String b) {
		if(oper.equals("+")){
			return calcPlus(a,b);
		}
		return calcMulti(a,b);
	}
	
	private static String calcPlus(String a,String b) {
		if(a.length()==b.length()) {
			return "2" + a.substring(1);
		}
		return a.substring(0, a.length()-b.length())+b;
	}
	private static String calcMulti(String a, String b) {
		return a+b.substring(1);
	}
}
