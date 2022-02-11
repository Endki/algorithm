package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11557 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int K=Integer.parseInt(br.readLine());
			
			int[] arr=new int[K];
			String[] name=new String[K];
			
			int maxIndex=0;
			int maxValue=0;
			for(int i=0;i<K;i++) {
				String[] input=br.readLine().split(" ");
				name[i]=input[0];
				arr[i]=Integer.parseInt(input[1]);
				if(maxValue<arr[i]) {
					maxValue=arr[i];
					maxIndex=i;
				}
			}
			
			System.out.println(name[maxIndex]);
			
			
		}

	}

}
