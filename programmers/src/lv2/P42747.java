package lv2;

import java.util.Arrays;

public class P42747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int solution(int[] citations) {
        int answer = 0;
        
        
        Arrays.sort(citations);
        
        for(int i=0;i<citations.length;i++) {
        	int h=citations.length-i;
        	
        	
        	if(citations[i]>=h) {
        		return h;
        		
        	}
        	
        }
        
        return answer;
    }
}
