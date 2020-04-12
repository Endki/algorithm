import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class B2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(br.readLine());
		
		Queue<Integer> qu=new LinkedList<>();
		
		
		
		
		for(int i=0;i<n;i++) {
			qu.offer(i+1);
		}
		
		while(qu.size()>1) {
			qu.poll();
			int k=qu.poll();
			qu.offer(k);
		}
		
		System.out.println(qu.poll());
	}

}
