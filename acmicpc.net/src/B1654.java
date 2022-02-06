import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1654 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().split(" ");
		int K=Integer.parseInt(input[0]);
		int N=Integer.parseInt(input[1]);
		
		int[] arr=new int[K];
		long max=0;
		
		for(int i=0;i<K;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			max=Math.max(arr[i], max);
		}
		
		
		max+=1;
		
		
		long min=0;
		long mid=0;
		
		while(min<max) {
			mid=(max+min)/2;
			long count=0;
			
			for(int i=0;i<K;i++) {
				count+=arr[i]/mid;
			}
			
			if(count<N) {
				max=mid;
			}else {
				min=mid+1;
			}
			
		}
		System.out.println(min-1);
	}

}
