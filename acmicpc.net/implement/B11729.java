package implement;
import java.util.Scanner;

public class B11729 {

	public static int count=0;
	public static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		int n=input.nextInt();
		
		solve(n,1,2,3);
		sb.insert(0, count+"\n");
		System.out.println(sb);
	}

	public static void solve(int n,int start, int and, int end) {
		++count;
		if(n==1) {
//			System.out.println(start+" "+end);
			sb.append(start+" "+end+"\n");
		}else {
			solve(n-1,start,end,and);
			sb.append(start+" "+end+"\n");
//			System.out.println(start+" "+end);
			solve(n-1,and,start,end);
		}
		
		
	}
}
