package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2947 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr=new int[6];
		StringTokenizer stz=new StringTokenizer(br.readLine());
		for(int i=1;i<=5;i++) {
			arr[i]=Integer.parseInt(stz.nextToken());
		}
		
		boolean flag=true;
		int temp=0;
		while(true) {
			flag=true;
			
			//12345가 아니면 flag를 false로 바꾼다.
			for(int i=1;i<=5;i++) {
				if(arr[i]!=i) {
					flag=false;
				}
			}
			if(flag) {
				break;
			}
			
			
			//조건 1
			if(arr[1]>arr[2]) {
				temp=arr[1];
				arr[1]=arr[2];
				arr[2]=temp;
				printArr(arr);
				
			}
			
			//조건 2
			if(arr[2]>arr[3]) {
				temp=arr[2];
				arr[2]=arr[3];
				arr[3]=temp;
				printArr(arr);
			}
			
			//조건 3
			if(arr[3]>arr[4]) {
				temp=arr[3];
				arr[3]=arr[4];
				arr[4]=temp;
				printArr(arr);
			}
			
			//조건 4
			if(arr[4]>arr[5]) {
				temp=arr[4];
				arr[4]=arr[5];
				arr[5]=temp;
				printArr(arr);
			}
			
		}

	}
	public static void printArr(int[] arr) {
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=5;i++) {
			sb.append(arr[i]+" ");
		}
		System.out.println(sb.toString());
	}

}
