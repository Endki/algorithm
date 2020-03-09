import java.util.Scanner;

public class B10824 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] arr=new int[100001];
		int n = input.nextInt();
		int count=0;
		for (int i = 0; i < n; i++) {
			String k=input.next();
			
			if(k.equals("push")) {
				count++;
				int l=input.nextInt();
				arr[count]=l;
			}
			
			
			if(k.equals("pop")) {
				if(count==0) {
					System.out.println(-1);
				}else {
					System.out.println(arr[count]);
					count--;
				}
			}
			
			if(k.equals("size")) {
				System.out.println(count);
			}
			if(k.equals("empty")) {
				if(count==0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}
			
			if(k.equals("top")) {
				if(count==0) {
					System.out.println("-1");
				}else {
				System.out.println(arr[count]);
				}
			}
			
			
		}

	}

}
