package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B14910 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz=new StringTokenizer(br.readLine());
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		while(stz.hasMoreTokens()) {
			arr.add(Integer.parseInt(stz.nextToken()));
		}
		
		for(int i=0;i<arr.size()-1;i++) {
			
			if(arr.get(i)>arr.get(i+1)) {
				System.out.println("Bad");
				return;
			}
		}
		System.out.println("Good");
	}

}
