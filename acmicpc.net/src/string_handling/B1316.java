package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1316 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		
		boolean[] check=new boolean[26];
		int t = Integer.parseInt(br.readLine());
		Arrays.fill(check, false);
		
		
		int count = t;
		while (t-- > 0) {
			String k = br.readLine();
			Arrays.fill(check, false);
			
			for(int i=1;i<k.length();i++) {
				if(k.charAt(i)!=k.charAt(i-1)) {
					if(check[k.charAt(i)-97]) {
						
						
						count--;
						break;
					}
					check[k.charAt(i-1)-97]=true;
				}
			}
			
		}
		System.out.println(count);
	}
}
