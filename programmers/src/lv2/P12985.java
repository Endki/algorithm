package lv2;

public class P12985 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int solution(int n, int a, int b){
        int answer = 1;
        
//        https://velog.io/@hyeon930/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%98%88%EC%83%81-%EB%8C%80%EC%A7%84%ED%91%9C-Java
        
        // 핵심은 숫자가 작은쪽이 홀수이고 둘의 차이가 1 이어야 만난 것이다.
        // (현재번호+1) /2 가 다음 자신의 번호가 된다.
        
        
        int left = 0;
        int right = 0;
        
        if(a > b){
            left = b;
            right = a;
        } else {
            left = a;
            right = b;
        }
        
        while(true){
            if(left % 2 != 0 && right - left == 1){
                break;
            }
            
            left = (left + 1) / 2;
            right = (right + 1) / 2;
            answer++;
        }

        return answer;
    }
}
