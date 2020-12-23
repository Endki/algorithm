package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2920 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().split(" ");
		
		boolean asc=true;
		boolean des=true;
		
		
		for(int i=1;i<9;i++) {
			if(Integer.parseInt(input[i-1])==i) {
				
			}else {
				asc=false;
			}
			
			if(Integer.parseInt(input[i-1])==9-i) {
				
			}else {
				des=false;
			}
		}
		if(asc) {
			System.out.println("ascending");
		}else if(des) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
		
		
		

	}

}
