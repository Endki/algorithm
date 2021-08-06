package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13305 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		int N=Integer.parseInt(br.readLine());
		
		long[] gaps=new long[N-1];
		int[] citys=new int[N];
		
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		for(int i=0;i<N-1;i++) {
			gaps[i]=Integer.parseInt(stz.nextToken());
		}
		
		stz=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			citys[i]=Integer.parseInt(stz.nextToken());
		}

		int indexValue=citys[0]; // 내 현재 위치의 기름값
		int sumLoadValue=0; // 현재+가야할 길 까지의 길의 길이
		long answer=0;// 답
		int index=0; //내 위치
		int nextValue=1; //내 위치에서 다음 위치까지 더해야하는 추가 값
		

		while(true) {
			
			
			//끝 도시에 도달했을 때 종료
			if(index+nextValue>=N) {
				if(index<N) {
					for(int i=index;i<(index+nextValue)-1;i++) {
						answer+=citys[index]*gaps[i];
					}
				}
				break;
			}
			
			
			//다음 도시의 기름값이 내 기름값보다 싸면
			if(citys[index]>citys[index+nextValue]) {
				
				//현재도시*거리 값을 answer에 더해줌
				for(int i=index;i<(index+nextValue);i++) {
					answer+=citys[index]*gaps[i];
				}
				
				//다음 도시로 이동
				index+=nextValue;
				nextValue=0;
			}
			//아니면
			else {
				nextValue++;
			}
			
		}
		System.out.println(answer);
	}

}
