import java.util.Scanner;

public class B12813 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		String a=input.next();
		String b=input.next();
		
		char[] arrA=new char[100001];
		char[] arrB=new char[100001];
		
		//and
		for(int i=0;i<100000;i++) {
			arrA[i]=a.charAt(i);
			arrB[i]=b.charAt(i);
			if(a.charAt(i)=='0' && b.charAt(i)=='0' ) {
				System.out.print(0);
			}else if(a.charAt(i)=='1' && b.charAt(i)=='1' ) {
				System.out.print(1);
			}else {
				System.out.print(0);
			}
		}
		System.out.println();
		
		//or
		for(int i=0;i<100000;i++) {
			if(a.charAt(i)=='0' && b.charAt(i)=='0') {
				System.out.print(0);
			}else {
				System.out.print(1);
			}
		}
		System.out.println();
		
		
		//nor
		for(int i=0;i<100000;i++) {
			if(a.charAt(i)==b.charAt(i)) {
				System.out.print(0);
			}else {
				System.out.print(1);
			}
		}
		System.out.println();
		
		//not A
		for(int i=0;i<100000;i++) {
			if(a.charAt(i)=='0') {
				System.out.print(1);
			}else {
				System.out.print(0);
			}
		}
		System.out.println();

		//not B
		for(int i=0;i<100000;i++) {
			if(b.charAt(i)=='0') {
				System.out.print(1);
			}else {
				System.out.print(0);
			}
		}
		System.out.println();
	}

}
