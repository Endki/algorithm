package data_structure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B1038_Queue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		if(N>1022) {
			System.out.println(-1);
			return;
		}
		
		if (N < 10) {
			System.out.println(N);
			return;
		}
		
		
		int number=0;
		Queue<Long> qu = new LinkedList<Long>();
		
		for(long i=1;i<10;i++) {
			qu.offer(i);
			number++;
		}
		
		while(number<N) {
			long num=qu.poll();
			
			long temp=num%10;
			
			for(int i=0;i<temp;i++) {
				qu.offer(num*10+i);
				number++;
				if(number==N) {
					System.out.println(num*10+i);
					break;
				}
			}
		}
		

	}

}
