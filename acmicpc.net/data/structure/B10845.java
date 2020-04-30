package data.structure;
import java.util.Scanner;

public class B10845 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr= new int[100001];
		int count=0;
		int m=1;
		for (int i = 0; i < n; i++) {
			String k = input.next();
			
			if (k.equals("push")) {
				int l=input.nextInt();
				count++;
				arr[count]=l;
			}
			if (k.equals("pop")) {
				if(count==0) {
					System.out.println("-1");
				}else {
				m=1;
				System.out.println(arr[1]);
				while(arr[m+1]!=0) {
					arr[m]=arr[m+1];
					m++;
				}
				arr[m+1]=0;
				count--;
				}
				
			}
			if (k.equals("size")) {
				System.out.println(count);
			}
			if (k.equals("empty")) {
				if(count==0) {
					System.out.println("1");
				}else{
					System.out.println("0");
				}
			}
			if (k.equals("front")) {
				if(count==0) {
					System.out.println("-1");
				}else {
					System.out.println(arr[1]);
				}
			}
			if (k.equals("back")) {
				if(count==0) {
					System.out.println("-1");
				}else {
					System.out.println(arr[count]);
				}
			}
		}

	}

}
