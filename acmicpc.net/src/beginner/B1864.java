package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1864 {
	static char[] arr= {'-','\1','(','@','?','>','&','%','/'};
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input="";
		
		while(true) {
			input=br.readLine();
			if(input.equals("#")) {
				return;
			}
			int leng=input.length();
			int count=0;
			int sum=0;
			for(int i=leng-1;i>-1;i--) {
				int sq=(int) Math.pow(8, count++);
				sum+=charToHex(input.charAt(i))*sq;
//				System.out.println(sum);
			}
			System.out.println(sum);
		}
			

	}
	public static int charToHex(char k) {
		int m=1;
		for(int i=0;i<arr.length;i++) {
			if(k==arr[i]) {
				m=i;
			}
		}
		if(m==8) {
			m=-1;
		}
		return m;
	}

}
