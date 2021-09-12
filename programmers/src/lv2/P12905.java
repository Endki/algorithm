package lv2;

public class P12905 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int solution(int [][]board)
    {
        int answer = 0;

        //dp문제 
        //기존 사각형보다 큰 사각형 1개 만들기
        
        
        int[][] arr = new int[board.length+1][board[0].length+1];
        
        
        //테두리가 0 인 사각형이 만들어지게된다.
        for(int i = 0 ; i < board.length ; i++) {
        	for(int j = 0 ; j <board[0].length ; j++) {
        		if(board[i][j]==1) {
        			arr[i+1][j+1] = 1;
        		}
        		else {
        			arr[i+1][j+1] = 0;
        		}
        	}
        	
        }
        
        //좌,좌상,상 의 3군데를 비교해서 최소값을 찾은 후에
        //현재는 그 최소값의 +1 을 해준 값을 넣는다.
        //답은 그 값과 현재값 중 높은값 - 정사각형 한변의 길이가 된다.
        for(int i = 1 ; i < arr.length; i++) {
        	for(int j = 1 ; j < arr[0].length ; j++) {
        		if(arr[i][j]==1) {
        			int min = Math.min(arr[i-1][j], arr[i][j-1]);
        			min = Math.min(min, arr[i-1][j-1]);
        			
        			arr[i][j] = min + 1;
        			answer = Math.max(answer, arr[i][j]);
        		}
        	}
        }
        

        return answer*answer;
    }
}
