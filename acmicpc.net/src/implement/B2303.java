package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2303 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int[] maxA=new int[N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			
			int[] arr=new int[5];
			for(int j=0;j<5;j++) {
				arr[j]=Integer.parseInt(stz.nextToken());
			}
			
			
			for(int a=0;a<5;a++) {
				for(int b=0;b<5;b++) {
					for(int c=0;c<5;c++) {
						if(a==b || b==c || c==a) {
							continue;
						}
						
						int sum=arr[a]+arr[b]+arr[c];
						sum%=10;
						
						if(maxA[i]<sum) {
							maxA[i]=sum;
						}
					}
				}
			}
		}
		int maxI=-1;
		int max=0;
		for(int i=0;i<N;i++) {
			
			if(max<=maxA[i]) {
				max=maxA[i];
				maxI=i+1;
			}
			
		}
		System.out.println(maxI);

	}

}
