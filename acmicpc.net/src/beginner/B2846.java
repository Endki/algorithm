package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2846 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int[] arr=new int[N];
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		
		int startValue=arr[0];
		int maxValue=0;
		for(int i=0;i<N-1;i++) {
			
			if(arr[i]>=arr[i+1]) {
				maxValue=Math.max(arr[i]-startValue, maxValue);
				startValue=arr[i+1];
				
			}
			
			if(i==N-2) {
				maxValue=Math.max(arr[i+1]-startValue, maxValue);
			}
			

		}
		System.out.println(maxValue);
		

	}

}
