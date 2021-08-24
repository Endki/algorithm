package lv2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P81302_ver2 {
	
	public static void main(String[] args) {
		String[][] places=new String[][] {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		
		System.out.println(Arrays.toString(solution(places)));

	}
	
	//상-하-좌-우
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	
    public static int[] solution(String[][] places) {
        int[] answer = new int[5];
        
        for(int i=0;i<5;i++) {
        	
        	//사이즈 
        	char[][] room=new char[5][5];
        	
        	//하나의 방
        	for(int j=0;j<5;j++) {
        		room[j]=places[i][j].toCharArray();
        	}
        	
        	int check=checkRoom(room);
        		
        	if(check==1) {
        		answer[i]=1;
        	}else {
        		answer[i]=0;
        	}
        }
        return answer;
    }
    
    public static int checkRoom(char[][] room) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(room[i][j] == 'P') { 
                	Queue<Node> q = new LinkedList<>(); 
                	 boolean[][] visited = new boolean[5][5];
                     q.offer(new Node(i, j));
                     visited[i][j] = true;
                     
                     while(!q.isEmpty()) {
                         Node current = q.poll();
                         
                         for(int k = 0; k < 4; k++) {
                             int rdx = current.x + dx[k];
                             int rdy = current.y + dy[k];
                             int manhattan = Math.abs(i - rdx) + Math.abs(j - rdy);
                             
                             if(rdx < 0 || rdy < 0 || rdx >= 5 || rdy >= 5) {
                            	 continue;
                             }
                             if(visited[rdx][rdy] || manhattan > 2) {
                            	 continue;
                             }
                             
                             visited[rdx][rdy] = true;
                             if(room[rdx][rdy] == 'X') {
                            	 continue;
                             }
                             else if(room[rdx][rdy] == 'P') {
                            	 return 0;
                             }
                             else {
                            	 q.offer(new Node(rdx, rdy));
                             }
                         }
                     }
                }
            }
        }
        return 1;
    }
    
    public static class Node {
        int x;
        int y;
        
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
