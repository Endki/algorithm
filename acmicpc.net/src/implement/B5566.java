package implement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5566 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(stz.nextToken());
		int m=Integer.parseInt(stz.nextToken());
		int[] arr=new int[10001];
		int[] arrM=new int[10001];
		int pivot=0,count=0;
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<m;i++) {
			arrM[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<m;i++) {
			
			pivot+=arrM[i];
			pivot+=arr[pivot];
			count++;
			if(pivot>=n-1) {
				break;
			}
			
		}
		System.out.println(count);
		
		
		
	}

}
