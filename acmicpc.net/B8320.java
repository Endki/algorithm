import java.util.Scanner;

public class B8320 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		int ans=0;

		for(int i=1;i<=n;i++) {
			for(int j=i;j*i<=n;j++) {
				ans++;
			}
		}
		
		
		System.out.println(ans);
	}

}
