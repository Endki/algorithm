import java.util.Scanner;

public class B2739 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		
		for(int i=n;i<=n;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}

	}

}
