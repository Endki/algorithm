package string_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B11365 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		while(true) {
			String m=br.readLine();
			if(m.equals("END")) {
				break;
			}
			
			
			for(int i=m.length()-1;i>-1;i--) {
				bw.append(m.charAt(i));
			}
			bw.newLine();
			
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
