package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10988 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=new String[2];
		
		input[0]=br.readLine();
		char[] arr=input[0].toCharArray();
		input[1]="";
		
		for(int i=input[0].length()-1;i>-1;i--) {
			input[1]+=arr[i];
		}
		
		if(input[0].equals(input[1])) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
