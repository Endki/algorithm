package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2562 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr=new int[9];
		
		int max=-1;
		int dot=-1;
		
		
		for(int i=0;i<9;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(max<arr[i]) {
				max=arr[i];
				dot=i;
			}
		}
		
		System.out.println(max);
		System.out.println(dot+1);
	}

}
