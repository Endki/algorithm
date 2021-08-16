package lv1;

import java.util.Arrays;

public class P12940 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(2, 5)));

	}
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcdNM=gcd(n,m);
        
        answer[0]=gcdNM;
        
        answer[1]=(n*m)/gcdNM;
        
        return answer;
    }
    public static int gcd(int a,int b) {
    	if(b==0) {
    		return a;
    	}
    	
    	return gcd(b,a%b);
    }
}
