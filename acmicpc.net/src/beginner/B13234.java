package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B13234 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String k=br.readLine();
		
		String[] arr=k.split(" ");
		
		
		
		if(arr[0].equals("true")) {
			if(arr[1].equals("AND")) {
				if(arr[2].equals("true")) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
			}
			//or
			
			else {
				if(arr[2].equals("true")) {
					System.out.println("true");
				}else {
					System.out.println("true");
				}
				
			}
		}
		
		
		if(arr[0].equals("false")) {
			if(arr[1].equals("AND")) {
				if(arr[2].equals("true")) {
					System.out.println("false");
				}else {
					System.out.println("false");
				}
			}
			//or
			
			else {
				if(arr[2].equals("true")) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
				
			}
		}
		
		
		
			
	}

}
