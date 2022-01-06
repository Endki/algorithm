
public class P12978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int solution(int N, int[][] road, int K) {
	        int answer = 0;
	        
	        int[][] map=new int[N+1][N+1];
	        for(int i=0;i<=N;i++){
	            for(int j=0;j<=N;j++){
	                if(i==j){
	                    continue;
	                }
	                map[i][j]=500001;
	            }
	        }
	        //map init
	        for(int i=0;i<road.length;i++){
	            if(map[road[i][0]][road[i][1]]>road[i][2]){
	                map[road[i][0]][road[i][1]]=road[i][2];
	                map[road[i][1]][road[i][0]]=road[i][2];
	            }
	        }    
	        
	        for(int k=1;k<=N;k++){
	            for(int i=1;i<=N;i++){
	                for(int j=1;j<=N;j++){
	                    if(i==j){
	                        continue;
	                    }
	                    if(map[i][k]+map[k][j]<map[i][j]){
	                        map[i][j]=map[i][k]+map[k][j];
	                    }
	                }
	            }
	        }
	        
	        for(int i=1;i<=N;i++){
	            if(map[1][i]<=K){
	                answer++;
	            }
	        }
	        
	        
	        return answer;
	    }
	}
}
