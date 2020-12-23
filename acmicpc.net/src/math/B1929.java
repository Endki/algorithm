package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int[] arr=new int[1000001];
		
		for(int i=2;i<1000001;i++) {
			arr[i]=i;
		}
		for(int i=2;i<1000001;i++) {
			for(int j=2;i*j<1000001;j++) {
				if(arr[i]!=0) {
					arr[i*j]=0;
				}
			}
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(stz.nextToken());
		int m=Integer.parseInt(stz.nextToken());
		
		for(int i=n;i<=m;i++) {
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
