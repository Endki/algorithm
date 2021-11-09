package topInterviewQuestions.Strings;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));

	}

	static public int reverse(int x) {
		
		//처음에는 stack이랑 toString()써서 풀려다가
		//코드가 너무 지저분해져서 solution 확인함
		//코드 주석달아서 commit합니다.
		
        //return 할 변수 선언
		int rev = 0;
        
        //x가 0이 아니면 계속 반복
        while (x != 0) {
        	//x를 10으로 나눈 나머지를 담는 변수 pop선언
            int pop = x % 10;
            
            //x자체는 10으로 나눈 값으로 변경 - 이유는 int값에 담기 위해
            x /= 10;
            
            //int 값을 벗어나는 경우 0을 리턴
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            
            
            //아닌경우 다시 돌려놓는다
            rev = rev * 10 + pop;
        }
        return rev;
	}
}
