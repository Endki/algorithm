package lv2;

public class P12899 {

	public static void main(String[] args) {
		
		System.out.println(solution(1));

	}
    public static String solution(int n) {
        String answer="";
        int temp=n;
        int remain=-1; 
        
        //https://minnnne.tistory.com/66
        
        while(temp!=0){
        	remain=temp%3;
        	temp=temp/3;
        	
        	if(remain==0) {
        		answer="4"+answer;
        		temp--;
        	}
        	else if(remain==1) {
        		answer="1"+answer;
        	}
        	else if(remain==2) {
        		answer="2"+answer;
        	}
        }
        
        return answer;
    }
}
