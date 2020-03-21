import java.util.Scanner;

public class B1075 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int n=input.nextInt();
		int f=input.nextInt();
		
		
		int solve=(n/100)*100;
		
		while(true) {
			if(solve%f==0) {
				int result=solve%100;
				
				if(result<10) {
					System.out.println("0"+result);
				}else {
					System.out.println(result);
				}
				
				return;
				
			}
			solve++;
			
		}
		
		

	}

}
