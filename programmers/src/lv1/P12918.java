package lv1;

public class P12918 {

	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
		
	}
    public static boolean solution(String s) {
        
        s=s.replaceAll("[1-9]", "0");
        
        
        
        if(s.length()==4 || s.length()==6) {
        	
        	for(int i=0;i<s.length();i++) {
        		if(s.charAt(i)!='0') {
        			return false;
        		}
        	}
        	return true;
        }  
        
        
        
        
        return false;
    }

}
