package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1120 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		
		String a=stz.nextToken();
		String b=stz.nextToken();
		
		int max=0;
		
		for(int i=0;i<b.length()-a.length()+1;i++) {
			String temp=b.substring(i,i+a.length());
			int count=0;
			
			
			for(int j=0;j<temp.length();j++) {
				if(a.charAt(j)==temp.charAt(j)) {
					count++;
				}
			}
			
			if(count>max) {
				max=count;
			}
			
		}
		System.out.println(a.length()-max);
	}

}
