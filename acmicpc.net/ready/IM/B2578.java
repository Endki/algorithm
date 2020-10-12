package ready.IM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2578 {
	static int[][] chulsu;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		chulsu=new int[5][5];
		
		
		//input
		for(int i=0;i<5;i++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			for(int j=0;j<5;j++) {
				chulsu[i][j]=Integer.parseInt(stz.nextToken());
			}
		}
		int count=0;
		for(int i=0;i<5;i++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			for(int j=0;j<5;j++) {
				int num=Integer.parseInt(stz.nextToken());
				
				CheckArr(num);
				count++;
				if(isCheck_Bingo()) {
					System.out.println(count);
					return;
				}
			}
		}
	}
	
	public static void CheckArr(int num) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(chulsu[i][j]==num) {
					chulsu[i][j]=0;
				}
			}
		}
	}
	
	public static boolean isCheck_Bingo() {
		//세로 체크
		int num=0;
		boolean swt=false;
		for(int i=0;i<5;i++) {
			if(chulsu[0][i]==0) {
				swt=true;
				for(int j=1;j<5;j++) {
					if(chulsu[j][i]!=0) {
						swt=false;
						break;
					}
				}
				if(swt) {
					num+=1;
				}
			}
		}
		//가로체크
		
		for(int i=0;i<5;i++) {
			if(chulsu[i][0]==0) {
				swt=true;
				for(int j=1;j<5;j++) {
					if(chulsu[i][j]!=0) {
						swt=false;
						break;
					}
				}
				if(swt) {
					num+=1;
				}
			}
		}
		//대각선 체크
		swt=true;
		if(chulsu[0][0]==0) {
			for(int i=1;i<5;i++) {
				if(chulsu[i][i]!=0) {
					swt=false;
					break;
				}
			}
			if(swt) {
				num+=1;
			}
		}
		swt=true;
		if(chulsu[4][0]==0) {
			for(int i=1;i<5;i++) {
				if(chulsu[4-i][i]!=0) {
					swt=false;
					break;
				}
			}
			if(swt) {
				num+=1;
			}
		}
		if(num>=3) {
			
			return true;
		}
		
		return false;
	}

}
