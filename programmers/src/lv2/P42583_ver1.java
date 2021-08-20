package lv2;

import java.util.LinkedList;
import java.util.Queue;

public class P42583_ver1 {

	public static void main(String[] args) {
		int[] truck_weights= new int[] {10,10,10,10,10,10,10,10,10,10};
		System.out.println(solution(100, 100, truck_weights));

	}
	
	static class Truck{
		int weight;
		int move;
		
		public Truck(int weight) {
			this.weight = weight;
			this.move = 1;
		}
		
		public void moving() {
			move++;
		}
		
	}
	
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Truck> wait=new LinkedList<Truck>();
        Queue<Truck> move=new LinkedList<Truck>();
        
        for(int i=0;i<truck_weights.length;i++) {
        	wait.add(new Truck(truck_weights[i]));
        }
        
        
        int realWeight=0;
        
        //대기 트럭이 있거나 다리위에 트럭이 있으면 계속 돔
        while(!wait.isEmpty() || !move.isEmpty()) {
        	answer++;
        	
        	//다리위가 비어있으면
        	if(move.isEmpty()) {
        		//대기 트럭에서 하나 뺌
        		Truck t= wait.poll();
        		realWeight+=t.weight;
        		move.add(t);
        		continue;
        	}
        	
        	//모든 트럭의 이동 위치를 +1 해준다. - linkedList기 때문에 모든 인덱스 접근이 가능
        	for(Truck t: move) {
        		t.moving();
        	}
        	
        	//제일 앞의 트럭의 인덱스가 다리의 길이를 벗어나면 = 도착지에 도착하면
        	if(move.peek().move>bridge_length) {
        		Truck t=move.poll();
        		realWeight-=t.weight;
        	}
        	
        	//대기트럭이 비어있지 않고, 현재 무게 + 다음트럭의 무게가 다리가 지탱할 수 있는 무게 일 경우에 
        	if(!wait.isEmpty() && realWeight + wait.peek().weight<=weight) {
        		Truck t=wait.poll();
        		realWeight+=t.weight;
        		move.add(t);
        		
        	}
        }
        return answer;
    }
}
