import java.util.Scanner;

public class B15649 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		int M=input.nextInt();
		
		int[] arr=new int[N+1];
		boolean[] visit=new boolean[N+1];
		solve(0,M,N,arr,visit);
		
		

	}
	public static void solve(int count,int M,int N,int[] arr,boolean[] visit) {
		if(count==M) {
			for(int i=0;i<M;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=1;i<=N;i++) {
			if(!visit[i]) {
				visit[i]=true;
				arr[count]=i;
				solve(count+1,M,N,arr,visit);
				visit[i]=false;
			}
			
			
			
			
		}
	}

}
