import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2559 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer( br.readLine());
		
		int N=Integer.parseInt(stz.nextToken());
		int K=Integer.parseInt(stz.nextToken());
		
		int[] arr=new int[N];
		
		stz=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		
		
		int pointA=0;
		int pointB=K;
		
		int max=0;
		
		for(int i=0;i<K;i++) {
			max+=arr[i];
		}
		int temp=max;
		while(true) {
			if(pointB==N) {
				break;
			}
			
			
			
			temp-=arr[pointA++];
			temp+=arr[pointB++];
			
			max=Math.max(max, temp);
			
			
		}
		System.out.println(max);
	}

}
