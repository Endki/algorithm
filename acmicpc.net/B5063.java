import java.util.Scanner;

public class B5063 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int n=input.nextInt();
		
		int r=0,e=0,c=0;
		
		for(int i=0;i<n;i++) {
			r=input.nextInt();
			e=input.nextInt();
			c=input.nextInt();
		
			int sum=e-c;
			
			if(r<sum) {
				System.out.println("advertise");
			}else if(r>sum) {
				System.out.println("do not advertise");
			}else {
				System.out.println("does not matter");
			}
			
			
		}
	}

}
