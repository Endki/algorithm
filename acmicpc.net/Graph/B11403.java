package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B11403 {
	static int[][] arr;
	static int N;
	static Queue<Integer> quX=new LinkedList<Integer>();
	static Queue<Integer> quY=new LinkedList<Integer>();
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;
		N=Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<N;i++) {
			stz=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j]=Integer.parseInt(stz.nextToken());
				if(arr[i][j]==1) {
					quX.offer(i);
					quY.offer(j);
				}
			}
		}
		
		
		while(!quY.isEmpty()) {
			int X=quX.poll();
			int Y=quY.poll();
			
			arr[X][Y]=1;
			for(int i=0;i<N;i++) {
				
			}
		}
		
	}

}
