import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B14503 {
	
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] k=br.readLine().split(" ");
		int n=Integer.parseInt(k[0]);
		int m=Integer.parseInt(k[1]);
		
		int[][] arr=new int[n][m];
		
		k=br.readLine().split(" ");
		int startX=Integer.parseInt(k[0]);
		int startY=Integer.parseInt(k[1]);
		int position=Integer.parseInt(k[2]);
		
		for(int i=0;i<n;i++) {
			k=br.readLine().split(" ");
			for(int j=0;j<m;j++) {
				arr[i][j]=Integer.parseInt(k[j]);
			}
		}
		arr[startX][startY]=-1;
		int count=1;
		
		while(true) {
			if(arr[startX][startY]==0) {
				arr[startX][startY]=-1;
				count++;
			}
			if(arr[startX][startY-1]!=0 && arr[startX][startY+1]!=0 && arr[startX-1][startY]!=0 && arr[startX+1][startY]!=0) {
				if(position==0) {
					if(arr[startX+1][startY]==1) {
						break;
					}
					startX+=1;
					
				}else if(position==1) {
					if(arr[startX][startY-1]==1) {
						break;
					}
					startY-=1;
					
				}else if(position==2) {
					if(arr[startX-1][startY]==1) {
						break;
					}
					startX-=1;
					
				}else if(position==3) {
					if(arr[startX][startY+1]==1) {
						break;
					}
					startY+=1;
				}
			}else {
			if(position==0) {
				if(arr[startX][startY-1]==0) {
					startY-=1;
					position=3;	
				}else {
					position=3;	
				}
			}else if(position==1) {
				if(arr[startX-1][startY]==0) {
					startX-=1;
					position=0;
				}else {
					position=0;
				}
			}else if(position==2) {
				if(arr[startX][startY+1]==0) {
					startY+=1;
					position=1;
				}else {
					position=1;
				}
			}else if(position==3) {
				if(arr[startX+1][startY]==0) {
					startX+=1;
					position=2;
				}else {
					position=2;
				}
			}
			}
		}
		System.out.println(count);
	}

}
