package beginner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B15552 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		String[] input;
		
		while(n>0) {
			input=br.readLine().split(" ");
			int a=Integer.parseInt(input[0]);
			int b=Integer.parseInt(input[1]);
			
			int sum=a+b;
			bw.write((int)sum+" ");
			bw.newLine();
			
			
			
			
			n--;
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
