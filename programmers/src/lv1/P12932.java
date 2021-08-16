package lv1;

import java.util.Arrays;

public class P12932 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(12345)));

	}
    public static int[] solution(long n) {
        int[] answer;
        String input=String.valueOf(n);
        answer=new int[input.length()];
        
        int index=0;
        for(int i=input.length()-1;i>-1;i--) {
        	answer[index++]=input.charAt(i)-'0';
        }
        
        return answer;
    }
}
