package lv1;

public class P12903 {

	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));

	}
    public static String solution(String s) {
        StringBuilder sb=new StringBuilder();
        
        int len=s.length();
        int lenEven=len/2;
        if(len%2==1) {
        	sb.append(s.charAt(lenEven));
        }else {
        	sb.append(s.charAt(lenEven-1));
        	sb.append(s.charAt(lenEven));
        }
        return sb.toString();
    }
}
