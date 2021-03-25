package beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1966 {

	static class Node {
		int value;
		int index;
		
		public Node(int value, int index) {
			super();
			this.value = value;
			this.index = index;
		}
		
		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int TC=Integer.parseInt(br.readLine());
		
		while(TC-->0) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			
			int N=Integer.parseInt(stz.nextToken());
			int M=Integer.parseInt(stz.nextToken());
			
			stz=new StringTokenizer(br.readLine());
			
			LinkedList<Node> qu=new LinkedList<Node>();
			

			for(int i=0;i<N;i++) {
				int temp=Integer.parseInt(stz.nextToken());

				qu.add(new Node(temp,i));
			
			}
			

			int count=0;
			
			while(!qu.isEmpty()) {
				
				boolean flag=true;
				
				for(int i=1;i<qu.size();i++) {
					if(qu.peek().value<qu.get(i).value) {
						flag=false;
						break;
					}
				}
				
				if(flag) {
					count++;
					qu.poll();
					
					if(M==0) {
						break;
					}else {
						M--;
					}
				}else {
					Node temp=qu.poll();
					qu.add(temp);
					M=(M==0) ? qu.size()-1 : --M;
				}
				
			}
			
			System.out.println(count);
		}

	}

}
