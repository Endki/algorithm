import java.util.Scanner;

public class B4948 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);

		int count=0;
		int tmp=0;
		//�⺻ �Է�
		while(true) {
			int n=input.nextInt();
			count=0;
			
			//n���� 2n���� �ݺ�
			for(int i=n;i<=2*n;i++) {
				
				
				//�Ҽ� �Ǻ�
				for(int j=2;j<n;j++) {
				
					
					//�Ҽ��� �ƴ�
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
