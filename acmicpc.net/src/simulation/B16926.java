package simulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B16926 {

	static int N,M;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(stz.nextToken());
		M=Integer.parseInt(stz.nextToken());
		int R=Integer.parseInt(stz.nextToken());
		
		
		int[][] arr=new int[N][M];
		
		for(int i=0;i<N;i++) {
			stz=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arr[i][j]=Integer.parseInt(stz.nextToken());
			}
		}
		for(int i=0;i<R;i++) {
			rotate(arr);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void rotate(int[][] arr) {
		
		int pivot=0;
		
		int len=Math.min(M, N)/2;
		
		for(int i=0;i<len;i++) {
			pivot=arr[i][i];
			
			
			//위
			for(int j=i;j<(M-i)-1;j++) {
				arr[i][j]=arr[i][j+1];
			}
			
			//오른쪽
			for(int j=i;j<(N-i)-1;j++) {
				arr[j][M-i-1]=arr[j+1][M-i-1];
			}
			
			//아래
			for(int j=M-i-1;j>i;j--) {
				arr[N-i-1][j]=arr[N-i-1][j-1];
			}
			
			//제일 왼쪽
			for(int j=(N-1)-i;j>i;j--) {
				arr[j][i]=arr[j-1][i];
			}
			
			arr[i+1][i]=pivot;
		}
		
	}

}
