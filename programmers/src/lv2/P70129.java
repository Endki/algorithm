package lv2;

import java.util.LinkedList;
import java.util.Queue;

public class P70129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        Queue<Character> qu=new LinkedList<Character>();
        String temp=s;
        
        int zeroCount=0;
        int parseCount=0;
        
        while(!temp.equals("1")) {
        	parseCount++;
	        for(int i=0;i<temp.length();i++) {
	        	if(temp.charAt(i)=='1') {
	        		qu.add('1');
	        	}else if(temp.charAt(i)=='0') {
	        		zeroCount++;
	        	}
	        }
	        StringBuilder sb=new StringBuilder();
	        
	        while(!qu.isEmpty()) {
	        	sb.append(qu.poll());
	        }
	        int parse=sb.toString().length();
	        temp=Integer.toBinaryString(parse);
	        
        }
        answer[0]=parseCount;
        answer[1]=zeroCount;
        
        return answer;
    }
}
