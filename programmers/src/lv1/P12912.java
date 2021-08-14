package lv1;

public class P12912 {

	public static void main(String[] args) {
		System.out.println(solution(-3, 5));

	}
    public static long solution(int a, int b) {
        long answer = 0;
        
        for(int i=Math.min(a, b);i<=Math.max(a, b);i++) {
        	answer+=i;
        }
        return answer;
    }
}
