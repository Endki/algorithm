package data_structure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B11866 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] input=br.readLine().split(" ");
		
		int N=Integer.parseInt(input[0]);
		int K=Integer.parseInt(input[1]);
		
		Queue<Integer> qu=new LinkedList<Integer>();
		
		for(int i=1;i<=N;i++) {
			qu.add(i);
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append("<");
		while(N-->0) {
			if(qu.size()==1) {
				break;
			}
			for(int i=0;i<K-1;i++) {
				qu.add(qu.poll());
			}
			sb.append(qu.poll()).append(", ");
		}
	
		sb.append(qu.poll()).append(">");
		System.out.println(sb.toString());
	}
}
