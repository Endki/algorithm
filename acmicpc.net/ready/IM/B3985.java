package ready.IM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3985 {

	public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			int L=Integer.parseInt(br.readLine());
			int N=Integer.parseInt(br.readLine());
			
			int[] arr=new int[L+1];
			int[] max=new int[L+1];
			for(int i=1;i<=L;i++) {
				arr[i]=0;
			}
			int gideaMax=Integer.MIN_VALUE;
			int gidae=0;
			for(int k=1;k<=N;k++){
				StringTokenizer stz=new StringTokenizer(br.readLine());
				
				int start=Integer.parseInt(stz.nextToken());
				int end=Integer.parseInt(stz.nextToken());
				if(gideaMax<(end-start)+1) {
					gideaMax=(end-start)+1;
					gidae=k;
				}
				
				
				for(int i=start;i<=end;i++) {
					if(arr[i]==0) {
						arr[i]=k;
					}
				}
			}
			
			for(int i=1;i<=L;i++) {
				max[arr[i]]++;
			}
			int maxNum=Integer.MIN_VALUE;
			int maxIndex=0;
			for(int i=1;i<=L;i++) {
				if(max[i]>maxNum) {
					maxNum=max[i];
					maxIndex=i;
				}
			}
			System.out.println(gidae);
			System.out.println(maxIndex);
	}

}
