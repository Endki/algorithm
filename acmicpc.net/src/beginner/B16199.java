package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B16199 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int[] arr=new int[3];
		
		//어떤사람
		for(int i=0;i<3;i++) {
			arr[i]=-Integer.parseInt(stz.nextToken());
		}
		
		
		//기준
		stz=new StringTokenizer(br.readLine());
		for(int i=0;i<3;i++) {
			arr[i]+=Integer.parseInt(stz.nextToken());
		}
		
		
		
		if(arr[1]>0) {
			System.out.println(arr[0]);
		}else if(arr[1]<0) {
			System.out.println(arr[0]-1);
		}else {
			if(arr[2]>=0) {
				System.out.println(arr[0]);
			}else {
				System.out.println(arr[0]-1);
			}
			
			
		}
		
		
		System.out.println(arr[0]+1);
		System.out.println(arr[0]);
	}

}
