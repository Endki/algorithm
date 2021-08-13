package lv1;

import java.util.Stack;

public class P64061 {

	public static void main(String[] args) {
		int[][] board=new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves=new int[] {1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board, moves));

	}
    static public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket=new Stack<Integer>();
        
        
       
        for(int i=0;i<moves.length;i++) {
        	//0부터 board.length-1 까지 내려가야댐
        	
        	for(int j=0;j<board.length;j++) {
        		if(board[j][moves[i]-1]!=0) {
        			if(!bucket.isEmpty()) {
        				if(bucket.peek()==board[j][moves[i]-1]) {
        					bucket.pop();
        					answer+=2;
        				}else {
        					bucket.push(board[j][moves[i]-1]);
        				}
        				
        				
        			}else{
        				bucket.push(board[j][moves[i]-1]);
        			}
        			
        			
        			
        			board[j][moves[i]-1]=0;
        			break;
        		}
        	}
        	
        	
        }
        
        
        return answer;
    }
}
