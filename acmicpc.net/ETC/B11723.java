package ETC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B11723 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int m=Integer.parseInt(br.readLine());
		boolean[] arr=new boolean[21];
		Arrays.fill(arr, false);
		
		String[] input;
		
		while(m>0) {
			input=br.readLine().split(" ");
			if(input[0].equals("add")) {
				arr[Integer.parseInt(input[1])]=true;
			}else if(input[0].equals("remove")) {
				arr[Integer.parseInt(input[1])]=false;
			}else if(input[0].equals("check")) {
				if(arr[Integer.parseInt(input[1])]) {
//					System.out.println("1");
					bw.append('1');
					bw.newLine();
				}else {
//					System.out.println("0");
					bw.append('0');
					bw.newLine();
				}
			}else if(input[0].equals("toggle")) {
				if(arr[Integer.parseInt(input[1])]) {
					arr[Integer.parseInt(input[1])]=false;
				}else {
					arr[Integer.parseInt(input[1])]=true;
				}
			}else if(input[0].equals("all")) {
				Arrays.fill(arr, true);
			}else if(input[0].equals("empty")) {
				Arrays.fill(arr,false);
			}
			
			
			m--;
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
