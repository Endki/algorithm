package lv1;

public class P12943 {

	public static void main(String[] args) {
		System.out.println(solution(626331));
	}
    public static int solution(int num) {
        
        int count=0;
        
        while(true) {
        	if(count==500) {
        		return -1;
        	}
        	if(num==1) {
        		return count;
        	}
        	
        	
        	if(num%2==1) {
        		num*=3;
        		num+=1;
        		count+=1;
        	}else {
        		num/=2;
        		count+=1;
        	}
        	
        }
        
        
    }
}
