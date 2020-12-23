package simulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2161 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(br.readLine());
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=i+1;
		}
		int temp=0;
		while(n>0) {
			System.out.println(arr[0]);
			for(int i=0;i<n-1;i++) {
				arr[i]=arr[i+1];
			}
			temp=arr[0];
			for(int i=0;i<n-1;i++) {
				arr[i]=arr[i+1];
			}
			if(!(n<2)) {
				arr[n-2]=temp;	
			}
			
			n--;
		}
		
	}

}
