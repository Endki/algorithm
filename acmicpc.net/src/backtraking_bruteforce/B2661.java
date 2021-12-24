package backtraking_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2661 {
		static int N;
		static boolean flag=false;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
				
		cob(1, "1");
	}
	
	public static void cob(int depth,String output) {
		
		if(flag) {
			return;
		}
		if(depth==N) {
			
			flag=true;
			System.out.println(output);
			
		}
		
		
		for(int i=1;i<=3;i++) {
			if(isCheck(output+i)) {
				cob(depth+1, output+i);
			}
		}		
	}
	
	public static boolean isCheck(String s) {
		int leng=s.length();
		
		int start=leng-1;
		int end=leng;
		
		
		for(int i=1;i<=leng/2;i++) {
			if(s.subSequence(start-i, end-i).equals(s.subSequence(start, end))) {
				return false;
			}
			start-=1;
		}
		
		return true;
		
	}
}
