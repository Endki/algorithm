package lv2;

public class P12913 {

	public static void main(String[] args) {
		
	}
    public static int solution(int[][] land) {
        int answer = 0;

        for(int i=1;i<land.length;i++) {
        	
        	for(int j=0;j<4;j++) {
        		int max=0;
        		for(int k=0;k<4;k++) {
        			if(j!=k) {
	        			if(max<land[i-1][k]) {
	        				max=land[i-1][k];
	        			}
        			}
        		}
        		land[i][j]+=max;
        	}
        }
        
        
        for(int i=0;i<4;i++) {
        	if(answer<land[land.length-1][i]) {
        		answer=land[land.length-1][i];
        	}
        }
        
        return answer;
    }
}
