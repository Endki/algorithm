import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class B2346 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		int N=Integer.parseInt(br.readLine());
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		Deque<bollon> dq=new ArrayDeque<bollon>();
//		Deque<bollon> dq=new LinkedList<bollon>();
		for(int i=1;i<=N;i++) {
			dq.add(new bollon(i,Integer.parseInt(stz.nextToken())));
		}
		StringBuilder sb=new StringBuilder();

		while(!dq.isEmpty()) {
			
			bollon peek=dq.pollFirst();
			sb.append(peek.index).append(" ");
			
			if(dq.isEmpty()) {
				break;
			}
			
			if(peek.value>0) {
				for(int i=0;i<peek.value-1;i++) {
					dq.add(dq.pollFirst());
				}
			}else {
				for(int i=0;i<Math.abs(peek.value);i++) {
					dq.addFirst(dq.pollLast());
				}
			}

		}
		System.out.println(sb.toString());
	}
	
	public static class bollon{
		int index;
		int value;
		
		public bollon(int index, int value) {
			this.index = index;
			this.value = value;
		}
		
		
	}

}
