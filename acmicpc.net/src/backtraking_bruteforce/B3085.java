package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3085 {
	static int max=0;
	static int N;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		char[][] map=new char[N][N];
		for(int i=0;i<N;i++) {
			map[i]=br.readLine().toCharArray();
		}
		
		//가로
		for(int i=0;i<N;i++) {
			for(int j=0;j<N-1;j++) {
				if(map[i][j]!=map[i][j+1]) {
					char temp=map[i][j];
					
					map[i][j]=map[i][j+1];
					map[i][j+1]=temp;
					
					arrCheck(map);
					
					map[i][j+1]=map[i][j];
					map[i][j]=temp;
					
				}
			}
		}
		
		//세로
		for(int i=0;i<N;i++) {
			for(int j=0;j<N-1;j++) {
				if(map[j][i]!=map[j+1][i]) {
					char temp=map[j][i];
					
					map[j][i]=map[j+1][i];
					map[j+1][i]=temp;
					
					arrCheck(map);
					
					map[j+1][i]=map[j][i];
					map[j][i]=temp;
					
				}
			}
		}
		System.out.println(max);
	}
	public static void arrCheck(char[][] map) {
		//가로
		for(int i=0; i<N;i++) {
			int count=1;
			
			for(int j=0;j<N-1;j++) {
				if(map[i][j]==map[i][j+1]) {
					count++;
				}else {
					count=1;
				}
				
				max=Math.max(count, max);
			}
		}
		
		
		//세로
		for(int i=0; i<N;i++) {
			int count=1;
			
			for(int j=0;j<N-1;j++) {
				if(map[j][i]==map[j+1][i]) {
					count++;
				}else {
					count=1;
				}
				
				max=Math.max(count, max);
			}
		}
	}
}
