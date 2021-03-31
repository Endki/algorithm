package beginner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Bronze2 백준 1371 가장 많은 글자
public class B1371 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	
		String input;
		
		int[] alphabet=new int[26];
		
		while((input= br.readLine()) != null) {
			for(int i=0;i<input.length();i++) {
				if(input.charAt(i)>='a' && input.charAt(i)<='z') {
					alphabet[input.charAt(i)-'a']++;
				}
			}
			
		}
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<26;i++) {
			max=Integer.max(max, alphabet[i]);
		}
		
		
		for(int i=0;i<26;i++) {
			if(alphabet[i]==max) {
				bw.write('a'+i);
			}
		}
		bw.flush();

	}

}
