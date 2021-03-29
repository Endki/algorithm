import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SW2477 {
	public static class Customer {
		int soon;
		int time;
		
		public Customer(int soon, int time) {
			this.soon = soon;
			this.time = time;
		}
		
		
	}
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		for(int TC=1;TC<=T;TC++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			
			
			//input 
			//접수창구 수
			int N=Integer.parseInt(stz.nextToken());
			//정비창구 수
			int M=Integer.parseInt(stz.nextToken());
			//고객 수
			int K=Integer.parseInt(stz.nextToken());
			
			//찾아야 하는 고객의 접수 창구번호, 정비 창구번호
			int A=Integer.parseInt(stz.nextToken());
			int B=Integer.parseInt(stz.nextToken());
			
			//접수 정비
			int[] nTime=new int[N+1];
			int[] mTime=new int[M+1];
			
			//접수
			for(int i=1;i<=N;i++) {
				nTime[i]=Integer.parseInt(br.readLine());
			}
			//정비
			for(int i=1;i<=N;i++) {
				mTime[i]=Integer.parseInt(br.readLine());
			}
			
			
			stz=new StringTokenizer(br.readLine());
			Queue<Customer> CustomerQu=new LinkedList<Customer>();
			
			//qu에 고객번호와 도착 시간 저장
			for(int i=1;i<=K;i++) {
				int kTime=Integer.parseInt(stz.nextToken());
				CustomerQu.add(new Customer(i, kTime));
				
			}			
			//창구 도착확인용 visited 0=접수창구 1=정비창구
			boolean[][] visited=new boolean[K+1][2];
			
			
//			1000초?  고객이 대기열에 없을때 까지
			for(int Time=1;Time<=1000;Time++) {
				
				while(CustomerQu.peek().time<=Time) {
					
					
					
				}
			}
		}
		
	}

}
