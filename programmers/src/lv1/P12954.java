package lv1;

import java.util.Arrays;

public class P12954 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(-4, 2)));

		
	}
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        int temp=x;
        for(int i=0;i<n;i++) {
        	answer[i]=x;
        	x+=temp;
        	
        }
        return answer;
    }
}
