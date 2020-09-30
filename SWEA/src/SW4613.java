import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW4613 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int TC=Integer.parseInt(br.readLine());
		
		for(int T=1;T<=TC;T++) {
			String[] input=br.readLine().split(" ");
			
			int N=Integer.parseInt(input[0]);
			int M=Integer.parseInt(input[1]);
			
			//각 라인별로 갯수 체크 하기위한 배열 선언
			int[] W=new int[N];
			int[] B=new int[N];
			int[] R=new int[N];
			
			
			for(int i=0;i<N;i++) {
				String line=br.readLine();
				for(int j=0;j<M;j++) {
					char lineTochar=line.charAt(j);
					if(lineTochar=='W') {
						W[i]++;
					}else if(lineTochar=='B') {
						B[i]++;
					}else {
						R[i]++;
					}
				}
			}
			
			int sum=0;
			//solve
			//가운데 끼인 것
			for(int i=1;i<N-1;i++) {
				for(int j=i;j<N-1;j++) {
					int W_Count=0;
					int B_Count=0;
					int R_Count=0;
					
					//제일 위부터
					for(int k=0;k<i;k++) {
						W_Count+=W[k];
					}
					//흰 부분이 끝난 부분부터
					for(int k=i;k<j+1;k++) {
						B_Count+=B[k];
					}
					//마지막까지
					for(int k=j+1;k<N;k++) {
						R_Count+=R[k];
					}
					
					
					sum=Math.max(sum, W_Count+B_Count+R_Count);
				}
			}
			sum=(N*M)-sum;
			
			
			System.out.println("#"+T+" "+sum);
			
		}
		
	}

}
