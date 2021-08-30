package lv2;

public class P12911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static int solution(int n) {
        int answer = 0;
        //아이디어는 n을 이진수로 바꾼다음에 이진수로 바꾼 n+1 부터 비교하는 것
        //1의 숫자만 세주면 된다.
        
        int n_cnt=Integer.bitCount(n);
        //bitCount는 2진수 변환후 1만 세주는 함수
        
        int b_cnt=0;
        
        while(true) {
        	n++;
        	
        	b_cnt=Integer.bitCount(n);
        	
        	if(n_cnt==b_cnt) {
        		answer=n;
        		break;
        	}
        }
        
        
        return answer;
    }
}
