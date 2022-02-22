package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B18258 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		Queue qu=new Queue(N);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<N;i++) {
			String[] input=br.readLine().split(" ");
			
			switch (input[0]) {
			case "push":
				qu.push(Integer.parseInt(input[1]));
				break;
			case "pop":
				sb.append(qu.pop()).append("\n");
				break;
			case "size":
				sb.append(qu.size()).append("\n");
				break;
			case "empty":
				sb.append(qu.empty()).append("\n");
				break;
			case "front":
				sb.append(qu.front()).append("\n");
				break;
			case "back":
				sb.append(qu.back()).append("\n");
				break;

			}
		}
		System.out.println(sb.toString());
		

	}
	
	static class Queue {
		int[] arr;
		int start=0;
		int end=0;
		
		Queue(int N){
			this.arr=new int[N+1];
		}
		
		void push(int X) {
			arr[end++]=X;
		}
		int pop() {
			if(start>=end) {
				return -1;
			}
			
			return arr[start++];
		}
		int size() {
			if(start>=end) {
				return 0;
			}
			
			return end-start;
		}
		
		int empty() {
			if(this.size()==0) {
				return 1;
			}
			return 0;
		}
		int front() {
			if(this.size()==0) {
				return -1;
			}
			return arr[start];
		}
		
		int back() {
			if(this.size()==0) {
				return -1;
			}
			return arr[end-1];
		}
	}

}
