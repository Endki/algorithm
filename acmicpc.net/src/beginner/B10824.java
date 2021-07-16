package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10824 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().split(" ");
		
		String AB=input[0]+input[1];
		String CD=input[2]+input[3];
		
		long A=Long.parseLong(AB);
		long B=Long.parseLong(CD);
		
		
		long sum=A+B;
		System.out.println(sum);
	}

}
