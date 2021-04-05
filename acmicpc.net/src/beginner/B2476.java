package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2476 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		int N=Integer.parseInt(br.readLine());
		
		int[] maxArr=new int[N];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<N;i++) {
			StringTokenizer stz=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(stz.nextToken());
			int b=Integer.parseInt(stz.nextToken());
			int c=Integer.parseInt(stz.nextToken());
			
			if(a==b && b==c) {
				maxArr[i]+=10000;
				maxArr[i]+=1000*a;
			}else if(a==b || a==c || b==c) {
				maxArr[i]+=1000;
				if(a==b || a==c) {
					maxArr[i]+=100*a;
				}else {
					maxArr[i]+=100*b;
				}
			}else {
				maxArr[i]+=Math.max(Math.max(a, b), c)*100;
			}
			max=Math.max(max, maxArr[i]);
		}
		
		
		System.out.println(max);
	}

}
