package lv2;

import java.util.Arrays;

public class P12941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
    public static int solution(int []A, int []B)
    { 
    	
    	int answer=0;
    	Arrays.sort(A);
    	Arrays.sort(B);
    	
    	for(int i=0;i<A.length;i++) {
    		answer+=(A[i]*B[(A.length-1)-i]);
    	}
    	return answer;
    }
}
