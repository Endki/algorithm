package implement;
import java.util.Scanner;

public class B2563 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		int[][] arr=new int[101][101];
		int count=0;
		
		for(int i=0;i<n;i++) {
			int x=input.nextInt();
			int y=input.nextInt();
			
			
			for(int j=0;j<10;j++) {
				for(int k=0;k<10;k++) {
					arr[x+j][y+k]=1;
				}
			}
			
		}

		
		for(int i=0;i<100;i++){
			for(int j=0;j<100;j++) {
				if(arr[i][j]==1) {
					count+=1;
				}
			}
		}
		System.out.println(count);
	}

}
