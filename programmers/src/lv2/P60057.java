package lv2;

public class P60057 {

	public static void main(String[] args) {
		System.out.println(solution("aabbaccc"));

	}
    public static int solution(String s) {
    	//https://lkhlkh23.tistory.com/153
    	
    	if(s.length()==1) {
    		return 1;
    	}
    	int answer= 1001;
    	
    	// 반이상 할 필요가 없다.
    	for(int i=1;i<=s.length()/2;i++) {
    		String now, next="",result="";
    		int hit=1;
    		
    		for(int j=0;j<=s.length()/i;j++) {
    			
    			int startIndex=j*i; // 시작지점 
    			
    			int endIndex=i*(j+1)>s.length() ? s.length() : i * (j+1); // 끝나는 지점 : 전체 길이보다 끝나는 지점이 크면 전체 길이를, 아니면 i(j+1)을 리턴
    			
    			 now=next;
    			 next=s.substring(startIndex,endIndex);
    			 
    			 if(now.equals(next)) {
    				 hit++;
    			 }else {
    				 result+=(processHit(hit)+now);
    				 hit=1;
    			 }
    			 
    		}
    		result+=(processHit(hit)+next);
    		answer=Math.min(answer, result.length());
    	}
        return answer;
    }
    private static String processHit(int hit) {
        return hit > 1 ? String.valueOf(hit) : "";
    }
}
