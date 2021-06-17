package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B20361 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(stz.nextToken());
		int X=Integer.parseInt(stz.nextToken());
		int K=Integer.parseInt(stz.nextToken());
		
		boolean temp=false;
		boolean[] arr=new boolean[N+1];
		
		arr[X]=true;
		while(K-->0) {
			stz=new StringTokenizer(br.readLine());
			
			int firstIndex=Integer.parseInt(stz.nextToken());
			int secondIndex=Integer.parseInt(stz.nextToken());
			
			temp=arr[firstIndex];
			arr[firstIndex]=arr[secondIndex];
			arr[secondIndex]=temp;
			
		}
		
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]) {
				System.out.println(i);
				
			}
		}
	}

}
