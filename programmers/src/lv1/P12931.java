package lv1;

public class P12931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(123));
	}

	
    public static int solution(int n) {
        int answer = 0;

        String convert=String.valueOf(n);
        
        for(int i=0;i<convert.length();i++) {
        	answer+=convert.charAt(i)-'0';
        }

        return answer;
    }
}
