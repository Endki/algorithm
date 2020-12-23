package ready.IM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1244 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		int N=Integer.parseInt(br.readLine());
		
		int[] arr=new int[N+1];
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		
		int R=Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<R;i++) {
			stz=new StringTokenizer(br.readLine());
			int S=Integer.parseInt(stz.nextToken());
			int num=Integer.parseInt(stz.nextToken());
			
			//남
			if(S==1) {
				int index=2;
				for(int j=num;j<=N;j=num*index++) {
					if(arr[j]==1) {
						arr[j]=0;
					}else {
						arr[j]=1;
					}
					
				}
				
			}
			//여
			else {
				int index=1;
				if(arr[num]==1) {
					arr[num]=0;
				}else {
					arr[num]=1;
				}
				while(true) {
					
					if(num+index>N || num-index<1 ||(arr[num+index]!=arr[num-index])) {
						break;
					}
					if(arr[num+index]==arr[num-index]) {
						if(arr[num+index]==0) {
							arr[num+index]=1;
							arr[num-index]=1;
						}else {
							arr[num+index]=0;
							arr[num-index]=0;
						}
					}
					
					
					index++;
					
				}
				
			}
			
			
		}
		for(int i=1;i<=N;i++) {
			System.out.print(arr[i]+" ");
			if(i%20==0) {
				System.out.println();
			}
		}
	}

}
