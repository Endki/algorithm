package lv1;

public class P12928 {

	public static void main(String[] args) {
		System.out.println(solution(12));

	}
    public static int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n;i++) {
        	if(n%i==0) {
        		answer+=i;
        	}
        }
        
        return answer;
    }
}
