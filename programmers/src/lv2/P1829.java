package lv2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P1829 {

	
	static int dx[]= {0,1,-1,0};
	static int dy[]= {1,0,0,-1};
	
	public static class node {
		int x;
		int y;
		
		public node(int x, int y) {
	
			this.x = x;
			this.y = y;
		}
	}
	
	
	public static void main(String[] args) {
		
		int[][] picture=new int[][] {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		
		System.out.println(Arrays.toString(solution(6, 4, picture)));
		
	}
    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;


        int[] answer = new int[2];
        
        
        boolean[][] visited=new boolean[m][n];
        
        Queue<node> qu=new LinkedList<node>();
        int max=0;
        for(int i=0;i<m;i++) {
        	for(int j=0;j<n;j++) {
        		if(picture[i][j]!=0 && !visited[i][j]) {
        			numberOfArea++;
        			maxSizeOfOneArea=0;
        			qu.add(new node(i,j));
        			visited[i][j]=true;
        			
        			while(!qu.isEmpty()) {
        				node Node=qu.poll();
        				maxSizeOfOneArea++;
        				for(int k=0;k<4;k++) {
        					int rdx=Node.x+dx[k];
        					int rdy=Node.y+dy[k];
        					
        					
        					if(rdx<0 || rdy <0 || rdx>=m || rdy>=n || visited[rdx][rdy] || picture[rdx][rdy]!=picture[Node.x][Node.y]) {
        						continue;
        					}
        					
        					
        					qu.add(new node(rdx,rdy));
        					visited[rdx][rdy]=true;
        				}
        			}
        			
        			if(max<maxSizeOfOneArea) {
        				max=maxSizeOfOneArea;
        			}
        		}
        	}
        }
        
        answer[0] = numberOfArea;
        answer[1] = max;
        
        return answer;
    }


}

