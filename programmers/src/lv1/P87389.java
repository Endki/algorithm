package lv1;

public class P87389 {

	public static void main(String[] args) {
		System.out.println(10%3);

	}
    public int solution(int n) {
        int answer = 0;
        
        
        for(int i=1;i<=n;i++){
            if((n%i)==1){
                answer=i;
                break;
            }
        }
        return answer;
    }
}
