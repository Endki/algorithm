import java.util.Scanner;

public class B5567 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int m=input.nextInt();
		int friend1,friend2,ans =0;
		
		int[][] arr=new int[n+1][n+1];
		boolean[] invite=new boolean[n+1];
		
		for(int i=0;i<m;i++) {
			friend1=input.nextInt();
			friend2=input.nextInt();
			arr[friend1][friend2]=1;
			arr[friend2][friend1]=1;
		}
		
		for(int i=2; i<n+1;i++) {
			if(arr[1][i]==1) {
				if(!invite[i]) {
					ans++;
					invite[i]=true;
				}
				
				for(int j=2;j<n+1;j++) {
					if(arr[i][j]==1 && !invite[j]) {
						ans++;
						invite[j]=true;
					}
				}
			}
		}
		
		
		System.out.println(ans);

	}

}
