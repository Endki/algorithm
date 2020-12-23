package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5586 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String k=br.readLine();
		int count=0;
		int count2=0;
		for(int i=0;i<k.length()-2;i++) {
			if(k.charAt(i)=='J') {
				if(k.charAt(i+1)=='O') {
					if(k.charAt(i+2)=='I') {
						count++;
					}
				}
			}
			
			if(k.charAt(i)=='I') {
				if(k.charAt(i+1)=='O') {
					if(k.charAt(i+2)=='I') {
						count2++;
					}
				}
			}
			
			
		}
		System.out.println(count);
		System.out.println(count2);
	}

}
