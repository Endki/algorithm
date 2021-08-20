package lv2;

import java.util.LinkedList;
import java.util.Queue;

public class P42583_ver1 {

	public static void main(String[] args) {
		int[] truck_weights= new int[] {10,10,10,10,10,10,10,10,10,10};
		System.out.println(solution(100, 100, truck_weights));

	}
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> middle=new LinkedList<Integer>();
        Queue<Integer> end=new LinkedList<Integer>();
        
        for(int i=0;i<bridge_length;i++) {
        	middle.add(0);
        }
        
        
        int realWeight=0;
        int index=0;
        
        while(end.size()!=truck_weights.length) {
        	
        	//1초가 지나면 맨앞의 트럭을 제외함
        	if(middle.peek()!=0) {
        		realWeight-=middle.peek();
        		end.add(middle.poll());
        	}else {
        		middle.poll();
        	}
        	
        	//다리에 오르는 과정 
        	//다리가 견딜수 있는 무게 , 대기 트럭이 남아있으면  다리에 트럭을 올린다.
        	if(index<truck_weights.length && realWeight+truck_weights[index]<=weight) {
        		middle.add(truck_weights[index]);
        		realWeight+=truck_weights[index];
        		index+=1;
        	}
        	//아니면 0을 올림 
        	else {
        		middle.add(0);
        	}
        	
        	answer++;
        }
        
        
        
        
        
        return answer;
    }
}
