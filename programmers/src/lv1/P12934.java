package lv1;

public class P12934 {

	public static void main(String[] args) {
		System.out.println(solution(121));
		
	}
    public static long solution(long n) {
        long answer = -1;
        
        for(long i=1;Math.sqrt(n)>=i;i++) {
        	if((i*i)==n) {
        		return (i+1)*(i+1);
        	}
        }
        
        return answer;
    }
}
