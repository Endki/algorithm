package implement;
import java.util.Scanner;

public class B3023 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int r=input.nextInt();
		int c=input.nextInt();
		
		char[][] solve=new char[2*r][2*c];
		
		
		for(int i=0;i<r;i++) {
			String k=input.next();
			for(int j=0;j<c;j++) {
				//ù ĭ
				solve[i][j]=k.charAt(j);
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				solve[i][2*c-1-j]=solve[i][j];
				
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<2*c;j++) {
				solve[2*r-1-i][j]=solve[i][j];
			}
		}
		

		int a=input.nextInt();
		int b=input.nextInt();
		
		if(solve[a-1][b-1]=='.') {
			solve[a-1][b-1]='#';
		}else {
			solve[a-1][b-1]='.';
		}
		
		
		for(int i=0;i<2*r;i++) {
			for(int j=0;j<2*c;j++) {
				System.out.print(solve[i][j]);
				
			}
			System.out.println();
		}
	}

}
