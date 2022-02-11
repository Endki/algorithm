package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5355 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			String[] input=br.readLine().split(" ");
			double k=Double.parseDouble(input[0]);
			for(int i=1;i<input.length;i++) {
				if(input[i].equals("@")) {
					k*=3;
				}else if(input[i].equals("%")) {
					k+=5;
				}else if(input[i].equals("#")) {
					k-=7;
				}
			}
			System.out.println(String.format("%.2f", k));
		}
		

	}

}
