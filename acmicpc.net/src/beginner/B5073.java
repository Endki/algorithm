package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B5073 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stz=new StringTokenizer(br.readLine());
		int[] arr=new int[3];
		
		arr[0]=Integer.parseInt(stz.nextToken());
		arr[1]=Integer.parseInt(stz.nextToken());
		arr[2]=Integer.parseInt(stz.nextToken());
		
		
		Arrays.sort(arr);
		
		
		while((arr[0]+arr[1]+arr[2])!=0) {
			check(arr[0],arr[1],arr[2]);
			stz=new StringTokenizer(br.readLine());
			arr[0]=Integer.parseInt(stz.nextToken());
			arr[1]=Integer.parseInt(stz.nextToken());
			arr[2]=Integer.parseInt(stz.nextToken());
			
		}

	}
	
	public static void check(int a,int b,int c) {
		if(a==b && b==c) {
			System.out.println("Equilateral");
			return;
		}else if(a+b<=c) {
			System.out.println("Invalid");
			return;
		}
		else if(a==b || b==c || a==c) {
			System.out.println("Isosceles");
			return;
		}
		else {
			System.out.println("Scalene");
			return;
		}
		
		
		
		
	}

}
