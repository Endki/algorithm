package lv1;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class P12906 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {1,1,3,3,0,1,1})));

	}
	
    public static int[] solution(int []arr) {
        
        
        Deque<Integer> qu=new LinkedList<Integer>();
        
        qu.add(arr[0]);
        
        for(int i=1;i<arr.length;i++) {
        	if(qu.getLast()!=arr[i]) {
        		
        		qu.add(arr[i]);
        		
        	}
        }
        int[] answer=new int[qu.size()];
        
        int index=0;
        while(!qu.isEmpty()) {
        	answer[index++]=qu.poll();
        }

        return answer;
    }
}
