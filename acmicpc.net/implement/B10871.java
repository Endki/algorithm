package implement;
import java.util.Scanner;

public class B10871 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int[] k=new int[10001];

		int a=input.nextInt();
		int b=input.nextInt();


		for(int i=0;i<a;i++) {
			k[i]=input.nextInt();
		}

		for(int j=0;j<a;j++) {
			if(k[j]<b) {
				System.out.print(k[j]+" ");
			}
		}
		System.out.println();
	}

}
