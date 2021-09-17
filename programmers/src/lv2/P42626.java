package lv2;

import java.util.PriorityQueue;

public class P42626 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        
        
        for(int i=0;i<scoville.length;i++) {
        	pq.add(scoville[i]);
        }
        
        while(true) {
        	
        	if(pq.peek()>=K || pq.size()==1) {
        		break;
        	}
        	
        	answer++;
        	int first=pq.poll();
        	int second=pq.poll();
        	
        	pq.add(first+(second*2));
        	
        	
        	
        }
        if(pq.peek()<K) {
        	return -1;
        }
        return answer;
    }
}
