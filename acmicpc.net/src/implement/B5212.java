package implement;
import java.util.Scanner;

public class B5212 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int r=input.nextInt();
		int c=input.nextInt();
		
		char[][] arr=new char[r+2][c+2];
		char[][] mirror=new char[r+2][c+2];
		for(int i=0;i<r+2;i++) {
			for(int j=0;j<c+2;j++) {
				arr[i][j]='.';
			}
		}
		
		for(int i=1;i<r+1;i++) {
			String k=input.next();
			for(int j=1;j<c+1;j++) {
				arr[i][j]=k.charAt(j-1);
				mirror[i][j]=arr[i][j];
			}
		}
		
	
		for(int i=1;i<r+1;i++) {
			for(int j=1;j<c+1;j++) {
				solve(i,j,arr,mirror);
			}
		}
		
		int startX=0;
		int endX=0;
		int startY=0;
		int endY=0;
		
		for(int i=1;i<r+1;i++) {
			for(int j=1;j<c+1;j++) {
				if(mirror[i][j]=='X' && startX==0) {
					startX=i;
				}
				if(mirror[i][j]=='X') {
					endX=i;
					endY=j;
				}
			}
		}
		

		
		for(int i=1;i<c+1;i++) {
			for(int j=1;j<r+1;j++) {
				
				if(mirror[j][i]=='X' && startY==0) {
					startY=i;
				}
				
				if(mirror[j][i]=='X') {
					endY=i;
				}
			}
		}
		
		
		//Ãâ·Â
		
		for(int i=startX;i<=endX;i++) {
			for(int j=startY;j<=endY;j++) {
				System.out.print(mirror[i][j]);
			}
			System.out.println();
		}
	}

	public static void solve(int x,int y,char[][] arr,char[][] mirror) {
		int count=0;
		if(arr[x][y]=='.') {
			return;
		}else {
			if(arr[x-1][y]=='.') {
				count++;
			}
			if(arr[x][y-1]=='.') {
				count++;
			}
			if(arr[x+1][y]=='.') {
				count++;
			}
			if(arr[x][y+1]=='.') {
				count++;
			}
			if(count>=3) {
				mirror[x][y]='.';
			}
		}
		
		
		
	}
}
