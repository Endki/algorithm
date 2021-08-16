package lv1;

public class P12947 {

	public static void main(String[] args) {
		System.out.println(solution(18));
		
		
	}
    public static boolean solution(int x) {
        
        String input=String.valueOf(x);
        
        int sum=0;
        for(int i=0;i<input.length();i++) {
        	sum+=input.charAt(i)-'0';
        }
        
        if(x%sum==0) {
        	return true;
        }

        return false;
    }
}
