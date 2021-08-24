package lv2;

import java.util.Arrays;

public class P81302 {
	
	public static void main(String[] args) {
		String[][] places=new String[][] {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		
		System.out.println(Arrays.toString(solution(places)));
		
		
		//문제의 설명이 이상한 문제 
	}
	
	//상-하-좌-우
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	
	
	//왼상-오상-왼하-오하 순
	static int[] cx= {-1,-1,1,1};
	static int[] cy= {-1,1,-1,1};
	
	
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
    	
    	for(int i=0;i<5;i++) {
    		for(int j=0;j<5;j++) {
    			if(room[i][j]=='P') {
    				
    				//상하좌우 탐색
    				for(int k=0;k<4;k++) {
    					int rdx=i+dx[k];
    					int rdy=j+dy[k];
    					
    					if(rdx<0 || rdy<0 || rdx>4 || rdy>4) {
    						continue;
    					}
    					
    					//사방탐색에서 주변에 P가 있으면 out
    					if(room[rdx][rdy]=='P') {
    						return 0;
    					}
    				}
    				
    				//대각탐색
    				for(int k=0;k<4;k++) {
    					int rdx=i+cx[k];
    					int rdy=j+cy[k];
    					
    					if(rdx<0 || rdy<0 || rdx>4 || rdy>4) {
    						continue;
    					}
    					
    					//대각선에 P가 있는 경우
    					if(room[rdx][rdy]=='P') {
    						switch (k) {
    						
							case 0:
								//상-좌 가 O인 경우
								if(room[i+dx[0]][j+dy[0]]=='O' || room[i+dx[2]][j+dy[2]]=='O') {
									return 0;
								}
								break;
							case 1:
								//상-오 가 O인 경우
								if(room[i+dx[0]][j+dy[0]]=='O' || room[i+dx[3]][j+dy[3]]=='O') {
									return 0;
								}
								break;
							case 2:
								//왼하
								if(room[i+dx[1]][j+dy[1]]=='O' || room[i+dx[2]][j+dy[2]]=='O') {
									return 0;
								}
								break;
							case 3:
								//오하
								if(room[i+dx[1]][j+dy[1]]=='O' || room[i+dx[3]][j+dy[3]]=='O') {
									return 0;
								}
								break;
							}
    					}
    				}
    				
    				
    				
    			}
    		}
    	}
    	
    	
    	
    	return 1;
    }
}
