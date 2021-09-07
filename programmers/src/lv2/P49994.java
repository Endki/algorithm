package lv2;

public class P49994 {

	public static int dx[]= {-1,1,0,0};
	public static int dy[]= {0,0,1,-1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int solution(String dirs) {
        int answer = 0;
        boolean[][][][] visited=new boolean[11][11][11][11];
        
        int startX=0;
        int startY=0;
        
        int nextX=5;
        int nextY=5;
        
        int index=0;
        for(int i=0;i<dirs.length();i++) {
        	int order=charToint(dirs.charAt(i));
        	
        	startX=nextX;
        	startY=nextY;
        	
        	nextX+=dx[order];
        	nextY+=dy[order];
        	
        	if(nextX<0 || nextY<0 || nextX>10 || nextY>10) {
        		nextX-=dx[order];
        		nextY-=dy[order];
        		continue;
        	}
        	
        	
        	if(!visited[startX][startY][nextX][nextY] && !visited[nextX][nextY][startX][startY]) {
        		visited[startX][startY][nextX][nextY]=true;
        		visited[nextX][nextY][startX][startY]=true;
        		answer++;
        	}
        	
        }
        
        
        return answer;
    }
	
	
	public static int charToint(char command) {
		switch (command) {
		case 'U':
			return 0;
			
		case 'D':
			
			return 1;
			
		case 'R':
			
			return 2;
			
		case 'L':
			
			return 3;
		}
		return 4;
	}
	
}
