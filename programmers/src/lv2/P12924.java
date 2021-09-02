package lv2;

public class P12924 {

	public static void main(String[] args) {
		System.out.println(solution(15));

	}
    public static int solution(int n) {
        int answer = 1;
        
        int left=1 ;
        int right=1;
        
        while(true) {
        	if(left==n) {
        		break;
        	}
        	

        	int sum=0;
        	
        	for(int i=left;i<=right;i++) {
        		sum+=i;
        	}
        	
        	if(sum==n) {
        		answer++;
        		left++;
        	}
        	else if(sum>n) {
        		left++;
        	}
        	else if(sum<n) {
        		right++;
        	}
        }
        
        
        return answer;
    }
}
