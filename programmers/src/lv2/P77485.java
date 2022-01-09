package lv2;

public class P77485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static class Value{
        int[][] map;
        int count;
        
        public Value(int[][] map,int count){
            this.map=map;
            this.count=count;
        }
    }
    
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] map=initMap(rows,columns);
        
        for(int i=0;i<queries.length;i++){
            int x1=queries[i][0];
            int y1=queries[i][1];
            int x2=queries[i][2];
            int y2=queries[i][3];
               
            Value value=rotate(x1-1,y1-1,x2-1,y2-1,map);
            map=value.map;
            answer[i]=value.count;
        }
        
        
        return answer;
    }
    
    public static Value rotate(int x1,int y1,int x2,int y2,int[][] map){
        //기준점 좌상 꼭지점
        int temp=map[x1][y1];
        
        //최하값
        int min=map[x1][y1];
        
        //좌
        for(int i=x1;i<x2;i++){
            map[i][y1]=map[i+1][y1];
            if(map[i][y1]<min){
                min=map[i][y1];
            }
        }
        //하
        for(int i=y1;i<y2;i++){
            map[x2][i]=map[x2][i+1];
            if(map[x2][i]<min){
                min=map[x2][i];
            }
        }
        //우
        for(int i=x2;i>x1;i--){
            map[i][y2]=map[i-1][y2];
            if(map[i][y2]<min){
                min=map[i][y2];
            }
        }
        //상
        for(int i=y2;i>y1;i--){
            map[x1][i]=map[x1][i-1];
            if(map[x1][i]<min){
                min=map[x1][i];
            }
        }
        
        map[x1][y1+1]=temp;
        Value value=new Value(map,min);
        return value;
    }
    
    public static int[][] initMap(int row,int columns){
        int[][] map=new int[row][columns];
        int count=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                map[i][j]=count++;
            }
        }
        return map;
    }
}
