package simulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B1526 {

	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 int n=Integer.parseInt(br.readLine());
		
		 int v=0;
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		if(n>3) {
			q.add(4);
			v=4;
		}
		if(n>6) {
			q.add(7);
			v=7;
		}
		
		
		while(!q.isEmpty()) {
			int k=q.poll();
			k*=10;
			k+=4;
			
			if(k<=n) {
				v=k;
				q.add(k);
			}
			k+=3;
			if(k<=n) {
				v=k;
				q.add(k);
			}
		}
		System.out.println(v);
	}
	
	

}
