package lv1;

import java.util.Arrays;

public class P12933 {

	public static void main(String[] args) {
		System.out.println(solution(118372));

	}
    public static long solution(long n) {
        String input=String.valueOf(n);
        int[] arr=new int[input.length()];
        
        
        for(int i=0;i<input.length();i++) {
        	arr[i]=input.charAt(i)-'0';
        }
        
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>-1;i--) {
        	sb.append(arr[i]);
        }
        
        
        
        
        return Long.parseLong(sb.toString());
    }
}
