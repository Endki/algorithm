package lv2;

public class P12980 {

	public static void main(String[] args) {
		System.out.println(solution(5000));

	}
    public static int solution(int n) {
        int ans = 0;

        
        while(n>0) {
        	ans+=n%2;
        	n/=2;
        }
        return ans;
    }
}
