package ready.IM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2564 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stz = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(stz.nextToken());
		int M = Integer.parseInt(stz.nextToken());
		int storeCount = Integer.parseInt(br.readLine());
		
		int[] value=new int[storeCount+1];
		
		for (int i = 0; i <= storeCount; i++) {
			stz = new StringTokenizer(br.readLine());
			int direction=Integer.parseInt(stz.nextToken());
			int cost=Integer.parseInt(stz.nextToken());
			
			switch (direction) {
			case 1:
				value[i]=cost;
				break;
			case 2:
				value[i]=2*N+M-cost;
				break;
			case 3:
				value[i]=2*(N+M)-cost;
				break;
			case 4:
				value[i]=N+cost;
				break;

			}
		}
		
		int sum=0;
		for(int i=0;i<storeCount;i++) {
			int temp=Math.abs(value[storeCount]-value[i]);
			if(temp>(N+M)) {
				sum+=2*(N + M) - temp ;
			}else {
				sum+=temp;
			}
		}
		System.out.println(sum);


	}
}
