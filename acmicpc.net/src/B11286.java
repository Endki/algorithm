import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class B11286 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		PriorityQueue<Integer> plusPQ=new PriorityQueue<Integer>();
		PriorityQueue<Integer> minusPQ=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0;i<N;i++) {
			int K=Integer.parseInt(br.readLine());
			
			if(K>0) {
				plusPQ.add(K);
			}else if(K<0) {
				minusPQ.add(K);
			}else {
				if(plusPQ.isEmpty() && minusPQ.isEmpty()) {
					System.out.println(0);
					continue;
				}
				
				if(minusPQ.isEmpty()) {
					System.out.println(plusPQ.poll());
					
				}else {
					if(plusPQ.isEmpty()) {
						System.out.println(minusPQ.poll());
					}else {
						if(Math.abs(plusPQ.peek())<Math.abs(minusPQ.peek())) {
							System.out.println(plusPQ.poll());
						}else {
							System.out.println(minusPQ.poll());
						}
					}
					
				}
				
				
			}
		}

	}

}
