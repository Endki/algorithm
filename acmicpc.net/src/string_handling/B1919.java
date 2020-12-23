package string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1919 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		
		String a=br.readLine();
		String b=br.readLine();
		
		int[] alpaA=new int[26];
		int[] alpaB=new int[26];
		
		for(int i=0;i<a.length();i++) {
			alpaA[a.charAt(i)-'a']++;
		}
		for(int i=0;i<b.length();i++) {
			alpaB[b.charAt(i)-'a']++;
		}
		int count=0;
		for(int i=0;i<26;i++) {
			count+=Math.abs(alpaA[i]-alpaB[i]);
		}
		System.out.println(count);
		
	}

}
