package data_Structure;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{2, 1,3,2},2));
	}
    static public int solution(int[] priorities, int location) {
		int answer = 0;
		
		Queue<Integer> wait = new LinkedList<Integer>();
		Queue<Integer> print = new LinkedList<Integer>();
		Queue<Integer> middle = new LinkedList<Integer>();
		
		Queue<Integer> waitIndex = new LinkedList<Integer>();
		Queue<Integer> printIndex = new LinkedList<Integer>();
		Queue<Integer> middleIndex = new LinkedList<Integer>();


		for (int i = 0; i < priorities.length; i++) {

			wait.offer(priorities[i]);
			waitIndex.offer(i);
		}
		
		

		while(print.size()!=priorities.length) {
			boolean flag=false;	
			//제일 앞에 것 뺸다.
			int k=wait.poll();
			int kIndex=waitIndex.poll();
			
			//비교한다
			
			while(!wait.isEmpty()) {
				if(k<wait.peek()) {
					flag=true;
				}
				middle.offer(wait.poll());
				middleIndex.offer(waitIndex.poll());
			}
			
			while(!middle.isEmpty()) {
				wait.offer(middle.poll());
				waitIndex.offer(middleIndex.poll());
			}
			
			
			if(flag) {
				wait.offer(k);
				waitIndex.offer(kIndex);
			}else {
				print.offer(k);
				printIndex.offer(kIndex);
			}
			
			
			
		}
		
		int count=1;
		while(!printIndex.isEmpty()) {
			
			if(printIndex.poll()==location) {
				break;
			}
			count++;
		}
		answer=count;
		return answer;
    }
}
