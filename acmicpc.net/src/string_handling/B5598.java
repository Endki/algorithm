package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5598 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		char[] arr=br.readLine().toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			switch(arr[i]) {
			case 'A': arr[i]=(char)('Z'+1);
				break;
			case 'B':arr[i]=(char)('Z'+2);
			break;
			case 'C':arr[i]=(char)('Z'+3);
			break;
			}
			arr[i]=(char) (arr[i]-3);
			System.out.print(arr[i]);
		}
		
	}

}
