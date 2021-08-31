package lv2;

import java.util.StringTokenizer;

public class P12939 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public String solution(String s) {
    	StringTokenizer stz=new StringTokenizer(s);
        String answer = "";
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        while(stz.hasMoreTokens()) {
        	int value=Integer.parseInt(stz.nextToken());
        	
        	if(min>value) {
        		min=value;
        	}
        	if(max<value) {
        		max=value;
        	}
        	
        	
        }
        
        answer=min+" "+max;
        
        
        return answer;
    }
}
