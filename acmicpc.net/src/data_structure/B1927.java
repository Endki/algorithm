package data_structure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class B1927 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		int N=Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			int K=Integer.parseInt(br.readLine());
			if(K!=0) {
				pq.add(K);
			}else {
				if(pq.size()==0) {
					System.out.println(0);
				}else {
					System.out.println(pq.poll());
				}
			}
		}
		
	}

}
