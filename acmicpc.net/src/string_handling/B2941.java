package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String k=br.readLine();
		int count=0;
		
		for(int i=0;i<k.length();i++) {
			
			switch(k.charAt(i)) {
			case 'c':
				if(i+1<k.length()) {
				if(k.charAt(i+1)=='=') {
					i+=1;
					count++;
					break;
				}else if(k.charAt(i+1)=='-') {
					i+=1;
					count++;
					break;
				}
				}
				count++;
				break;
			case 'd':
				if(i+2<k.length()) {
					if(k.charAt(i+1)=='z' && k.charAt(i+2)=='=') {
						i+=2;
						count++;
						break;
					}
				}
				if(i+1<k.length()) {
					if(k.charAt(i+1)=='-') {
						i+=1;
						count++;
						break;
					}
				}
				count++;
				break;
				
			case 'l':
				if(i+1<k.length()) {
					if(k.charAt(i+1)=='j') {
						count++;
						i+=1;						
						break;
					}
				}
				count++;
				break;
			case 'n':
				if(i+1<k.length()) {
					if(k.charAt(i+1)=='j') {
						count++;
						i+=1;
						break;
					}
				}
				count++;
				break;
			case 's':
				if(i+1<k.length()) {
					if(k.charAt(i+1)=='=') {
						count++;
						i+=1;
						break;
					}
				}
				count++;
				break;
			case 'z':
				if(i+1<k.length()) {
					if(k.charAt(i+1)=='=') {
						count++;
						i+=1;

						break;
					}
				}
				count++;
				break;

			default:
				count++;
			}	
		}
		System.out.println(count);
	}

}
