import java.util.Scanner;

public class B4948 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);

		int count=0;
		int tmp=0;
		//기본 입력
		while(true) {
			int n=input.nextInt();
			count=0;
			
			//n에서 2n까지 반복
			for(int i=n;i<=2*n;i++) {
				
				
				//소수 판별
				for(int j=2;j<n;j++) {
				
					
					//소수가 아님
					if(n%j==0) {
					 	
					}else {
						count++;
					}
				}
				
			}
			
			
			 
			
			if(n==0) {
				break;
			}
		}
	}

}
