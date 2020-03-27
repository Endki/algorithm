import java.util.Scanner;

public class B1992 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		int[][] arr=new int[n][n];
		
		for(int i=0;i<n;i++) {
			String k=input.next();
			for(int j=0;j<n;j++) {
				arr[i][j]=k.charAt(j)-48;
			}
		}
		solve(0,0,n,arr);
	}

	public static void solve(int x,int y,int size,int[][] arr) {
		boolean tag=true;
		for(int i=y;i<y+size;i++) {
			for(int j=x;j<x+size;j++) {
				
				if(arr[y][x]!=arr[i][j]) {
					tag=false;
					break;
				}
			}
		}
		
		if(tag) {
			System.out.print(arr[y][x]);
		}else {
			System.out.print("(");
			solve(x,y,size/2,arr);
			solve(x+size/2,y,size/2,arr);
			solve(x,y+size/2,size/2,arr);
			solve(x+size/2,y+size/2,size/2,arr);
			System.out.print(")");
		}
		
		
		
		
		
	}
}
