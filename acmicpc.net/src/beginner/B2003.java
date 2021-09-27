package beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2003 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(stz.nextToken());
		long M=Long.parseLong(stz.nextToken());
		
		int[] arr=new int[N+1];
		
		stz=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		
		int start=0;
		int end=0;
		int sum=0;
		
		int count=0;
		while(end<=N) {
			if(sum>=M) {
				sum-=arr[start++];
			}else if(sum<M) {
				sum+=arr[end++];
			}
			
			if(sum==M) {
				count++;
			}
		}

		System.out.println(count);
	}

}
