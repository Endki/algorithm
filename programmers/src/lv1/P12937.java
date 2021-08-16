package lv1;

public class P12937 {

	public static void main(String[] args) {
		System.out.println(solution(0));

	}
    public static String solution(int num) {
        
    	if(num<0) {
    		num=num*-1;
    	}
    	
    	
        if(num%2==1) {
        	return "Odd";
        }
        
        return "Even";
    }
}
