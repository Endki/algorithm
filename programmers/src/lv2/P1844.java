package lv2;
import java.util.LinkedList;
import java.util.Queue;

public class P1844 {
	 int[] dx=new int[]{0,0,-1,1};
	    int[] dy=new int[]{1,-1,0,0};
	    public int solution(int[][] maps) {
	        int answer = 0;
	        
	        boolean[][] visited=new boolean[maps.length][maps[0].length];
	        
	        Queue<int[]> qu=new LinkedList<int[]>();

	                
	                    visited[0][0]=true;
	                    qu.add(new int[]{0,0});
	                    
	                    while(!qu.isEmpty()){
	                        int[] indexArr=qu.poll();
	                        int indexX=indexArr[0];
	                        int indexY=indexArr[1];
	                        for(int k=0;k<4;k++){
	                            int rdx=indexX+dx[k];
	                            int rdy=indexY+dy[k];
	                            
	                            if(rdx<0 || rdy<0 || rdx>=maps.length || rdy>=maps[0].length || visited[rdx][rdy] || maps[rdx][rdy]==0){
	                                continue;
	                            }
	                            visited[rdx][rdy]=true;
	                            maps[rdx][rdy]=maps[indexX][indexY]+1;
	                            qu.add(new int[]{rdx,rdy});
	                        }
	                    }
	                    
	                
	            
	        
	        if(maps[maps.length-1][maps[0].length-1]==1){
	            answer=-1;
	        }else{
	            answer=maps[maps.length-1][maps[0].length-1];
	        }
	        
	        
	        return answer;
	    }
}
