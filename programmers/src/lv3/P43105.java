package lv3;

public class P43105 {
    int[] dx=new int[]{1,1};
    int[] dy=new int[]{1,0};
    public int solution(int[][] triangle) {

        for(int i=triangle.length-2;i>-1;i--){
            for(int j=0;j<triangle[i].length;j++){
                if(triangle[i][j]==0){
                    continue;
                }
                
                int rdx=i+dx[0];
                int rdy=j+dy[0];
                    
                int rdx2=i+dx[1];
                int rdy2=j+dy[1];
                    
                triangle[i][j]+=Math.max(triangle[rdx][rdy],triangle[rdx2][rdy2]);
            }
        }
        
        return triangle[0][0];
    }
}
