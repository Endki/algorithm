package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1759 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().split(" ");
		
		int a=Integer.parseInt(input[0]);
		int b=Integer.parseInt(input[1]);
		
		char[] arr=new char[b];
		boolean[] visit=new boolean[b];
		char[] mirror=new char[b];
		String k=br.readLine();
		k=k.replaceAll(" ", "");
		arr=k.toCharArray();
		Arrays.parallelSort(arr);
		backTraking(0, a, b, arr, visit,0);
	
	}

	static void backTraking(int count,int a,int b,char[] arr,boolean[] visit,int s) {
		if(count==a) {
			String ans="";
			int ja=0;
			int mo=0;
			for(int i=0;i<b;i++) {
				if(visit[i]) {
					ans+=arr[i];
					if(arr[i]=='a' ||arr[i]=='e'||arr[i]=='u'||arr[i]=='i'||arr[i]=='o') {
						mo++;
					}else {
						ja++;
					}
				}
			
				
			}
			if(mo>0 && ja>1) {
				System.out.println(ans);
				return;
			}
		}
		for(int i=s;i<b;i++) {
			if(!visit[i]) {
				visit[i]=true;
				backTraking(count+1, a, b, arr, visit,i+1);
				visit[i]=false;
			}
		}
	}
}
