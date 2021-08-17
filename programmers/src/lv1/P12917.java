package lv1;

import java.util.Arrays;
import java.util.Collections;

public class P12917 {

	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));

	}
    public static String solution(String s) {
        
        Character[] arr=new Character[s.length()];
        
        for(int i=0;i<s.length();i++) {
        	arr[i]=s.charAt(i);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s.length();i++) {
        	sb.append(arr[i]);
        }
        
        
        return sb.toString();
    }

}
