import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1037 {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;
		
		int n=Integer.parseInt(br.readLine());
		
		int[] arr=new int[n];
		
		stz=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		
		Arrays.parallelSort(arr);
		
		System.out.println((arr[0]*arr[n-1]));

	}

}
