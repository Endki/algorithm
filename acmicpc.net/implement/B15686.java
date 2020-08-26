package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class B15686 {

	static int N,M,min;
	static ArrayList<Integer[]> house,chicken;
	static boolean[] visited;
	static int[] output;
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader	br=new BufferedReader(new InputStreamReader(System.in));
		
		
		//N,M
		String[] input=br.readLine().split(" ");
		N=Integer.parseInt(input[0]);
		M=Integer.parseInt(input[1]);
		
		int[][] arr=new int[N][N];
		
//		//집 위치 배열
		house=new ArrayList<Integer[]>();
//		
//		//치킨집 위치 배열
		chicken=new ArrayList<Integer[]>();
		
		//input
		
		for(int i=0;i<N;i++) {
			input=br.readLine().split(" ");
			for(int j=0;j<N;j++) {
				arr[i][j]=Integer.parseInt(input[j]);
				if(arr[i][j]==1) {
					house.add(new Integer[]{i,j});
				}
				if(arr[i][j]==2) {
					chicken.add(new Integer[]{i,j});
				}
			}
		}
		min=Integer.MAX_VALUE;
		
		//치킨 집 선택을 위해 visit, output 선언
		visited=new boolean[chicken.size()];
		output=new int[chicken.size()];
		
		//치킨 집 선택
		for(int i=0;i<chicken.size();i++) {
			visited[i]=true;
			comb(i, 0);
			visited[i]=false;
		}
		//output
		System.out.println(min);

	}
	
	//선택
	public static void comb(int start,int depth) {
	 
		output[depth]=start+1;
		
		for(int i=start;i<chicken.size();i++) {
			
			if(!visited[i]) {
				visited[i]=true;
				comb(i,depth+1);
				visited[i]=false;
			}
		}
		
		
		//치킨집이 선택 
		
		if(depth==M-1) {
			int sum=0;
			int k=0;		
			
			//치킨집 중 가장 최소값
			//집마다 모든 치킨집 선택하여 최소값 비교
			for(int i=0;i<house.size();i++) {
				int result=Integer.MAX_VALUE;
				for(int j=0;j<M;j++) {
					k=calC(house.get(i), chicken.get(output[j]-1));
					result=Math.min(result, k);
				}
				//최소값이면 더한다.
				sum=sum+=result;
			}
			//치킨집 수마다 최소거리중 가장 작은 거리는 선택한다.
			min=Math.min(min, sum);
		}
	}
	
	
	public static int calC(Integer[] integers,Integer[] integers2) {
		return Math.abs(integers[0]-integers2[0])+Math.abs(integers[1]-integers2[1]);
	}
	
	//좌표 클래스
//	class matrix {
//	    int x;
//	    int y;
//	 
//	    matrix(int x, int y) {
//	        this.x = x;
//	        this.y = y;
//	    }
//	}

}
