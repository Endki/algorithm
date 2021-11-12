package topInterviewQuestions.Strings;

public class ValidPalindrome {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
    public static boolean isPalindrome(String s) {
    	//다른 코드랑 비교해보면 확실히 replace 가 메모리랑 시간을 많이 잡아먹는다는 것을 확신할 수 있음
        String k=s.replace(" ", "");
        k=k.replaceAll("[^a-zA-Z0-9]", "");
        k=k.toLowerCase();
        
        
        for(int i=0;i<k.length()/2;i++) {
        	if(k.charAt(i)!=k.charAt((k.length()-1)-i)) {
        		return false;
        	}
        }
        
        
        return true;
    }
}
